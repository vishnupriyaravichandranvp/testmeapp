Feature: User wants to select product and procedd with checkout

Scenario: Select product and checkout

Given user login to TestMeApp
When user selects products as "Laptop"
When user click on add to cart
When User clink in cart link
When user provide quantity as 1
When user proceed checkout
Then verify the review and payment page
