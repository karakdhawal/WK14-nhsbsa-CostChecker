package uk.nhs.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.nhs.utility.Utility;

public class DentalPracticeCountryPage extends Utility {
    private static final Logger log = LogManager.getLogger(DentalPracticeCountryPage.class.getName());

    public DentalPracticeCountryPage (){
        PageFactory.initElements(driver, this);
    }
//
//    @CacheLookup
//    @FindBy (xpath = "")
}
