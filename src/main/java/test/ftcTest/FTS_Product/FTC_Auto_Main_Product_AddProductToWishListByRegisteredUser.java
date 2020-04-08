package test.ftcTest.FTS_Product;

import core.BaseTest;
import data.Constants;
import data.ContactUsData;
import data.LoginUser;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import step.CartStep;
import step.HomePageStep;
import step.ProductStep;
import step.WishListStep;

import java.net.MalformedURLException;

public class FTC_Auto_Main_Product_AddProductToWishListByRegisteredUser extends BaseTest {
    ProductStep productStep;

    @Before
    @Override
    public void setUp() throws MalformedURLException {
        super.setUp();
        LoginUser user = new LoginUser(Constants.REG_E_MAIL, Constants.REG_PASSWORD);
        productStep = new HomePageStep(driver).clickMyAccount()
                .clickloginDropDown()
                .fillAllFields(user)
                .clickOnWishListButton()
                .getEmptyWishList()
                .clickOnLogoLink()
                .clickOnProduct("iPhone");
    }

    @After
    @Override
    public void tearDown() {
        super.tearDown();
        productStep = null;
    }

    @Test
    public void addProductToWishListByRegisteredUser() {
        productStep.addProductToWishList();
        String expected = "My Wish List";
        String actual = driver.getTitle();
        Assert.assertEquals(expected, actual);
    }

}

