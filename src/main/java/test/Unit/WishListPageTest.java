package test.Unit;

import core.BaseTest;
import core.Config;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.HomePage;
import page.LoginPage;
import page.ProductPage;
import page.WishListPage;

import java.net.MalformedURLException;

import static org.junit.Assert.*;

public class WishListPageTest extends BaseTest {
    ProductPage productPage;
    HomePage homePage;
    WishListPage wishListPage;



    @Override
    public void setUp() throws MalformedURLException {
        super.setUp();
        productPage = new ProductPage(driver);
        homePage = new HomePage(driver);
        homePage.clickOnNumberOfProduct(1);
        productPage.addProductToWishList();
        final Wait<WebDriver> wait = new WebDriverWait(driver, 5, 1000);
        wait.until(ExpectedConditions.visibilityOf(productPage.getWishListLink()));
        productPage.goToWishList();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.fillLoginEmail("opencard@mailforspam.com");
        loginPage.fillLoginPassword("Qwerty");
        loginPage.clickLogInPageButton();
        wishListPage = new WishListPage(driver);
    }

    @Test
    public void addProductToCartTest() {
        wishListPage.addProductToCart();
        final Wait<WebDriver> wait = new WebDriverWait(driver, 5, 1000);
        wait.until(ExpectedConditions.visibilityOf(wishListPage.getShoppingCartLink()));
        String expected = "shopping cart";
        String actual = wishListPage.getMessageOnAlertCart();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeProductFromWishListTest() {
        wishListPage.removeProductFromWishList();
        String expected = "Your wish list is empty.";
        String actual = wishListPage.getMessageSuccessRemove();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void continueShoppingFromWishListTest() {
        wishListPage.continueShoppingFromWishList();
        String expected = "Account";
        String actual = wishListPage.goToAccount();
        Assert.assertEquals(expected, actual);

    }
}