Feature: Login functionality




  Background: User opens browser and navigates to url
    Given the user opens the "edge" browser
    Then the user navigates to the "https://www.saucedemo.com/v1/"

  Scenario: Check if the user navigates to the login page
    Then the user should see username, password and login button
    And the user closes the browser

  Scenario Outline: Check if the login is successful
    Then the user performs login with "<username>" and "<password>"
    Then the user should be navigated to the product page
    And the user closes the browser
    Examples:
      |username                | password     |
      |standard_user           | secret_sauce |
      |performance_glitch_user | secret_sauce |
      |problem_user            | secret_sauce |

