package com.choucair.auto.test;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class RoleTest {

	WebDriver driver;
	RolePage rolePage;

	@Given("^I open Serenity Login Page$")
	public void Given_I_open_Serenity_Login_Page() {
		rolePage = new RolePage(driver);
		rolePage.lauchDriver();
		rolePage.visit("https://demo.serenity.is/Account/Login/?ReturnUrl=%2F");
	}

	@And("^I acces as an Admin user$")
	public void I_acces_as_an_Admin_user() {
		rolePage.LoginPage();
	}

	@And("^I switch to admin section$")
	public void I_switch_to_admin_section() throws InterruptedException {
		Thread.sleep(2000);
		rolePage.SwitchToAdminSection();
	}

	@And("^I select roles section$")
	public void I_select_roles_section() {
		rolePage.GoToRolesSection();
	}

	@Then("^I click on New Role$")
	public void I_click_on_New_Role() {
		rolePage.ClickonNewRole();
	}

	@And("^I add the userRole name and roleKey$")
	public void I_add_the_userRole_name_and_roleKey() {
		rolePage.AddNewRole();
	}

//	@Then("^I save the changes$")
//	public void I_save_the_changes() {
//
//	}

}
