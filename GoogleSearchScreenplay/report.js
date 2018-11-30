$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/google_search.feature");
formatter.feature({
  "name": "Google Search",
  "description": "  As a Web User\n  I want to use google\n  to search somentihing",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Search norway northen lights in google",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "that Antonio open google browser",
  "keyword": "Given "
});
formatter.match({
  "location": "GoogleSearchStepDefinitions.thatAntonioOpenGoogleBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he search Norway Northen lights",
  "keyword": "When "
});
formatter.match({
  "location": "GoogleSearchStepDefinitions.heSearchNorwayNorthenLights(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he should see the results",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleSearchStepDefinitions.heShouldSeeTheResults()"
});
formatter.result({
  "status": "passed"
});
});