package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwagLabsPageSidebar extends BasePage {
    @FindBy(id = "react-burger-menu-btn")
    private WebElement menuBurger;

    @FindBy(id = "logout_sidebar_link")
    private WebElement logout;

    @FindBy(className = "error-message-container error")
    private WebElement massage;

    public SwagLabsPageSidebar(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public void menuBurger() {
        menuBurger.click();
    }

    public void logout() {
        logout.click();
    }

    public String getMassage() {
        return massage.getText();
    }
}
