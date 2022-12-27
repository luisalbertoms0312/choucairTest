package com.choucair.auto.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.choucair.auto.template.Template;

public class RolePage extends Template {

	By locatorBtnSubmit = By.id("LoginPanel0_LoginButton");
	By locatorAdminSection = By.xpath("//*[@id='s-sidebar']/div[1]/ul[1]/li[2]/a");
	By locatorRolesSection = By.xpath("//*[@id='nav_menu2_3']/li[1]/a/span");
	// The last section of div[X] means the 3 options in the inline div
	By locatorNewRole = By.xpath("//*[@id='GridDiv']/div[2]/div[2]/div/div/div[1]");

	By locatorRoleName = By.id("StartSharp_Administration_RoleDialog4_RoleName");
	By locatorRoleKey = By.id("StartSharp_Administration_RoleDialog4_RoleKey");

	By locatorSaveChanges = By.xpath("//*[@id=\"StartSharp_Administration_RoleDialog9_Toolbar\"]/div/div/div/div[1]");

	By locatorCloseModal = By.className("ui-dialog-titlebar-close");

	public RolePage(WebDriver driver) {
		super(driver);

	}

	public void LoginPage() {
		click(locatorBtnSubmit);

	}

	public void SwitchToAdminSection() {
		click(locatorAdminSection);
	}

	public void GoToRolesSection() {
		click(locatorRolesSection);
	}

	public void ClickonNewRole() {
		click(locatorNewRole);

	}

	public void AddNewRole() {
		Type("test", locatorRoleName);
		Type("test", locatorRoleKey);
	}
}
