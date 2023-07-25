package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DurationOfStayPage extends Utility {
    private static final Logger log = LogManager.getLogger(DurationOfStayPage.class.getName());
    //nextStepButton, lessThanSixMonths, moreThanSixMonths locators

    @CacheLookup
    @FindBy(id = "response-1")
    WebElement moreThanSixMonths;

    @CacheLookup
    @FindBy(id = "response-0")
    WebElement lessThanSixMonths;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;

    //create methods 'void selectLengthOfStay(String moreOrLess)'
    // (Note: use switch statement for select moreOrLess stay) and 'void clickNextStepButton()'

    public void select6MonthsOrLess() {
        log.info("Select 6 months or less");
        clickOnElement(lessThanSixMonths);
    }

    public void selectMoreThan6Months() {
        log.info("Select more than 6 months");
        clickOnElement(moreThanSixMonths);
    }


    public void clickNextStepButton() {
        log.info("Click next step button");
        clickOnElement(nextStepButton);
    }
}

