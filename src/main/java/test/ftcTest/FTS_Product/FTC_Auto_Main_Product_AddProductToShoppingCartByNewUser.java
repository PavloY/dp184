package test.ftcTest.FTS_Product;

import core.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import step.HomePageStep;
import step.ProductStep;

import java.net.MalformedURLException;


public class FTC_Auto_Main_Product_AddProductToShoppingCartByNewUser extends BaseTest {
    ProductStep productStep;

    @Before
    @Override
    public void setUp() throws MalformedURLException {
        super.setUp();
        productStep = new HomePageStep(driver).goToCart()
                .getEmptyCart()
                .clickOnLogoLink().clickOnProduct("iPhone");
    }

    @After
    @Override
    public void tearDown() {
        super.tearDown();
        productStep = null;
    }

   @Test
    public void addProductToShoppingCartByNewUser() {
       productStep.addToCart()
               .addProductToCart();
       String expected = "Shopping Cart";
       String actual = driver.getTitle();
       Assert.assertEquals(expected, actual);
    }
}