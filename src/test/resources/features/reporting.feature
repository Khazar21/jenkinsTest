Feature: Invoicing page

  Background:
    Given user is in invoicing page logged as a Manager

  Scenario: Bar Chart format is displayed by default
    When user go to Management Invoices page in reporting
    Then Bar char should be displayed by default

  Scenario: Pivot format is clickable and displays Pivot format on the screen
    When user go to Management Invoices page in reporting
    Then click Pivot format
    And Pivot for should be displayed on the screen

  Scenario: Pie Chart format is clickable and displays Pie Chart format on the screen
    When user go to Management Invoices page in reporting
    Then click Chart format
    And Chart format should be displayed on the screen

  Scenario:Aged partner balance page 'Aged Partner Balance' is displayed
    When user clicks on PDF Reports
    Then user clicks on Aged Partner Balance
    And system should display Aged Partner Balance text


  Scenario:Aged partner balance page 'Print' is displayed
    When user clicks on PDF Reports
    Then user clicks on Aged Partner Balance
    And system should display Print Button

  @reporting
  Scenario:Aged partner balance page 'Cancel' is displayed
    When user clicks on PDF Reports
    Then user clicks on Aged Partner Balance
    And system should display Cancel Button
