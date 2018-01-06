@smoke
Feature: Using dataTable


  Scenario:data table example
    Given I have the following details
      | name  | address   | id   |
      | sabu  | thajudeen | 1234 |
      | saira | mol       | 4567 |


  #can only use maps for a two column table
  Scenario: data table using maps
    Given I have this
      | Username | Password |
      | sabu     | thaj     |
      | sabu2    | thaj2    |
      | sabu3    | thaj3    |
      | sabu4    | thaj4    |
      | sabu5    | thaj5    |



