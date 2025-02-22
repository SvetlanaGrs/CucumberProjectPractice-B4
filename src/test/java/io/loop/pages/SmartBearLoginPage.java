package io.loop.pages;

import io.loop.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartBearLoginPage {
   public SmartBearLoginPage(){
       PageFactory.initElements(Driver.getDriver(), this);
   }

   @FindBy (id= "ctl00_MainContent_username")
       public WebElement username;

   @FindBy (name="ctl00$MainContent$password")
    public WebElement password;

   @FindBy (xpath = "//input[@type='submit']")
    public WebElement submitButton;

   @FindBy (tagName = "h2")
    public WebElement headerListOfAllOrders;


}
