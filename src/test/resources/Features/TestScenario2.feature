#Author: ramyayellappa8@gmail.com
#Description: Access a Product via Search
#Feature: Verify search functionality
Feature: Access a Product via Search

  Scenario Outline: Search and Verify Product
    Given User is on home page
    When User should type MacBook in the search bar
    And User able to change the search category to Computers Tablets & Networking
    And Click on Search
    Then Verify that the page loads completely
