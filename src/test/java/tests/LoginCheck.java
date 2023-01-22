package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginCheck extends BaseTest {

    @Test
    public void standardUserLogin() {
        swagLabsLoginPage.login("standard_user", "secret_sauce");
        Assert.assertTrue(driver.getCurrentUrl().contains("/inventory.html"));
        driver.navigate().refresh();
        Assert.assertTrue(driver.getCurrentUrl().contains("/inventory.html"));
    }

    @Test
    public void standardUserWrongPasswordLogin() {
        swagLabsLoginPage.login("standard_user", "21547SCTSease");
        Assert.assertEquals(swagLabsLoginPage.getErrorMessage(), "Epic sadface: Username and password do not match any user in this service");
        Assert.assertFalse(driver.getCurrentUrl().contains("/inventory"));
        driver.navigate().refresh();
        Assert.assertFalse(driver.getCurrentUrl().contains("/inventory"));
    }

    @Test
    public void lockedOutUserLogin() {
        swagLabsLoginPage.login("locked_out_user", "secret_sauce");
        Assert.assertEquals(swagLabsLoginPage.getErrorMessage(), "Epic sadface: Sorry, this user has been locked out.");
        Assert.assertFalse(driver.getCurrentUrl().contains("/inventory"));
        driver.navigate().refresh();
        Assert.assertFalse(driver.getCurrentUrl().contains("/inventory"));
    }

}
