package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class StartPage extends Utility {
    private static final Logger log = LogManager.getLogger(StartPage.class.getName());
    //startNowButton locatores and create method 'void clickStartNow()'
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Accept additional cookies']")
    WebElement acceptAllCookies;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='wrapper']/div[1]/main[1]/div[2]/div[1]/article[1]/section[1]/a[1]")
    WebElement startButton;


    public void clickOnStartButton() {
        log.info("Accept the cookies");
        clickOnElement(acceptAllCookies);
        log.info("Click on start button");
        clickOnElement(startButton);
    }
}