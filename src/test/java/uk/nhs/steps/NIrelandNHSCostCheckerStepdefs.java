package uk.nhs.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import uk.nhs.pages.CountryPage;
import uk.nhs.pages.ResultPage;

public class NIrelandNHSCostCheckerStepdefs {
    @And("^I click on Northern Ireland Radio Button$")
    public void iClickOnNorthernIrelandRadioButton() {
        new CountryPage().clickOnNorthernIreland();
    }

    @Then("^I can see the Norther Ireland Result$")
    public void iCanSeeTheNortherIrelandResult() throws InterruptedException {
        System.out.println("A person from Norther Ireland :");
        System.out.println(new ResultPage().niResultText());
    }
}
