Feature: Application Login 

@SmokeTest 
Scenario: Home Page default login with default credentials 
	Given User is on landing page 
	When User login into applcation with username and password 
	Then Home Page is populated 
	And Cards are displayed "true" 
	
@SmokeTest 
Scenario: Home Page first person login 
	Given User is on landing page 
	When User login into applcation with "Jin" username and password "hdksjfhsd" 
	Then Home Page is populated 
	And Cards are displayed "false" 
	
@RegressionTest
Scenario: Home Page second person login 
	Given User is on landing page 
	When User login into applcation with "julai" username and password "324324324" 
	Then Home Page is populated 
	And Cards are displayed "true" 
	
@RegressionTest	
Scenario: Home Page execution from Dataable concept 
	Given User is on landing page 
	When User signup  into applcation with following details 
		|madhu|dfjfsf|bangalore@@gmail.com|bangalore|03485|
	Then Home Page is populated 
	And Cards are displayed "true" 
	
@SmokeTest
Scenario Outline: Home Page from parameterization 
	Given User is on landing page 
	When User login in to applcation with parameter <username> username and password <password> 
	Then Home Page is populated 
	And Cards are displayed "true" 
	
	Examples: 
		|username   |password|
		|user1    |pwd1|
		|user2	  |pwd2|
		|user3	  |pwd3|

		
