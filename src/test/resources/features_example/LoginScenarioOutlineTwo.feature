Feature: Login functionality

  Scenario Outline: Login with different valid credentials
    Given the user is on the login page
    When the user enters valid username "<username>" and password "<password>"
    Then the user should see the message "<message>"


    Examples:

      | username        | password        | message             |
      | validusername   | validpassword   | Login successful    |
      | invalidusername | validpassword   | Invalid username    |
      | validusername   | invalidpassword | Invalid password    |
      | invalidusername | invalidpassword | Invalid credentials |