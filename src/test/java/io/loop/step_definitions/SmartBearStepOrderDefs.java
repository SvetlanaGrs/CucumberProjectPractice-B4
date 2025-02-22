package io.loop.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.loop.pages.SmartBearOrderPage;

import static org.junit.Assert.assertTrue;

public class SmartBearStepOrderDefs {
  SmartBearOrderPage smartBearOrderPage = new SmartBearOrderPage();

    @Given("user is already logged in and navigated to order page")
    public void user_is_already_logged_in_and_navigated_to_order_page() {
        smartBearOrderPage.loginTest();
    }

    @When("user selects product type {string}")
    public void user_selects_product_type(String productType) {
        smartBearOrderPage.productTypeChoice(productType);
    }

    @When("user enters quantity {string}")
    public void user_enters_quantity(String quantity) {
        smartBearOrderPage.quantity.clear();
        smartBearOrderPage.quantity.sendKeys(quantity);
    }

    @When("user enters customer name {string}")
    public void user_enters_customer_name(String customerName) {
        smartBearOrderPage.customerName.sendKeys(customerName);
    }
    @When("user enters street {string}")
    public void user_enters_street(String street) {
        smartBearOrderPage.street.sendKeys(street);
    }
    @When("user enters city {string}")
    public void user_enters_city(String city) {
        smartBearOrderPage.city.sendKeys(city);
    }
    @When("user enters state {string}")
    public void user_enters_state(String state) {
        smartBearOrderPage.state.sendKeys(state);
    }
    @When("user enters zip {string}")
    public void user_enters_zip(String zip) {
        smartBearOrderPage.zip.sendKeys(zip);
    }
    @When("user selects credit card type {string}")
    public void user_selects_credit_card_type(String cardType) {
        smartBearOrderPage.returnCardType(cardType).click();
    }
    @When("user enters credit card number {string}")
    public void user_enters_credit_card_number(String cardNumber) {
        smartBearOrderPage.cardNumber.sendKeys(cardNumber);
    }
    @When("user enters expiration date {string}")
    public void user_enters_expiration_date(String expirationDate) {
        smartBearOrderPage.expirationDate.sendKeys(expirationDate);
    }
    @When("user enters process order button")
    public void user_enters_process_order_button()  {
        smartBearOrderPage.processButton.click();

    }
    @Then("user should see {string} in the first row of the table")
    public void user_should_see_in_the_first_row_of_the_table(String output)  {
        smartBearOrderPage.viewAllOrders.click();
        assertTrue("Expected result: " + output + " does not match with actual: " + smartBearOrderPage.userNameFirstRow.getText(),smartBearOrderPage.userNameFirstRow.getText().equalsIgnoreCase(output));
    }
}
