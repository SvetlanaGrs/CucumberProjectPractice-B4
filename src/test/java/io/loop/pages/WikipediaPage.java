package io.loop.pages;

import io.loop.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikipediaPage {
    public WikipediaPage (){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy (xpath = "//input[@id='searchInput']")
    public WebElement searchField;

    @FindBy (xpath = "//i[text()='Search']//..")
    public WebElement searchButton;

    @FindBy (xpath = "//h1[@id='firstHeading']")
    public WebElement header;

    @FindBy (xpath = "//div[@class='fn']")
    public WebElement imageHeader;
}
