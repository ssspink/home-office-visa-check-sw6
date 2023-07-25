package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class VisaConfirmationTestSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @When("I click on start button")
    public void clickOnStartButton() {
        new StartPage().clickOnStartButton();
    }

    @And("I select a Nationality {string}")
    public void selectANationalityAustralia(String country) {
        new SelectNationalityPage().selectNationality(country);
    }

    @And("I click on Continue button")
    public void clickOnContinueButton() {
        new SelectNationalityPage().clickNextStepButton();
    }

    @And("I select reason Tourism")
    public void selectReasonTourism() {
        new ReasonForTravelPage().selectReasonForAustralia();
    }

    @Then("I verify Australia result {string}")
    public void verifyAustraliaResultYouWillNotNeedAVisaToComeToTheUK(String expectedMessage) {
        Assert.assertEquals(expectedMessage, new ResultPage().getResultMessageTourism());
    }

    @And("I select reason Work, academic visit or business")
    public void selectReasonWorkAcademicVisitOrBusiness() {
        new ReasonForTravelPage().selectReasonForChile();
    }

    @And("I select intendent to stay for longer than 6 months")
    public void selectIntendentToStayForLongerThanMonths() {
        new DurationOfStayPage().selectMoreThan6Months();
    }


    @And("I select have planning to work for Health and care professional")
    public void selectHavePlanningToWorkForHealthAndCareProfessional() {
        new WorkTypePage().selectJobType();
    }
    @Then("I verify Chile result {string}")
    public void verifyChileResultYouNeedAVisaToWorkInHealthAndCare(String expectedMessage) {
        Assert.assertEquals(expectedMessage, new ResultPage().getResultMessageHealthcare());
    }

    @And("I select reason Join partner or family for a long stay")
    public void selectReasonJoinPartnerOrFamilyForALongStay() {
        new ReasonForTravelPage().selectReasonForColombia();
    }

    @Then("I verify Colombia result {string}")
    public void verifyColombiaResultYouLlNeedAVisaToJoinYourFamilyOrPartnerInTheUK(String expectedMessage) {
        Assert.assertEquals(expectedMessage, new ResultPage().getResultMessageFamilyStay());
    }
}
