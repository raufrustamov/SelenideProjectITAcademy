package Cucumber.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/resources",
        glue={"Cucumber/steps"},
        plugin={"pretty", "html:target/html"},
        monochrome=true)

public class CucumberTestRunner {
}
