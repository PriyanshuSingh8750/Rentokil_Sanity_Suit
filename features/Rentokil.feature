Feature: myRentokil page load time


Scenario Outline: To verify if the user is able login and navigate to the all the page to check the page load time for each screen


	Given I launch a Live web application
	Then I have enter user details for login in Live
	And I need to select the country from dropdown list
	Then I click on Login as me in live URL
	And I click on myService button now
	Then I click on "<site name>" to see details now in live
	And I click on Visit from menu now
	Then I click on Visit details from menu now
	#And I click on jobs from menu now
	Then I click on pest activity from menu now
	And I click on Recommendations from menu now
	Then I click on Recommendations details from menu now
	And I click on tasks from menu now
	Then I click on preparation from menu now
	And I click on site plans from menu now
	Then I click on documents from menu now
	And I click on accounts from menu now
    Then I click on pest analysis from menu now
	And I click on reports from menu now
	Then I click on site collection from menu now
	Then I logout
	
	
	Examples:
	| site name |							Open recommendations |            
	| (L3) Quickbake Bakery Ltd, First Avenue | 	26 					|