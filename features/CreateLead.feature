Feature: To create a Lead in the LeafTaps application 




Scenario Outline: T1_Create Lead 
	And give UserName as <UserName> 
	And Password as <Password> 
	When Click Login 
	When click on 'CRM/SFA' link 
	When click on 'Leads' link 
	When click on 'Create Lead' link 
	Given give Company name as <Company Name> 
	Given give First name as <First Name> 
	Given give Last name as <LastName> 
	When Click createLead 
	
	
	Examples: 
		|UserName|Password|Company Name|First Name|LastName|
		|'DemoSalesManager'|'crmsfa'|'Infy'|'Arul'|'Doss'|
		
		
		
		
 