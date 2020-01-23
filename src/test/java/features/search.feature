Feature: Search and place the order for vegetables 

@SeleniumTest 
Scenario: Search for items and validate the results 
	Given User is on GreenKart landing page 
	When User searched for "Cucumber" vegetable 
	Then "Cucumber" results are displayed 
	
@SeleniumTest1
Scenario Outline: Search for items and then move to checkout page 
	Given User is on GreenKart landing page 
	When User searched for <vegetable> vegetables 
	And Added items to cart 
	And User proceeded to Checkout page for purchase 
	Then verify selected <vegetable> items are dislayed in Check out page
	
Examples:
|vegetable|
|Brinjal|
|Carrot|
