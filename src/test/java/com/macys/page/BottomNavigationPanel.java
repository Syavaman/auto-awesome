package com.macys.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.macys.constants.UrlConstants.ABOUT_PAGE;

public class BottomNavigationPanel extends AbstractBasePage {
    @FindBy(xpath = "//a[@href='" + ABOUT_PAGE + "']")
    private WebElement aboutPage;

    public BottomNavigationPanel(WebDriver driver) {
        super(driver);
    }

    public BottomNavigationPanel navigateToAboutPage(){
        aboutPage.click();
        return this;
    }

}
