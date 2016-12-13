import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, format = {"html:target/cucumber-html-report"})

/**
 * Created by Etienne G on 05/12/2016.
 */

public class RunCucumberTests {


}
