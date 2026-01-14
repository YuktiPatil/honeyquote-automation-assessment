Feature: Signup and Login Flow

  Scenario: User signs up, logs in and logs out successfully
    Given user launches the application
    When user signs up with valid details
    Then account should be created successfully
    When user continues to home page
    When user logs out
    And user logs in with same credentials
    Then user should be logged in successfully
    And user logs out again