import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",
glue={"com.test.java.steps"},
        tags={"@smoke"})
public class TestRunner {

}
