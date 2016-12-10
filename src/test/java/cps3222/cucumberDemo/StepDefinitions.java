package cps3222.cucumberDemo;

import static org.junit.Assert.*;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Etienne G on 05/12/2016.
 */

public class StepDefinitions {


    WebDriver driver;

    @Given("^I am an affiliate trying to log in$")
    public void i_am_an_affiliate_trying_to_log_in() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://localhost:8080/CPS3222_assignment/");
    }

    @When("^I login using valid credentials$")
    public void i_login_using_valid_credentials() throws Throwable {

        driver.findElement(By.name("username")).sendKeys("user");
        driver.findElement(By.name("password")).sendKeys("123");
        driver.findElement(By.name("submitpls")).submit();
    }

    @Then("^I should be taken to my account admin page$")
    public void i_should_be_taken_to_my_account_admin_page() throws Throwable {
        assertEquals(1, driver.findElements(By.xpath("//title[text()='Admin Account']")).size());
    }

    @When("^I login using invalid credentials$")
    public void i_login_using_invalid_credentials() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.name("username")).sendKeys("etienne");
        driver.findElement(By.name("password")).sendKeys("123");
        driver.findElement(By.name("submitpls")).submit();
    }

    @Then("^I should see an error message$")
    public void i_should_see_an_error_message() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I should remain on the login page$")
    public void i_should_remain_on_the_login_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(1, driver.findElements(By.xpath("//title[text()='Login Form']")).size());
    }

    @Given("^I am a logged in affiliate$")
    public void i_am_a_logged_in_affiliate() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I visit my account admin page$")
    public void i_visit_my_account_admin_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I should see my balance$")
    public void i_should_see_my_balance() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I should see a button allowing me to withdraw my balance$")
    public void i_should_see_a_button_allowing_me_to_withdraw_my_balance() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^my balance is (\\d+)\\.(\\d+)$")
    public void my_balance_is(int arg1, int arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I try to withdraw my balance$")
    public void i_try_to_withdraw_my_balance() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I should see a message indicating error$")
    public void i_should_see_a_message_indicating_error() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^my new balance will be (\\d+)\\.(\\d+)$")
    public void my_new_balance_will_be(int arg1, int arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I should see a message indicating success$")
    public void i_should_see_a_message_indicating_success() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }



}
