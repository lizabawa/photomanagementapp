Feature: Rest API functionalities

  Scenario: User able to access public endpoints
    Given A valid public endpoint
    When I say hello
    Then Hello is shown