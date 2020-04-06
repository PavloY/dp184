package test;

import core.BaseTest;
import core.Config;
import data.ContactUsData;
import data.LoginUser;
import org.junit.Assert;
import org.junit.Test;
import page.HomePage;
import page.ProductPage;
import step.CartStep;
import step.HomePageStep;
import step.ProductStep;

import java.net.MalformedURLException;

public class FTC_Auto_Main_Product_AddProductToShoppingCartByNewUser extends BaseTest {
    HomePageStep homePageStep;


   @Test
    public void addProductToCartNewCustomer() {
       homePageStep = new HomePageStep(driver);
       homePageStep.goToCart()
               .getEmptyCart()
               .clickOnLogoLink()
               .clickOnProduct("iPhone")
               .addToCart()
               .addProductToCart();
    }
}