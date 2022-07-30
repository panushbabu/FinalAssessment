Feature: Search Pace and validate

  Scenario Outline: validating Pace result
  Given Open website
  When I search <Product> search option
  Then I verify the results of <Product> displayed
  
  Examples:
      |Product|
        |Pace|