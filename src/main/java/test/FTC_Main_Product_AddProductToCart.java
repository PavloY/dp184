package test;

import core.BaseTest;
import core.Config;
import org.junit.Assert;
import org.junit.Test;
import page.HomePage;
import page.ProductPage;
import step.HomePageStep;
import step.ProductStep;

import java.net.MalformedURLException;

public class FTC_Main_Product_AddProductToCart extends BaseTest {
    HomePageStep homePageStep;//homeStep


    @Override
    public void setUp() {
        try {
            super.setUp();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }// check
        driver.get(Config.site);

    }

    @Test
    public void addProductToCart() {
        // check empty Shopping Cart
        homePageStep = new HomePageStep(driver);
        homePageStep.clickOnProduct("iPhone").checkAddToCart();
        // assert item is on Shopping Cart
    }
}