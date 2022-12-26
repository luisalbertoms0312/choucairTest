package com.choucair.auto.test;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class checkTest {


	private WebDriver driver;
	
	By locatorBtnSubmit = By.id("LoginPanel0_LoginButton");
	By locatorAdminSection = By.xpath("//*[@id='s-sidebar']/div[1]/ul[1]/li[2]/a");
	By locatorRolesSection = By.xpath("//*[@id='nav_menu2_3']/li[1]/a/span");
	By locatorRoleKey = By.xpath("//*[@id='GridDiv']/div[3]/div[5]/div/div/div[3]");
	
	
	
	
	@Before
	public void launchBrowser() {
		System.out.println("Start the Test");
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://demo.serenity.is/Account/Login/?ReturnUrl=%2F";
		driver.get(url);
	}
	
	@After
	public void tearDown() {
		
	}
	
	
	@Test
	public void chooseItems() throws InterruptedException {
		
		WebElement loginBtn = driver.findElement(locatorBtnSubmit);
		loginBtn.click();
		
		Thread.sleep(2000);
		
		WebElement admin = driver.findElement(locatorAdminSection);
		admin.click();
		Thread.sleep(2000);
		
		WebElement roleSection = driver.findElement(locatorRolesSection);
		roleSection.click();
		Thread.sleep(2000);
		
		List<WebElement> roles = driver.findElements(locatorRoleKey);
		for (int i = 0; i < roles.size(); i++) {
			String elements = roles.get(i).getText();
			System.out.println(elements);

			if (elements.contains("WorkLogCustomers")) {

				driver.findElements(By.xpath("//div[3]/a")).get(i).click();

			}
		}
	
		
		
		
	}
	
	
}
