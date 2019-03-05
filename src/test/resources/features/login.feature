Feature: Login
  @wip
  Scenario Outline: Positive Login functionality

    Given user is in sign in page
    When user inputs valid "<username>" and "<password>"
    Then System displays the page with title "#Inbox - Odoo"

    Examples:
      | username                        | password    |
      | Lunch_Invoicing_User@info.com   | LD686gfX26  |
      | Lunch_InvoicingManager@info.com | LD686gfX22  |
      | in@info.com                     | alsfuh7we67 |
      | inm2@info.com                   | alsfuh7we68 |
      | inm5@info.com                   | trt332qWW12 |
      | inm6@info.com                   | trt332qWW13 |
