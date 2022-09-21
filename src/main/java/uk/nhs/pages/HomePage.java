package uk.nhs.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.nhs.utility.Utility;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage (){
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy (xpath = "//input[@id='next-button']")
    WebElement startNowButton;



    public void clickOnStartNow (){
        clickOnElement(startNowButton);
    }
}
