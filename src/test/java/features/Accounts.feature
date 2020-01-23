Feature: Application Accont 
	
@NormalTest 
Scenario: Home Page default login with default credentials 
	Given User is on landing page 
	When User login into applcation with username and password 
	Then Home Page is populated 
	And Cards are displayed "true" 
	
