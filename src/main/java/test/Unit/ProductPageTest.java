package test.Unit;

import core.BaseTest;
import core.Config;
import org.junit.Assert;
import org.junit.Test;
import page.HomePage;
import page.ProductPage;

import java.net.MalformedURLException;

public class ProductPageTest extends BaseTest {
    ProductPage productPage;
    HomePage homePage;

    @Override
    public void setUp() throws MalformedURLException {
        super.setUp();
        driver.get(Config.site);
        productPage = new ProductPage(driver);
        homePage = new HomePage(driver);
        homePage.clickOnNumberOfProduct(1);
    }

    @Test
    public void getNameValueTest() {
        String expected = "iPhone";
        String actual = productPage.getNameValue();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getPriceValueTest() {
        String expected = "$101.00";
        String actual = productPage.getPriceValue();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addProductToWishListTest(){
        productPage.addProductToWishList();
        String expected = "wish list";
        String actual = productPage.getMessageOnAlertWishList();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addProductToProductComparisonTest(){
        productPage.addProductToProductComparison();
        String expected = "product comparison";
        String actual = productPage.getMessageOnAlertProductComparison();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addToCartTest(){
        productPage.addToCart();
        String expected = "shopping cart";
        String actual = productPage.getMessageOnAlertCart();
        Assert.assertEquals(expected, actual);
    }

}
