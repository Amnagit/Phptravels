@SmokeTest
Feature: Validation login function in phptravels
Scenario: Enter valid credentials and submit LOGIN button
Given user open browser and go to the php travels home page
And user able to click on the Home button on the top left and verify page title
Then user enter a valid username and password
Then user able to click login button
And user click on the home button
Then user select destination as Dubai, United Arab Emirates
Then user check-in next month date 18th and check out next month 27th
And user able to select adult 2 and child 1 button
Then user able to click SEARCH button
Then user able to Print all price in descending order
Then user select teh second hotel from teh list by clicking the DETAILS button
And user able to click on see price and date button on the top right and select the first room and remember the price
When user able to click BOOK NOW button and checkout
Then on teh next page verify Total Amount is greater than Room price