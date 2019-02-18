   Scenario: two tabs
        Given there are available spots for scheduling
        And the team lead pull up all the available room for certain time
        And the user opens the application on a new tab
        When the user makes a reservation for the same time
        Then the user should not able able to finalize reservation on the first tab
