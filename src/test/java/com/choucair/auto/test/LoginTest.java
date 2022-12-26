package com.choucair.auto.test;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class LoginTest {

	WebDriver driver;
	LoginPage loginPage;
	
	  @Given("^I lauch the browser and open Serenity Login Page Demo$")
	  public void Given_I_lauch_the_browser_and_open_Serenity_Login_Page_Demo() {
		 loginPage = new LoginPage(driver);
		 loginPage.lauchDriver();
		 loginPage.visit("https://demo.serenity.is/Account/Login/?ReturnUrl=%2F");
		  
	  }


//	    When Login section is dispalyed
	    @And("^I type my credentials$")
	    public void I_type_my_credentials(){
	    loginPage.LoginPage();
	    }
	    
	    
//	    And I type my password
//	    Then Click on Sign In
//	    And Dashbord page is displayed
//}
}
