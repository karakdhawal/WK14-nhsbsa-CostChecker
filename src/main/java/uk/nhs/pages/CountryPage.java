package uk.nhs.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.nhs.utility.Utility;

public class CountryPage extends Utility {

    private static final Logger log = LogManager.getLogger(CountryPage.class.getName());

    public CountryPage (){
        PageFactory.initElements(driver, this );
    }
    @CacheLookup
    @FindBy (xpath = "//input[@id='radio-wales']")
    WebElement walesRadioButton;

    @CacheLookup
    @FindBy (xpath = "//input[@id='radio-nire']")
    WebElement northernIrelandRadioButton;

    @CacheLookup
    @FindBy (xpath = "//input[@id='next-button']")
    WebElement nextCountryButton;

    public void clickOnNextButton () throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(nextCountryButton);
    }

    public void clickOnNorthernIreland (){
        clickOnElement(northernIrelandRadioButton);
    }

    public void clickOnwales (){
        clickOnElement(walesRadioButton);
    }

}
