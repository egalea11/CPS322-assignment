package cps3222.cucumberDemo;

import cps3222.classes.*;
import static org.junit.Assert.*;

import cucumber.api.Pending;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.*;
import cucumber.api.java.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Etienne G on 05/12/2016.
 */

public class StepDefinitions {

    WebDriver driver;
    AdPlatform adplatform = new AdPlatform();

    protected void sleep(int seconds){
        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }

    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();

        // initialise sample affiliate
        adplatform.initAffiliates();    // sample user(id: 111, username: user, pass: 123, balance: 49.5)
    }

    @After
    public void teardown(){
        driver.quit();
    }

    @Given("^I am an affiliate trying to log in$")
    public void i_am_an_affiliate_trying_to_log_in() throws Throwable {
        driver.get("http://localhost:8080/CPS3222_assignment/");
    }

    @When("^I login using valid credentials$")
    public void i_login_using_valid_credentials() throws Throwable {
        driver.findElement(By.name("id")).sendKeys("111");
        driver.findElement(By.name("password")).sendKeys("123");
        driver.findElement(By.name("submitpls")).submit();
    }

    @Then("^I should be taken to my account admin page$")
    public void i_should_be_taken_to_my_account_admin_page() throws Throwable {
        assertEquals(1, driver.findElements(By.xpath("//title[text()='Admin Account']")).size());
    }

    @When("^I login using invalid credentials$")
    public void i_login_using_invalid_credentials() throws Throwable {
        driver.findElement(By.name("id")).sendKeys("111");
        driver.findElement(By.name("password")).sendKeys("00000");
        driver.findElement(By.name("submitpls")).submit();
    }

    @Then("^I should see an error message$")
    public void i_should_see_an_error_message() throws Throwable {
        assertEquals(1, driver.findElements(By.xpath("//p[text()='Invalid Credentials!']")).size());
    }

    @Then("^I should remain on the login page$")
    public void i_should_remain_on_the_login_page() throws Throwable {
        assertEquals(1, driver.findElements(By.xpath("//title[text()='Login Form']")).size());
    }

    @Given("^I am a logged in affiliate$")
    public void i_am_a_logged_in_affiliate() throws Throwable {
        driver.get("http://localhost:8080/CPS3222_assignment/");
        driver.findElement(By.name("id")).sendKeys("111");
        driver.findElement(By.name("password")).sendKeys("123");
        driver.findElement(By.name("submitpls")).submit();
    }

    @When("^I visit my account admin page$")
    public void i_visit_my_account_admin_page() throws Throwable {
        assertEquals(1, driver.findElements(By.xpath("//title[text()='Admin Account']")).size());
    }

    @Then("^I should see my balance$")
    public void i_should_see_my_balance() throws Throwable {
        // given balance of user '111' is set to 49.5 euros
        assertEquals(1, driver.findElements(By.xpath("//p[text()=' 49.5 euros ']")).size());
    }

    @Then("^I should see a button allowing me to withdraw my balance$")
    public void i_should_see_a_button_allowing_me_to_withdraw_my_balance() throws Throwable {
        assertEquals(1, driver.findElements(By.xpath("//input[@value='withdraw']")).size());
    }

    @Given("^my balance is (\\d+)\\.(\\d+)$")
    public void my_balance_is(int arg1, int arg2) throws Throwable {
        Affiliate user = adplatform.getAffiliatesDatabase().get(111);
        String bal = "" + Integer.toString(arg1) + "." + Integer.toString(arg2);
        Double balance = Double.parseDouble(bal);
        user.setBalance(balance);
    }

    @When("^I try to withdraw my balance$")
    public void i_try_to_withdraw_my_balance() throws Throwable {
        throw new PendingException();
    }

    @Then("^I should see a message indicating error$")
    public void i_should_see_a_message_indicating_error() throws Throwable {
        throw new PendingException();
    }

    @Then("^my new balance will be (\\d+)\\.(\\d+)$")
    public void my_new_balance_will_be(int arg1, int arg2) throws Throwable {
        throw new PendingException();
    }

    @Then("^I should see a message indicating success$")
    public void i_should_see_a_message_indicating_success() throws Throwable {
        throw new PendingException();
    }

}
