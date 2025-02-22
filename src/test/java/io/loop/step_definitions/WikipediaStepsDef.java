package io.loop.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.loop.pages.WikipediaPage;
import io.loop.utilities.ConfigurationReader;
import io.loop.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WikipediaStepsDef {
    WikipediaPage wikipediaPage = new WikipediaPage();

    @Given("the user is on the Wikipedia home page")
    public void the_user_is_on_the_wikipedia_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperties("wikipedia.url"));
    }

    @When("the user types {string} in the search box")
    public void theUserTypesInTheSearchBox(String input) {
        wikipediaPage.searchField.sendKeys(input);
    }

    @And("clicks the search button")
    public void clicksTheSearchButton() {
        wikipediaPage.searchButton.click();
    }

    @Then("the user see {string} in the wiki title.")
    public void theUserSeeInTheWikiTitle(String result) {
        String actualTitle = Driver.getDriver().getTitle();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleContains(result));
        Assert.assertTrue("Expected title does not match with actual title", Driver.getDriver().getTitle().contains(result) );
    }

    @Then("the user see {string} is in the main header")
    public void theUserSeeIsInTheMainHeader(String input) {
        String actual = wikipediaPage.header.getText();
        Assert.assertEquals("Expected Header does not match with actual header", input, actual);
    }

    @Then("the user see {string} is in the image header")
    public void theUserSeeIsInTheImageHeader(String input) {
       String actual = wikipediaPage.imageHeader.getText();
       Assert.assertEquals("Expected Image Header does not match with actual image header", input, actual);
    }
}
