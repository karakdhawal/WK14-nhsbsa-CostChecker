package uk.nhs.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.nhs.utility.Utility;

public class DateOfBirthPage extends Utility {
    private static final Logger log = LogManager.getLogger(DateOfBirthPage.class.getName());

    public DateOfBirthPage (){
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy (xpath = "//input[@id='dob-day']")
    WebElement dayField;

    @CacheLookup
    @FindBy (xpath = "//input[@id='dob-month']")
    WebElement monthField;

    @CacheLookup
    @FindBy (xpath = "//input[@id='dob-year']")
    WebElement yearField;


    public void enterYearInDOBField () throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(yearField, "1984");
    }

    public void enterMonthInDOBField () throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(monthField, "02");
    }
    public void enterDayInDOBField () throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(dayField, "29");
    }
}
