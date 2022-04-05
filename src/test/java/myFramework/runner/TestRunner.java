package myFramework.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue = "myFramework/Steps_Definitions",
//        tags = "@Smoke",
        dryRun = false
//        plugin ={ "pretty",
//                "html:target/default-cucumber-reports.html",
//                "json:target/cucumber.json",
//                "rerun:target/rerun.txt"
//        }
//        publish = false,
//        monochrome = false

)
public class TestRunner {
}
