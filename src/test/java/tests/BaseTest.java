package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.SwagLabsLoginPage;
import pages.SwagLabsPageInventory;
import pages.SwagLabsPageSidebar;

import java.time.Duration;

public abstract class BaseTest {
    protected WebDriver driver;

    protected WebDriverWait driverWait;

    protected SwagLabsLoginPage swagLabsLoginPage;

    protected SwagLabsPageInventory swagLabsPageInventory;

    protected SwagLabsPageSidebar swagLabsPageSidebar;


    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nenad\\Documents\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driverWait = new WebDriverWait(driver, Duration.ofSeconds(30));
        swagLabsLoginPage = new SwagLabsLoginPage(driver, driverWait);
        swagLabsPageInventory = new SwagLabsPageInventory(driver, driverWait);
        swagLabsPageSidebar = new SwagLabsPageSidebar(driver, driverWait);

    }
    @BeforeMethod
    public void beforeMethod() {
    driver.get("https://www.saucedemo.com/");
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }



}
