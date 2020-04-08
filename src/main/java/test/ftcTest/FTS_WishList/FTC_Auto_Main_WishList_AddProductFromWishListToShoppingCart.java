package test.ftcTest.FTS_WishList;

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


public class FTC_Auto_Main_WishList_AddProductFromWishListToShoppingCart extends BaseTest {
    WishListStep wishListStep;

    @Before
    @Override
    public void setUp() throws MalformedURLException {
        super.setUp();
        LoginUser user = new LoginUser(Constants.REG_E_MAIL, Constants.REG_PASSWORD);
        wishListStep = new HomePageStep(driver).clickMyAccount().clickloginDropDown()
                .fillAllFields(user).clickOnWishListButton().getEmptyWishList()
                .clickOnLogoLink().clickOnProduct("iPhone").
                        addProductToWishList();
    }

    @After
    @Override
    public void tearDown() {
        super.tearDown();
        wishListStep = null;
    }

    @Test
    public void addProductFromWishListToShoppingCart() {
        wishListStep.addProductToCartFromWishList()
                .addProductToCart();
        String expected = "Shopping Cart";
        String actual = driver.getTitle();
        Assert.assertEquals(expected, actual);
    }
}



