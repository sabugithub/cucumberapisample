Feature:Api tests using cucumber

  Scenario: First Api testing
    Given I have a new request
    When I get the request
    Then a status code of 200 is written
