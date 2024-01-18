#Author: ramyayellappa8@gmail.com
#Description: Access a Product via category after applying multiple filters
#Feature: Access a Product via category after applying multiple filters



@SmokeFeature
Feature: Feature to test the particular filter search in Ebay application

  @smoketest
  Scenario Outline: Access a Product via category after applying multiple filters    
    Given User is on Ebay home page
    When Navigate to search by category Electronics,Cell Phones & accessories
    And  User able to add filters Condition, Price and Item location
    Then User able to Verify that the filter tags are applied
