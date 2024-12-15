Feature: Create amazon account

#  Background:
#    Given I am on the amazon web page
#    Then I will click on signIn button
#    And I will click on Create amazon account button


  Scenario Outline: Succesfully create an acccount with valid details

    Given I am on the amazon web page
    When I will click on signIn button
    Then I will click on Create amazon account button
    And I will enter username as value for your name field
    And I will enter valid "<inputType>" as input
    And I will enter password as a valid password value for password field
    And I will re-enter the password as a valid password value
    Then I click on continue button

    Examples:
      | inputType         |
      | johnDoe@gmail.com |
      | 0303313333        |


#  Scenario Outline: Succesfully create acccount with valid email
#    When I will enter "<FullName>" as value for your name field
#    And I will enter "<Email>" as value for email field
#    And I will enter "<password>" as a valid password value for password field
#    And I will re-enter "<re-enter>" as a valid password value for re-enter password field
#    Then I click on verify email button
#    And I should be navigated to OPT page
#    And I enter the valid OTP
#    Then I click on create your amazon account button
#    And I should see the amazon dashboard
#
#    Examples:
#      | FullName | Email          | password     | re-enter     |
#      | JohnDoe  | John@gmail.com | John@123@123 | John@123@123 |

#  Scenario: Succesfully create acccount with valid phone number
#    And I will enter "John" as value for your name field
#    And I will enter "(555) 555-1234" as value for phone number field
#    And I will enter "John@@!@#" as a valid password value for password field
#    And I will re-enter "John@@!@#" as a valid password value for re-enter password field
#    Then I click on verify mobile number button
#    And I should be navigated to OPT page
#    And I enter the valid OTP
#    Then I click on create your amazon account button
#    And I should see the amazon dashboard


#Feature: Create amazon account
#
#  Scenario: Successfully create with valid email
#    Given The user is on amazon home page
#    When The user click on the sign in button
#    And the user click on the create your account button
#    And The user enter "John" as value for your name field
#    And The user enter "JohnDoe@gmail.com" as a value for email field
#    And The user enter "John123@" as a valid password value for password field
#    And The user re-enter "John123@" as a valid password value for re-enter password field
#    Then The user click on verify email button
#    And The user should be navigated to OTP page
#    And The user enter the valid OTP
#    And The user click on create your amazon account button
#    And The user should see the amazon dashboard


#  Scenario: Successfully create with valid phone number
#    Given The user is on amazon home page
#    When The user click on the sign in button
#    And the user click on the create your account button
#    And The user enter "John" as value for your name field
#    And The user enter "(555) 555-1234" as a value for phone number field
#    And The user enter "John123@" as a valid password value for password field
#    And The user re-enter "John123@" as a valid password value for re-enter password field
#    Then The user click on verify phone number button
#    And The user should be navigated to OTP page
#    And The user enter the valid OTP
#    And The user click on create your amazon account button
#    And The user should see the amazon dashboard

