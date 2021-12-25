Feature: google search

Scenario Outline: simple search

Given I am on google homePage 

When I enter search "<term>"

And I click on google search button 

Then I receive related search results

Examples:
|term|
|Quality Assurance|
|Software Testing| 