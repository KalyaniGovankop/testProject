Feature: fetching User Details
 @k1
Scenario: testing the get call for User Details
 
Given url 'https://reqres.in/api/users/2'
When method GET
Then status 206