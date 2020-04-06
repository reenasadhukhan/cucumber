Feature: MyAccount-Login Feature
  Description: This feature will test a Login feature

  #Simple login without parameters
  Scenario Outline: Log-in with valid username and password
  
    Given Open the browser   
    When Enter the URL "<url>
    Then User verifies the object on page
    |FirstName|LastName|Phone|Email|Address
   ||||

    Examples: 
      | url                  |
      |http://newtours.demoaut.com/ |
