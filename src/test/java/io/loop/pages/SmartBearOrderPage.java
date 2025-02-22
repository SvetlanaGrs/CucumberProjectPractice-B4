package io.loop.pages;

import io.loop.step_definitions.SmartBearStepOrderDefs;
import io.loop.utilities.ConfigurationReader;
import io.loop.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SmartBearOrderPage {
   public SmartBearOrderPage (){
       PageFactory.initElements(Driver.getDriver(), this);
   }

    @FindBy (id= "ctl00_MainContent_username")
    public WebElement username;

    @FindBy (name="ctl00$MainContent$password")
    public WebElement password;

    @FindBy (xpath = "//input[@type='submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//a[@href='Process.aspx']")
    public WebElement orderPage;

    @FindBy (id="ctl00_MainContent_fmwOrder_txtQuantity")
    public WebElement quantity;

    @FindBy(xpath="//input[@name='ctl00$MainContent$fmwOrder$txtName']")
    public WebElement customerName;

    @FindBy(id="ctl00_MainContent_fmwOrder_TextBox2")
    public WebElement street;

    @FindBy(id="ctl00_MainContent_fmwOrder_TextBox3")
    public WebElement city;

    @FindBy(xpath="//input[@name='ctl00$MainContent$fmwOrder$TextBox4']")
    public WebElement state;

    @FindBy(id="ctl00_MainContent_fmwOrder_TextBox5")
    public WebElement zip;


    @FindBy(id="ctl00_MainContent_fmwOrder_TextBox6")
    public WebElement cardNumber;

    @FindBy(id="ctl00_MainContent_fmwOrder_TextBox1")
    public WebElement expirationDate;

    @FindBy(xpath="//a[.='Process']")
    public WebElement processButton;

    @FindBy (xpath="//a[@href='Default.aspx']")
    public WebElement viewAllOrders;

    @FindBy (xpath=" //table[@class='SampleTable']//td[2]")
    public WebElement userNameFirstRow;

    public void loginTest (){
        Driver.getDriver().navigate().to(ConfigurationReader.getProperties("smartBear.url"));
        username.sendKeys(ConfigurationReader.getProperties("smartBear.username"));
        password.sendKeys(ConfigurationReader.getProperties("smartBear.password"));
        submitButton.click();
        orderPage.click();
    }
    public void productTypeChoice(String productType){
     Select selectType = new Select(Driver.getDriver().findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")));
     switch (productType){
      case "MyMoney":
       selectType.selectByValue("MyMoney");
       break;
      case "FamilyAlbum":
       selectType.selectByValue("FamilyAlbum");
       break;
      case "ScreenSaver":
       selectType.selectByValue("ScreenSaver");
       break;
     }
    }

    public WebElement returnCardType( String cardType){
          WebElement element=null;
          String xpath="";
          switch (cardType.toLowerCase()){
          case "visa":
          xpath="//input[@value='Visa']";
          element= Driver.getDriver().findElement(By.xpath(xpath));
           break;
          case "master card":
          xpath="//input[@value='MasterCard']";
          element= Driver.getDriver().findElement(By.xpath(xpath));
           break;
          case "american express":
          xpath="//input[@value='American Express']";
          element= Driver.getDriver().findElement(By.xpath(xpath));
           break;
    }
  return element;
 }

}
