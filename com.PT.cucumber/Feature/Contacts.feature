Feature: Free CRM Create Contacts

  Scenario Outline: Free CRM Create a new contact scenario
    Given User is already on Login Page
    When user enters "<username>" and "<password>"
    And user clicks on login button
    Then user is on home page
    When user moves to new contacts page
    And user enters contact details "<firstname>" and "<lastname>" and "<position>"
    Then Close the browser

    Examples: 
    
      | username | password | firstname | lastname | position |
      | valar955 | valar955 | jerry     | pot      | Manager  |
      | valar955 | valar955 | Robin     | loxley   | Manager  |
