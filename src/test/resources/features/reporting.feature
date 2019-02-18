Feature: Invoicing Page
  Background:
    Given user is in invoicing page logged as a Manager
    Then system should display Customer Invoices page

  @wip
  Scenario: kanban button functionality
    When user clicks on kanban view button
    Then invoices should be listed as kanban

  @wip
  Scenario: kanban button functionality
    When user clicks on kanban view button
    Then invoices should be listed as kanban