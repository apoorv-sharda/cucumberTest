Feature: Use the website to find restaraunts so that I can order food as a hungry customer I want to be able to find restaurants in my area

Scenario: Search for restaraunts in an area 

Given I want food in area
When I search for restaraunts
Then I should see some restaraunts in area 

Scenario: Sort the restaraunts by customer rating

Given when the user is on the area page
When the user selects sort by customer rating
Then the user should see the list based on ratings

Scenario: Let the user change the area code

Given the user enters a wrong area code
When user wants to change location
Then the user should be directed back to the homepage again