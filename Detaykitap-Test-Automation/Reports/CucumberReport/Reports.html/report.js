$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/Features/detaykitap.feature");
formatter.feature({
  "name": "feature to Detay Kitap site adding product to cart",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Detay kitap site add product to cart",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "open in detaykitap pages",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.DetayKitapSteps.openInDetaykitapPages()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click search box",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.DetayKitapSteps.clickSearchBox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Write the name of the book",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.DetayKitapSteps.writeTheNameOfTheBook()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click search button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.DetayKitapSteps.clickSearchButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "add product to cart",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.DetayKitapSteps.addProductToCart()"
});
formatter.result({
  "status": "passed"
});
});