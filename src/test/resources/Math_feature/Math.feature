Feature: Math operations



  Scenario Outline: Can subtraction two numbers from one

    Given number is <number1>


    When I subtract <number2>

    Then I get <expected> result
    Examples:
      |number1|number2|expected|
      |3      |2      |1       |
      |100    |90     |10      |
      |2      |10     |-8      |

