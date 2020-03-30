package test;

import core.BaseTest;
import core.Config;
import org.junit.Assert;
import org.junit.Test;
import page.ProductPage;
import step.ProductStep;

public class FTC_Main_Product_AddProductToCart extends BaseTest {
    ProductStep productStep;

    @Override
    public void setUp() {
        super.setUp();
        driver.get(Config.site);
        productStep = new ProductStep(driver);//ProductStep
    }

//    @Test
//    public void getNameValueTest() {
//
//        String expected = "iPhone";
//
//        String actual = productStep.getNameValue();
//        Assert.assertEquals(expected, actual);
//    }

}