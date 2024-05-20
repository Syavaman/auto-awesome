package com.macys.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.reporters.jq.Main;

import static com.macys.constants.UrlConstants.MAIN_PAGE;
import static org.testng.Assert.assertTrue;

public class MainPage extends AbstractBasePage {
    public MainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "closeButton")
    private WebElement closeNotificationButton;
    @FindBy(xpath = "//nav[@data-testid='navigation-rail']")
    private WebElement navigationPanel;

    public MainPage closeNotification() {
        waitForElementPresence(closeNotificationButton);
        closeNotificationButton.click();
        return this;
    }

    public MainPage openMainPageAndCloseNotification(){
        driver.get(MAIN_PAGE);
        closeNotification();
        return this;
    }

    public MainPage verifyNavigationPanelIsDisplayed(){
        assertTrue(navigationPanel.isDisplayed());
        return this;
    }
}
