package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

@CucumberOptions(
        features = "src/test/resources/features", // Path to the directory where feature files are located
        glue = {"stepdefs"}, // Package name where step definition classes are located
        tags = "@homepage", // Specify the tags to include/exclude scenarios
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class TestRunner extends AbstractTestNGCucumberTests {

    @BeforeSuite
    @Parameters("browser")
    public void setUp(String browser) {
        System.setProperty("browser", browser);
    }
}