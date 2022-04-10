#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition TemplateBDD.CucumberBDD.

Feature: Feature to test Sign Up Page functionality
	  
   Scenario: Check Sign Up Page with valid data
    Given User navigates to techalistic website
    And User enters firstname "<firstname>"
		And User enters lastname "<lastname>"
		And User enters gender "<gender>"
		And User enters YOE "<YOE>"
		And user clicks download link
		Then user navigated to github
		

    #Then User is navigated to GitHub




    Examples: 
      | firstname  | lastname | gender  | YOE | 
      | Deon       | Anthony  | Male    | 7   |
