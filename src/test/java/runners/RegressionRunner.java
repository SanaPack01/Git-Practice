package runners;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
    features = {"classpath:resources.features"},
        glue = {"step_definitions"},
        tags = {"@Transactions"},
        plugin = {"json:target/cucumber.json"},
        format = {"pretty","html:target/reports",}


)
public class RegressionRunner {

}
