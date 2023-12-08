package runner;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/features/Main.feature"},
        glue = {"stepDefinitions"},
        tags = "@main",
        plugin = {"summary", "pretty", "html:Reports/CucumberReport/Reports.html",}
)

public class TestRunner {

}
