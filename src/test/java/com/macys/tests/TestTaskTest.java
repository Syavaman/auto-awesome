package com.macys.tests;

import org.testng.annotations.Test;

public class TestTaskTest extends BaseTest {

    @Test
    public void taskTest() {
        mainPage.openMainPageAndCloseNotification()
                .verifyNavigationPanelIsDisplayed();

        bottomNavigationPanel.navigateToAboutPage();

        aboutPage.verifyCorrectAboutPageUrlIsDisplayed();
    }
}
