package test.ftcTest.FTS_Product;

import core.BaseTest;
import data.Constants;
import data.LoginUser;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import step.HomePageStep;
import step.ProductStep;

import java.net.MalformedURLException;

public class FTC_Auto_Main_Product_AddProductToProductComparisonByRegisteredUser extends BaseTest {
    ProductStep productStep;

    @Before
    @Override
    public void setUp() throws MalformedURLException {
        super.setUp();
        LoginUser user = new LoginUser(Constants.REG_E_MAIL, Constants.REG_PASSWORD);
        productStep = new HomePageStep(driver).clickMyAccount().clickloginDropDown()
                .fillAllFields(user).clickOnLogoLink().clickOnProduct("iPhone");
    }

    @After
    @Override
    public void tearDown() {
        super.tearDown();
        productStep = null;
    }

    @Test
    public void addProductToProductComparisonByRegisteredUser() {
        String expected = Constants.LINK_IPHONE;
        String actual = productStep.addProductToProductComparison().getProductLink();
        Assert.assertEquals(expected, actual);
    }
}
