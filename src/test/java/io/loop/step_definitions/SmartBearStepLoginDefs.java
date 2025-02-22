package io.loop.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.loop.pages.SmartBearPage;
import io.loop.utilities.BrowserUtils;
import io.loop.utilities.ConfigurationReader;
import io.loop.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SmartBearStepDefs {
    SmartBearPage smartBearPage=new SmartBearPage();

    @Given("user in the smartbearsoftware Log in page")
    public void user_in_the_smartbearsoftware_log_in_page() {
        Driver.getDriver().navigate().to(ConfigurationReader.getProperties("smartBear.url"));
        BrowserUtils.takeScreenshot();
    }
    @When("user enter username for smartbearsoftware")
    public void user_enter_username_for_smartbearsoftware() {
       smartBearPage.username.sendKeys(ConfigurationReader.getProperties("smartBear.username"));
    }
    @When("user enter password forsmartbearsoftware")
    public void user_enter_password_forsmartbearsoftware() {
        smartBearPage.password.sendKeys(ConfigurationReader.getProperties("smartBear.password"));
    }
    @When("user click log in button")
    public void user_click_log_in_button() {
        smartBearPage.submitButton.click();
    }

    @Then("user should see {string}")
    public void user_should_see(String homePageHead){
        Assert.assertEquals("Actual home page doesn't match witch expected", homePageHead,smartBearPage.headerListOfAllOrders.getText());
    }

}
