package test.ftcTest;

import core.BaseTest;
import core.Config;
import data.ContactUsData;
import data.LoginUser;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import page.HomePage;
import page.ProductPage;
import step.CartStep;
import step.HomePageStep;
import step.ProductStep;

import java.net.MalformedURLException;

public class FTC_Auto_Main_Product_AddProductToShoppingCartByNewUser extends BaseTest {
    HomePageStep homePageStep;

    @Before
    @Override
    public void setUp() throws MalformedURLException {
        super.setUp();
        homePageStep = new HomePageStep(driver);
        homePageStep.goToCart()
                .getEmptyCart()
                .clickOnLogoLink();
    }

   @Test
    public void addProductToCartNewCustomer() {
       homePageStep.clickOnProduct("iPhone")
               .addToCart()
               .addProductToCart();
    }
}