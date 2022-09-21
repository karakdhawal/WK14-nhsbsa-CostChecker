package uk.nhs.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.nhs.utility.Utility;

public class ResultPage extends Utility {
    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());

    public ResultPage (){
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy (xpath = "//div[@class='column-two-thirds']/ul[1]/li[1]")
    WebElement resultText;

    @CacheLookup
    @FindBy (xpath = "//h1[@id='result-heading']")
    WebElement niResultText;

    public String niResultText () throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(niResultText);
    }

    public String resultText () throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(resultText);
    }
}
