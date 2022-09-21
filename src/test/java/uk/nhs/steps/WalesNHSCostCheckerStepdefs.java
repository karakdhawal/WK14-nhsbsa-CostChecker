package uk.nhs.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uk.nhs.pages.*;

public class WalesNHSCostCheckerStepdefs {
    @Given("^I am on NHS cost check Home page$")
    public void iAmOnNHSCostCheckHomePage() {
    }

    @When("^I click on Start now$")
    public void iClickOnStartNow() {
        new HomePage().clickOnStartNow();
    }

    @And("^I click on Wales Radio Button$")
    public void iClickOnWalesRadioButton() {
        new CountryPage().clickOnwales();
    }

    @And("^I click on Next Button$")
    public void iClickOnNextButton() throws InterruptedException {
        new CountryPage().clickOnNextButton();
    }

    @Then("^I am on GP practice page$")
    public void iAmOnGPPracticePage() {
    }

    @And("^I click on Yes Radio Button$")
    public void iClickOnYesRadioButton() throws InterruptedException {
        new GPpracticePage().clickOnYesButton();
    }

    @Then("^I am on Dental Practice page$")
    public void iAmOnDentalPracticePage() {

    }

    @Then("^I am on Date of Birth Page$")
    public void iAmOnDateOfBirthPage() {
    }

    @And("^I enter date of birth$")
    public void iEnterDateOfBirth() throws InterruptedException {
        new DateOfBirthPage().enterDayInDOBField();
        new DateOfBirthPage().enterMonthInDOBField();
        new DateOfBirthPage().enterYearInDOBField();
    }

    @Then("^I am on Partner page$")
    public void iAmOnPartnerPage() {
    }

    @Then("^I am on Benefits page$")
    public void iAmOnBenefitsPage() {
    }

    @And("^I click on No radio Button$")
    public void iClickOnNoRadioButton() throws InterruptedException {
        new PartnerPage().clickOnNoRadioButton();
    }

    @Then("^I am on Pregnant page$")
    public void iAmOnPregnantPage() {
    }

    @Then("^I am was pensioner page$")
    public void iAmWasPensionerPage() {
    }

    @Then("^I am on Diabetes Page$")
    public void iAmOnDiabetesPage() {
    }

    @Then("^I am on Glaucoma page$")
    public void iAmOnGlaucomaPage() {
    }

    @Then("^I am on CareHome Page$")
    public void iAmOnCareHomePage() {
    }

    @Then("^I am on Savings page$")
    public void iAmOnSavingsPage() {
    }

    @Then("^I can see the result$")
    public void iCanSeeTheResult() throws InterruptedException {
        System.out.println("A person from Wales get free :");
        System.out.println(new ResultPage().resultText());

    }
}
