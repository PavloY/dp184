package test;

import core.BaseTest;
import core.Config;
import org.junit.Assert;
import org.junit.Test;
import page.HomePage;
import page.ProductPage;
import step.ProductStep;

import java.net.MalformedURLException;

public class FTC_Main_Product_AddProductToCart extends BaseTest {
    ProductStep productStep;
    HomePage homePage;//homeStep


    @Override
    public void setUp() {
        try {
            super.setUp();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }// check
        driver.get(Config.site);
        productStep = new ProductStep(driver);
    }

    @Test
    public void addProductToCart() {
        homePage = new HomePage(driver);
        homePage.getNameProductsList();
        homePage.clickOnNameOfProduct("iPhone");//ProductStep
        productStep = new ProductStep(driver);//add in homeStep, return ProductStep
        productStep.checkAddToCart();
    }

}