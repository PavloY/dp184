package test.ftcTest.FTS_Product;

import core.BaseTest;
import data.Constants;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import step.HomePageStep;
import step.ProductStep;

import java.net.MalformedURLException;

public class FTC_Auto_Main_Product_AddProductToProductComparisonByNewUser extends BaseTest {
    ProductStep productStep;

    @Before
    @Override
    public void setUp() throws MalformedURLException {
        super.setUp();
        productStep = new HomePageStep(driver).clickOnProduct("iPhone");
    }

    @After
    @Override
    public void tearDown() {
        super.tearDown();
        productStep = null;
    }

    @Test
    public void addProductToProductComparisonByNewUser() {
        String expected = Constants.LINK_IPHONE;
        String actual = productStep.addProductToProductComparison().getProductLink();
        Assert.assertEquals(expected, actual);
    }
}
