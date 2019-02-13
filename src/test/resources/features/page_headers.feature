Feature: Page Headers

  @smoke
  Scenario Outline: Invoicing Page Headers

    Given user is in sign in page
    When user logs in as a manager
    And  clicks on Invoicing
    And  user clicks on "<modules>"
    Then System should display "<headers>" for each module

    Examples:
      | modules             | headers               |
      | customerInvoices    | Customer Invoices     |
      | customerCreditNotes | Customer Credit Notes |
      | salesPayments       | Payments              |
      | customers           | Customers             |
      | sellableProducts    | Sellable Products     |
      | vendorBills         | Vendor Bills          |
      | invoices            | Invoices Analysis     |
      | taxes               | Taxes                 |
      | fiscalPositions     | Fiscal Positions      |
      | bankAccounts        | Bank Accounts         |
      | journals            | Journals              |
      | paymentTerms        | Payment Terms         |
      | paymentAcquirers    | Payment Acquirers     |
