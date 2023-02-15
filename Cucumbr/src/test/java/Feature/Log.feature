Feature: Title of your feature
  I want to use this template for my feature file

  @smoke
  Scenario Outline: Login to the web
    Given user is on the login page
    When user enters <user> and <pass>
    Then home page is populated

    Examples: 
      | user    | pass  |
      | vasanth | 12345 |
