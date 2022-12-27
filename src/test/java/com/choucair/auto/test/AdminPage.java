package com.choucair.auto.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import com.choucair.auto.template.Template;

public class AdminPage extends Template {
	private WebDriver driver;
	
	By locatorBtnSubmit = By.id("LoginPanel0_LoginButton");
	By locatorAdminSection = By.xpath("//*[@id='s-sidebar']/div[1]/ul[1]/li[2]/a");
	By locatorRolesSection = By.xpath("//*[@id='nav_menu2_3']/li[1]/a/span");
	By locatorRoleKey = By.xpath("//*[@id='GridDiv']/div[3]/div[5]/div/div/div[3]");

	public AdminPage(WebDriver driver) {
		super(driver);

	}

	public void LoginPage() {
//		Type("admin", locatorUserName);
//		Type("serenity", locatorPass);
		click(locatorBtnSubmit);

	}

	public void SwitchToAdminSection() {
		click(locatorAdminSection);
	}

	public void GoToRolesSection() {
		click(locatorRolesSection);
	}

	public void GetRoleKey() {

		List<WebElement> roles = this.findElements(locatorRoleKey);
		for (int i = 0; i < roles.size(); i++) {
			String elements = roles.get(i).getText();
			System.out.println(elements);

			if (elements.contains("WorkLogManagers")) {

				this.findElements(By.xpath("//div[3]/a")).get(i).click();
				break;
			}
		}
	}
	
	
}
