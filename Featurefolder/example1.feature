Feature: Login Test
- Description(optional) :Registered user can login into TestMeApp using proper crendentical
- Pre-Requiste :Registration module should be completed


Example Mapping:
Business Rule1 : Signin Link
Acceptance Criteria : Register user should be logged in success to TestMeApp for search product

Example : John Wish to purchase an item from testmeApp,he should login first

Scenario: Login with valid credentials
Given user launch chrome browser And enter TestMeApp URL
When user entered username in username field
When user entered password in password field
When user clicks on OK Button
Then verify result

