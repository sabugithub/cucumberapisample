
Feature: scenario Outline example
  An example of using scenario Outline
@num
  Scenario Outline: Add two numbers together
    Given I have <FirstNum> and <secondNum>
    Then total should be <Total>

    Examples:
      | FirstNum | secondNum | Total |
      | 2        | 3         | 5     |
      | 4        | 2         | 6     |

