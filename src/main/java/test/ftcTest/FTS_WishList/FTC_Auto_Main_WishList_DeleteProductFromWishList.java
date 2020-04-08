package test.ftcTest.FTS_WishList;

import core.BaseTest;
import data.Constants;
import data.ContactUsData;
import data.LoginUser;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import step.HomePageStep;
import step.WishListStep;

import java.net.MalformedURLException;


public class FTC_Auto_Main_WishList_DeleteProductFromWishList extends BaseTest {
    HomePageStep homePageStep;
    LoginUser user;
    WishListStep wishListStep;

    @Before
    @Override
    public void setUp() throws MalformedURLException {
        super.setUp();
        user = new LoginUser(Constants.REG_E_MAIL, Constants.REG_PASSWORD);
        homePageStep = new HomePageStep(driver);
        wishListStep = homePageStep.clickMyAccount().clickloginDropDown()
                .fillAllFields(user).clickOnWishListButton().getEmptyWishList()
                .clickOnLogoLink().clickOnProduct("iPhone")
                .addProductToWishList();
    }

    @After
    @Override
    public void tearDown() {
        super.tearDown();
        homePageStep = null;
        wishListStep = null;
    }

    @Test
    public void deleteProductFromWishList() {
        wishListStep.removeProductFromWishList();
        String expected = "My Wish List";
        String actual = wishListStep.getWishList();
        Assert.assertEquals(expected, actual);
    }

}
