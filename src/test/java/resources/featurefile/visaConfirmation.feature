Feature: Visa confirmation test
  As a user I want to test visa confirmation

  @smoke @regression
  Scenario: Verify result 'You will not need a visa to come to the UK'
    Given I am on homepage
    When  I click on start button
    And   I select a Nationality 'Australia'
    And   I click on Continue button
    And   I select reason Tourism
    And   I click on Continue button
    Then  I verify Australia result 'You will not need a visa to come to the UK'

  @sanity @regression
  Scenario: verify result 'You need a visa to work in health and care'
  Given
    When  I click on start button
    And I select a Nationality 'Chile'
    And I click on Continue button
    And I select reason Work, academic visit or business
    And I click on Continue button
    And I select intendent to stay for longer than 6 months
    And I click on Continue button
    And I select have planning to work for Health and care professional
    And I click on Continue button
    Then I verify Chile result 'You need a visa to work in health and care'

  @regression
  Scenario: verify result 'You’ll need a visa to join your family or partner in the UK'
    Given I am on homepage
    When I click on start button
    And I select a Nationality 'Colombia'
    And I click on Continue button
    And I select reason Join partner or family for a long stay
    And I click on Continue button
    Then I verify Colombia result 'You may need a visa'




