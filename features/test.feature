Feature: Get acees with correct credentials

  Scenario: Verify correct access
    Given I lauch the browser and open Serenity Login Page Demo
    #When Login section is dispalyed
    And I type my credentials

  #And I type my password
  #Then Click on Sign In
  #And Dashbord page is displayed
  
  Scenario: Verify admin section
    #When Login section is dispalyed
    Given I open Serenity Login Page Demo
    #When Login section is dispalyed
    And I acces as an Admin
    And I go to the admin section
    And I click on roles section
    Then I get the roles availables 