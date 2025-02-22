package io.loop.pages;

import io.loop.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@type='text']")
    public WebElement usernameInput;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;

    @FindBy(xpath = "//span[.=' Continue ']")
    public WebElement continueButton;

    @FindBy (xpath = "//div[@role='listbox']//a[1]")
    public WebElement homeIcon;

    @FindBy (xpath = " //a[@href='/1099-form']")
    public WebElement form1099;

}
