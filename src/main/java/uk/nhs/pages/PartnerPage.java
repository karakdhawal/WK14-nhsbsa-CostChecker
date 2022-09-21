package uk.nhs.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.nhs.utility.Utility;

public class PartnerPage extends Utility {
    private static final Logger log = LogManager.getLogger(PartnerPage.class.getName());

    public PartnerPage (){
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy (xpath = "//input[@id='radio-no']")
    WebElement noRadioButton;


    public void clickOnNoRadioButton () throws InterruptedException {
       Thread.sleep(1000);
        clickOnElement(noRadioButton);
    }
}
