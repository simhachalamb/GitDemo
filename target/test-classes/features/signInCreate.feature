Feature: AND Survey SignIn Page

Scenario: 
Given Initilizer to the browser
And Navigate to the "https://sa-qa.andishere.com/signUp" site
When Enter the details for First name and lastname and Email and password below data
|qashare*  | test1234*  | sdfghjk*.com 	  | akljfhuf*  | lkdjfhdjk* | .      |
|jkfdgfdg^ | iuiuyyuk^  | fkjhgfkdu@k  	  | ubnjhbiku^ | kjhiukhk^  | ,      |
|Simha	   | Bure       | simha@gmail.com | test1234   | test1234   | cybage |
Then select anything form industry drop down and product dropdown
Then select next button and back Button
Then app will close;