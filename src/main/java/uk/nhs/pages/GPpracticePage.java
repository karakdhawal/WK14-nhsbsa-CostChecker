package uk.nhs.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.nhs.utility.Utility;

public class GPpracticePage extends Utility {
    private static final Logger log = LogManager.getLogger(GPpracticePage.class.getName());

    public GPpracticePage (){
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy (xpath = "//input[@id='radio-yes']")
    WebElement yesRadioButton;

    public void clickOnYesButton () throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(yesRadioButton);
    }
}
