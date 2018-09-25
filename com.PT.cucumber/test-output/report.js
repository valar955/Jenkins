$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/ELCOT/git/Jenkins/com.PT.cucumber/Feature/Contacts.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Create Contacts",
  "description": "",
  "id": "free-crm-create-contacts",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Free CRM Create a new contact scenario",
  "description": "",
  "id": "free-crm-create-contacts;free-crm-create-a-new-contact-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user moves to new contacts page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user enters contact details \"\u003cfirstname\u003e\" and \"\u003clastname\u003e\" and \"\u003cposition\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "free-crm-create-contacts;free-crm-create-a-new-contact-scenario;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "firstname",
        "lastname",
        "position"
      ],
      "line": 14,
      "id": "free-crm-create-contacts;free-crm-create-a-new-contact-scenario;;1"
    },
    {
      "cells": [
        "valar955",
        "valar955",
        "jerry",
        "pot",
        "Manager"
      ],
      "line": 15,
      "id": "free-crm-create-contacts;free-crm-create-a-new-contact-scenario;;2"
    },
    {
      "cells": [
        "valar955",
        "valar955",
        "Robin",
        "loxley",
        "Manager"
      ],
      "line": 16,
      "id": "free-crm-create-contacts;free-crm-create-a-new-contact-scenario;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 15,
  "name": "Free CRM Create a new contact scenario",
  "description": "",
  "id": "free-crm-create-contacts;free-crm-create-a-new-contact-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enters \"valar955\" and \"valar955\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user moves to new contacts page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user enters contact details \"jerry\" and \"pot\" and \"Manager\"",
  "matchedColumns": [
    2,
    3,
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "ContactsStepdef.user_is_already_on_Login_Page()"
});
formatter.result({
  "duration": 23785337150,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "valar955",
      "offset": 13
    },
    {
      "val": "valar955",
      "offset": 28
    }
  ],
  "location": "ContactsStepdef.user_enters_and(String,String)"
});
formatter.result({
  "duration": 1570074651,
  "status": "passed"
});
formatter.match({
  "location": "ContactsStepdef.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 19468012092,
  "status": "passed"
});
formatter.match({
  "location": "ContactsStepdef.user_is_on_home_page()"
});
formatter.result({
  "duration": 23013936,
  "status": "passed"
});
formatter.match({
  "location": "ContactsStepdef.user_moves_to_new_contacts_page()"
});
formatter.result({
  "duration": 5679825963,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jerry",
      "offset": 29
    },
    {
      "val": "pot",
      "offset": 41
    },
    {
      "val": "Manager",
      "offset": 51
    }
  ],
  "location": "ContactsStepdef.user_enters_contacts_details(String,String,String)"
});
formatter.result({
  "duration": 6251937064,
  "status": "passed"
});
formatter.match({
  "location": "ContactsStepdef.close_the_browser()"
});
formatter.result({
  "duration": 800527938,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Free CRM Create a new contact scenario",
  "description": "",
  "id": "free-crm-create-contacts;free-crm-create-a-new-contact-scenario;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enters \"valar955\" and \"valar955\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user moves to new contacts page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user enters contact details \"Robin\" and \"loxley\" and \"Manager\"",
  "matchedColumns": [
    2,
    3,
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "ContactsStepdef.user_is_already_on_Login_Page()"
});
formatter.result({
  "duration": 20103309565,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "valar955",
      "offset": 13
    },
    {
      "val": "valar955",
      "offset": 28
    }
  ],
  "location": "ContactsStepdef.user_enters_and(String,String)"
});
formatter.result({
  "duration": 645839307,
  "status": "passed"
});
formatter.match({
  "location": "ContactsStepdef.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 16580101986,
  "status": "passed"
});
formatter.match({
  "location": "ContactsStepdef.user_is_on_home_page()"
});
formatter.result({
  "duration": 15463682,
  "status": "passed"
});
formatter.match({
  "location": "ContactsStepdef.user_moves_to_new_contacts_page()"
});
formatter.result({
  "duration": 5611818796,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Robin",
      "offset": 29
    },
    {
      "val": "loxley",
      "offset": 41
    },
    {
      "val": "Manager",
      "offset": 54
    }
  ],
  "location": "ContactsStepdef.user_enters_contacts_details(String,String,String)"
});
formatter.result({
  "duration": 6329559660,
  "status": "passed"
});
formatter.match({
  "location": "ContactsStepdef.close_the_browser()"
});
formatter.result({
  "duration": 844669143,
  "status": "passed"
});
});