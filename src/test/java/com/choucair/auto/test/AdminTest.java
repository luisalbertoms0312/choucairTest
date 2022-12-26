package com.choucair.auto.test;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AdminTest {

	WebDriver driver;
	AdminPage adminPage;
	
	By locatorRoleKey = By.xpath("//div[3]/a");

	@Given("^I open Serenity Login Page Demo$")
	public void Given_I_lauch_the_browser_and_open_Serenity_Login_Page_Demo() {
		adminPage = new AdminPage(driver);
		adminPage.lauchDriver();
		adminPage.visit("https://demo.serenity.is/Account/Login/?ReturnUrl=%2F");

	}

//	    When Login section is dispalyed
	@And("^I acces as an Admin$")
	public void I_type_my_credentials() {
		adminPage.LoginPage();
	}

	@And("^I go to the admin section$")
	public void I_go_to_the_admin_section() throws InterruptedException {
		Thread.sleep(2000);

		adminPage.SwitchToAdminSection();
	}

	@And("^I click on roles section$")
	public void I_click_on_roles_section() {
		adminPage.GoToRolesSection();
	}

	@Then("^I get the roles availables$")

	public void I_get_the_roles_availables() throws InterruptedException {
		Thread.sleep(2000);
		adminPage.GetRoleKey();
	

	}
}
