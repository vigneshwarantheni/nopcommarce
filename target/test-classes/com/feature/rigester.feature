Feature: user rigister on nopcommerce

Scenario: check rigester function
Given user navigate to nopcommerce
When user navigate to registerpage
And user select the gender
And user fillup firstname
And user fillup lastname
And user select the dateofbirth
And user fill email
And user checknewsletter
And user fillup password
Then user click and complete register 
