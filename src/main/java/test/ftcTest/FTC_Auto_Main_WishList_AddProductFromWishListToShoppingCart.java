package test.ftcTest;

import core.BaseTest;
import data.ContactUsData;
import data.LoginUser;
import org.junit.Before;
import org.junit.Test;
import step.HomePageStep;
import step.ProductStep;
import step.WishListStep;

import java.net.MalformedURLException;


public class FTC_Auto_Main_WishList_AddProductFromWishListToShoppingCart extends BaseTest {
    HomePageStep homePageStep;
    WishListStep wishListStep;

    @Before
    @Override
    public void setUp() throws MalformedURLException {
        super.setUp();
        LoginUser user = new LoginUser(ContactUsData.REG_E_MAIL, ContactUsData.REG_PASSWORD);
        //check: user has already in his Account
        homePageStep = new HomePageStep(driver);
        homePageStep.clickMyAccount().clickloginDropDown()
                .fillAllFields(user).clickOnWishListButton().getEmptyWishList()
                .logout().clickOnLogoLink()
                .clickOnProduct("iPhone").addProductToWishList();
        wishListStep = new WishListStep(driver);
    }

    @Test
    public void addProductToCartFromWishList() {
        wishListStep.addProductToCartFromWishList()
                .addProductToCart();
    }

}



