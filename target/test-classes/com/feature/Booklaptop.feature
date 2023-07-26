Feature: Book a laptop in nopcommerce

Scenario: user book a laptop
Given user navigate to the nopcommerce
When user given credincial for login
And user navigate to the laptop page
And user add a laptop in cart
Then user navigate to the cart page


Scenario: user check deatils of order
Given user select gift wraping
When user agree to terms
Then user click checkout for conformation


Scenario: user fill up the address
Given user fill first name
When user enter the last name
And user fill email
And user select country
And user enter city
And user enters the address
And user fill zip code
And  mobile number
And user confrim the details
And user select shipping method
And user select payment method
And user check order details
Then user confrim the order