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


Scenario: Search box default value
Then user should see Search... keyword in a searchbox by default

Scenario: page's default invoices view
Then user should see invoices listed as list by default
