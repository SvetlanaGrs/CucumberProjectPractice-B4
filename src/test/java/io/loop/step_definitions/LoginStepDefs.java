package io.loop.step_definitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.loop.pages.LoginPage;
import io.loop.utilities.BrowserUtils;
import io.loop.utilities.ConfigurationReader;
import io.loop.utilities.DocuportConstance;
import io.loop.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertTrue;
public class LoginStepDefs {
    LoginPage loginPage = new LoginPage();
    @Given("user is on Docuport login page")
    public void user_is_on_docuport_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperties("docuportBETA"));
        BrowserUtils.waitForClickable(loginPage.loginButton, DocuportConstance.EXTRA_LARGE);
        assertTrue("Login Button is NOT displayed", loginPage.loginButton.isDisplayed());
    }
    @When("user enters username for client")
    public void user_enters_username_for_client() {
        loginPage.usernameInput.sendKeys(DocuportConstance.USERNAME_CLIENT);
    }
    @When("user enters password for client")
    public void user_enters_password_for_client() {
        loginPage.passwordInput.sendKeys(DocuportConstance.PASSWORD);
    }
    @When("user click login button")
    public void user_click_login_button() {
        loginPage.loginButton.click();
    }
    @Then("user should be able to see the home for client")
    public void user_should_be_able_to_see_the_home_for_client() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(loginPage.continueButton));
        //wait.until(ExpectedConditions.visibilityOf(loginPage.continueButton));
        loginPage.continueButton.click();
        Assert.assertTrue("Home page for client is not displayed" ,loginPage.homeIcon.isDisplayed());
    }

    @When("user enters username for employee")
    public void user_enters_username_for_employee() {
        loginPage.usernameInput.sendKeys(DocuportConstance.USERNAME_EMPLOYEE);
    }
    @When("user enters password for employee")
    public void user_enters_password_for_employee() {
        loginPage.passwordInput.sendKeys(DocuportConstance.PASSWORD);
    }

    @Then("user should be able to see the home for employee")
    public void user_should_be_able_to_see_the_home_for_employee() {
        Assert.assertTrue("Home page for employee is not displayed", loginPage.form1099.isDisplayed());
    }

    @When("user enters username for advisor")
    public void user_enters_username_for_advisor() {
        loginPage.usernameInput.sendKeys(DocuportConstance.USERNAME_ADVISOR);
    }
    @When("user enters password for advisor")
    public void user_enters_password_for_advisor() {
        loginPage.passwordInput.sendKeys(DocuportConstance.PASSWORD);
    }

    @Then("user should be able to see the home for advisor")
    public void user_should_be_able_to_see_the_home_for_advisor() {
        Assert.assertTrue("Home page for advisor is not displayed", loginPage.homeIcon.isDisplayed());
    }

    @When("user enters username for supervisor")
    public void user_enters_username_for_supervisor() {
        loginPage.usernameInput.sendKeys(DocuportConstance.USERNAME_SUPERVISOR);
    }
    @When("user enters password for supervisor")
    public void user_enters_password_for_supervisor() {
        loginPage.passwordInput.sendKeys(DocuportConstance.PASSWORD);
    }

    @Then("user should be able to see the home for supervisor")
    public void user_should_be_able_to_see_the_home_for_supervisor() {
        Assert.assertTrue("Home page for supervisor is not displayed", loginPage.homeIcon.isDisplayed());
    }
}
