package runners;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
    features = {"classpath:resources.features"},
        glue = {"step_definitions"},
        tags = {"@Transactions"},
        plugin = "json:target/cucumber.json",
        format = {"pretty",
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "return:target/cucumber-reports/return.txt"
        },
        dryRun = false


)
public class RegressionRunner {

}
