$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("search.feature");
formatter.feature({
  "line": 1,
  "name": "Search and place the order for vegetables",
  "description": "",
  "id": "search-and-place-the-order-for-vegetables",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1076700,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Search for items and validate the results",
  "description": "",
  "id": "search-and-place-the-order-for-vegetables;search-for-items-and-validate-the-results",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@SeleniumTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is on GreenKart landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User searched for \"Cucumber\" vegetable",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "\"Cucumber\" results are displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepDefinitions.user_is_on_GreenKart_landing_page()"
});
formatter.result({
  "duration": 24765998000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cucumber",
      "offset": 19
    }
  ],
  "location": "MyStepDefinitions.user_searched_for_vegetable(String)"
});
formatter.result({
  "duration": 5688475100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cucumber",
      "offset": 1
    }
  ],
  "location": "MyStepDefinitions.results_are_displayed(String)"
});
formatter.result({
  "duration": 355015200,
  "status": "passed"
});
formatter.after({
  "duration": 888341900,
  "status": "passed"
});
});