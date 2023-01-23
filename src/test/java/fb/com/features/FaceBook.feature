@Smoke
Feature: Facebook Login function-Testcase Automation

Background:
Given User Launch "edge" Browser
And User naviagte Url "https://adactinhotelapp.com/"
And Verify land on loginPage

@Adactin-Tc101 @Sanity @login
Scenario: Adactin login with invalid details
And User Enter UserName "valid Username"
And User Enter PassWord "Invalid Password"
And User Click login button
Then User Verify Error Message "Invalid Login details or Your Password might have expired. Click here to reset your password"
And User Enter UserName "Invalid Username"
And User Enter PassWord "valid Password"
And User Click login button
Then User Verify Error Message "Invalid Login details or Your Password might have expired. Click here to reset your password"
And User Enter UserName "Invalid Username"
And User Enter PassWord "Invalid Password"
And User Click login button
Then User Verify Error Message "Invalid Login details or Your Password might have expired. Click here to reset your password"

@Adactin-Tc102 @Sanity
Scenario Outline: Adactin login with invalid details
And User Enter UserName <UserName>
And User Enter PassWord <Password>
And User Click login button
Then User Verify Error Message "Invalid Login details or Your Password might have expired."

Examples:
|UserName|Password|
|"Invalid UserName"|"Valid Password"|
|"Valid Username"|"Invaild Passwor"|
|"Invalid Username"|"Invaid Password"|


