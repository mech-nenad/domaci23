package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwagLabsPageInventory extends BasePage {
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private WebElement addToCart;

    @FindBy(id = "remove-sauce-labs-backpack")
    private WebElement remove;

    @FindBy(xpath = "//*[@id=\"shopping_cart_container\"]" )
    private WebElement cartButton;

    @FindBy(className = "shopping_cart_badge")
    private WebElement cartBadge;



    public SwagLabsPageInventory(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }


    public void addToCartButton() {
        addToCart.click();
    }

    public void removeButton() {
        remove.click();
    }


    public WebElement getCartButton() {
        return cartButton;
    }

    public WebElement getCartBadge() {
        return cartBadge;
    }
}
