package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ResultPage extends Utility {
    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());
    //resultMessage locator

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='You will not need a visa to come to the UK']")
    WebElement resultMessageTourism;
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='You need a visa to work in health and care']")
    WebElement resultMessageHealthCare;
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='You may need a visa']")
    WebElement resultMessageFamilyStay;

    //Create methods 'String getResultMessage()' and
    // 'void confirmResultMessage(String expectedMessage)' (Note Use Assert.assertTrue)

    public String getResultMessageHealthcare() {
        log.info("Get result message of health care");
        return getTextFromElement(resultMessageHealthCare);
    }

    public String getResultMessageTourism() {
        log.info("Get result message of tourism");
        return getTextFromElement(resultMessageTourism);
    }

    public String getResultMessageFamilyStay() {
        log.info("Get result message of family stay");
        return getTextFromElement(resultMessageFamilyStay);
    }
}
