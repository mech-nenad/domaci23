package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwagLabsLoginPage extends BasePage {


    @FindBy(id = "user-name")
    private WebElement userName;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "login-button")
    private WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"login_button_container\"]/div/form/div[3]/h3")
    private WebElement errorMessage;

    public SwagLabsLoginPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);

    }

    public void login(String a, String b) {
        userName.sendKeys(a);
        password.sendKeys(b);
        loginButton.click();
    }
    public String getErrorMessage() {
        return errorMessage.getText();
    }
}
