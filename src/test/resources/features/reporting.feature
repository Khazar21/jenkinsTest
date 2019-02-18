Feature: Invoicing Page
  Background:
    Given user is in invoicing page logged as a Manager
    Then system should display Customer Invoices page
		#Khazar

  Scenario: Search box default value
    Then user should see Search... keyword in a searchbox by default