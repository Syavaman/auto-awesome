package com.macys.page;

import org.openqa.selenium.WebDriver;

import static com.macys.constants.UrlConstants.ABOUT_PAGE;
import static org.testng.Assert.assertTrue;

public class AboutPage extends AbstractBasePage {
    public AboutPage(WebDriver driver) {
        super(driver);
    }

    public AboutPage verifyCorrectAboutPageUrlIsDisplayed(){
        assertTrue(driver.getCurrentUrl().equals(ABOUT_PAGE));
        return this;
    }
}
