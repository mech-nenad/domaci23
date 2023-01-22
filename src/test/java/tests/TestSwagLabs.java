package tests;


import org.testng.Assert;
import org.testng.annotations.Test;


public class TestSwagLabs extends BaseTest {




    @Test
    public void inputLogin() {
        swagLabsLoginPage.login("standard_user", "secret_sauce");

        swagLabsPageInventory.addToCartButton();

        Assert.assertTrue(swagLabsPageInventory.getCartBadge().getText().equals("1"));
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        swagLabsPageInventory.removeButton();

        Assert.assertTrue(swagLabsPageInventory.getCartButton().getText().isEmpty());


//
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }


    }

    @Test
    public void logoutButton() {
        swagLabsLoginPage.login("standard_user", "secret_sauce");

//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }


        swagLabsPageSidebar.logout();


        driver.get("https://www.saucedemo.com/inventory.html");


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertEquals(swagLabsLoginPage.getErrorMessage(), "Epic sadface: You can only access '/inventory.html' when you are logged in.");


    }





}
