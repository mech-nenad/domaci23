package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwagLabsPageSidebar extends BasePage {
    @FindBy(id = "react-burger-menu-btn")
    private WebElement menuBurger;

    @FindBy(id = "logout_sidebar_link")
    private WebElement logout;



    public SwagLabsPageSidebar(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

//    public void menuBurger() {
//        menuBurger.click();
//    }



    public void logout() {
        menuBurger.click();
        driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logout_sidebar_link")));
        logout.click();
    }
}
