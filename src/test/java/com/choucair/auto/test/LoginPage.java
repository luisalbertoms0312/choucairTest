package com.choucair.auto.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.choucair.auto.template.Template;

public class LoginPage extends Template {

	By locatorLoginTitle = By.className("text-center");
	
	By locatorUserName = By.id("LoginPanel0_Username");
	By locatorPass = By.id("LoginPanel0_Password");
	By locatorBtnSubmit = By.id("LoginPanel0_LoginButton");
	
	By locatorStarSharp = By.className("s-sidebar-group-title");


	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public boolean LoginPageIsDisplayed() {
		return isDisplayed(locatorLoginTitle);
	}

	public void LoginPage() {
//		Type("admin", locatorUserName);
//		Type("serenity", locatorPass);
		click(locatorBtnSubmit);

	}

	public boolean HomePageDisplayed() {
		return isDisplayed(locatorStarSharp);
	}

}
