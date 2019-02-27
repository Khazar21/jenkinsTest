Feature: Invoicing Page
	Background:
		Given user is in invoicing page logged as a Manager

		#Khazar

	Scenario: Search box default value
		Then system should display Customer Invoices page
		Then user should see Search... keyword in a searchbox by default


	Scenario: page's default invoices view
		Then system should display Customer Invoices page
		Then user should see invoices listed as list by default


	Scenario: kanban button functionality
		Then system should display Customer Invoices page
		When user clicks on kanban view button
	    Then invoices should be listed as kanban

	    #Aysegul

	Scenario: Search box by default in vendors page.
		Given user clicks on Master Data
		When user clicks on Vendors button
		Then user should see Search... keyword is displayed

	Scenario: Vendors page, Create button is clickable.
			Given user clicks on Master Data
			When user clicks on Vendors button
			Then user should see Create button is clickable


	Scenario:Vendors page, Import button is clickable.
		Given user clicks on Master Data
		When user clicks on Vendors button
		Then user should see Import button is clickable


	Scenario: Kanban format button invoices is displayed.
		Given user clicks on Master Data
		When user clicks on Vendors button
		Then user should see Kanban format button invoices is displayed


	Scenario:Vendors are listed as List format type by default.
		Given user clicks on Master Data
		When user clicks on Vendors button
		Then user should see Vendors are listed as List format type by default.


	Scenario:Vendors can create an account
		Given user clicks on Master Data
		When user clicks on Vendors button
		Then user should be create an account


	Scenario:Search box by default in Purchasable Products page
		Given user clicks on Master Data
		When user clicks on Purchasable Products button
		Then user should see Search... keyword is displayed


	Scenario: List of the items sorted by ascending by clicking List format button,
		Given user clicks on Master Data
		When user clicks on Purchasable Products button
		Then user should see Purchasable Products are listed as List format type by default.


	Scenario: Product's pictures can appear clicking Kanban format button by vendors
		Given user clicks on Master Data
		When user clicks on Purchasable Products button
		Then user should see Product's pictures can appear clicking Kanban format button

	Scenario: Load File format button clicking , vendors can be import.
		Given user clicks on Master Data
		When user clicks on Purchasable Products button
		Then user should see Purchasable Products are clicking Load File can be import










