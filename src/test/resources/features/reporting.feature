Feature: Invoicing Page
  Background:
    Given user is in invoicing page logged as a Manager
    Then system should display Customer Invoices page
		#Khazar

  Scenario: Search box default value
    Then user should see Search... keyword in a searchbox by default
   Scenario: two tabs
        Given there are available spots for scheduling
        And the team lead pull up all the available room for certain time
        And the user opens the application on a new tab
        When the user makes a reservation for the same time
        Then the user should not able able to finalize reservation on the first tab
