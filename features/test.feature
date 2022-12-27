Feature: Get acees with correct credentials

  Scenario: Verify correct access
    Given I lauch the browser and open Serenity Login Page Demo
    And I type my credentials

  Scenario: Get all the roles availables and select a  role that was specified
    Given I open Serenity Login Page Demo
    And I acces as an Admin
    And I go to the admin section
    And I click on roles section
    Then I get the roles availables

  Scenario: Add a new user role
    Given I open Serenity Login Page
    And I acces as an Admin user
    And I switch to admin section
    And I select roles section
    Then I click on New Role
    And I add the userRole name and roleKey
    
    
    
    
    
