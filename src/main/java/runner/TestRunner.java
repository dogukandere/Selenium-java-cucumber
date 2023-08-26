package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebDriver;
import utilities.DriverFactory;

@CucumberOptions(
        features = {"src/test/java/features/Main.feature"},
        glue = {"stepDefinitions"}

)

public class TestRunner {

}
