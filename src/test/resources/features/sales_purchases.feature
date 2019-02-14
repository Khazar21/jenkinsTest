Feature: Invoicing Page
	Background:
		Given user is in invoicing page logged as a Manager
		Then system should display Customer Invoices page
		#Khazar

	Scenario: Search box default value
		Then user should see Search... keyword in a searchbox by default

	Scenario: page's default invoices view
		Then user should see invoices listed as list by default
	@wip
	Scenario: kanban button functionality
		When user clicks on kanban view button
	    Then invoices should be listed as kanban



        #Bedia



	    #Aysegul



	    #Hayriyye