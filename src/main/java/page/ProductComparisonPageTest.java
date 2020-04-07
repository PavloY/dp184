package page;

import core.BaseTest;
import core.Config;
import org.junit.Assert;
import org.junit.Test;
import java.net.MalformedURLException;


public class ProductComparisonPageTest extends BaseTest {
    ProductComparisonPage productComparisonPage;
    HomePage homePage;
    ProductPage productPage;


    @Override
    public void setUp() throws MalformedURLException {
        super.setUp();
        driver.get(Config.site);
        productComparisonPage = new ProductComparisonPage(driver);
        homePage = new HomePage(driver);
        homePage.clickOnNumberOfProduct(1);
        productPage = new ProductPage(driver);
        productPage.addProductToProductComparison();
        homePage.goToProductComparison();
    }
    @Test
    public void addToCartTest() {
        productComparisonPage.addToCart();
        productComparisonPage.goToShoppingCartPage();
        String expected = "Shopping Cart";
        String actual = driver.getTitle();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeFromProductComparisonPageTest() {
        productComparisonPage.removeFromProductComparisonPage();
        String expected = "Product Comparison";
        String actual = driver.getTitle();
        Assert.assertEquals(expected, actual);
    }

}