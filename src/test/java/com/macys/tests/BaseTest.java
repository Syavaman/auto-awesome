package com.macys.tests;

import com.macys.page.AboutPage;
import com.macys.page.MainPage;
import com.macys.page.BottomNavigationPanel;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected WebDriver driver;
    protected MainPage mainPage;
    protected BottomNavigationPanel bottomNavigationPanel;
    protected AboutPage aboutPage;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        mainPage = new MainPage(driver);
        bottomNavigationPanel = new BottomNavigationPanel(driver);
        aboutPage = new AboutPage(driver);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
