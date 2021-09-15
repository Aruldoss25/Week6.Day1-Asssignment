Feature: Login functionality of Leaftaps application 
Background:
Given open the Chrome 
And open the URL 

Scenario Outline: : T1_Login Test cases 
	And give UserName as <UserName>
	And Password as <Password> 
	When Click Login 
	Then  display HomePage of LeafTaps 
		
Examples: 
		|UserName|Password|
		|'DemoSalesManager'|'crmsfa'|
		
		

