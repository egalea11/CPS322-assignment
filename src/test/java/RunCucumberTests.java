import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, format = {"html:target/cucumber-html-report"})

/**
 * Created by Etienne G on 05/12/2016.
 */

public class RunCucumberTests {

    public class runTest {

    }
}
