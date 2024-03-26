package StepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Features",
        glue = {"StepDefinitions"},
        monochrome = true,
        plugin = {"summary", "pretty", "html:target/CucumberReports"},
        tags = "")
public class TestRunner {
}
