package runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features.bbc",
        glue = "stepdefinations_bbc"

)
public class TestRunner extends AbstractTestNGCucumberTests {}





