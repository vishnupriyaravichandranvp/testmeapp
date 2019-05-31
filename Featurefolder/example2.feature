Feature: purchase product from Testme app


Background: Welcome testmeApp

@category
Scenario:search product by category
Given user login
When user selects product using category
Then verify the list of product And close application

@sub-category
Scenario:search product by sub-category
Given user login
When user selects product using sub-category
Then verify the list of product And close application


@Product-name
Scenario:search product by category
Given user login
When user selects product using category
Then verify the list of product And close application