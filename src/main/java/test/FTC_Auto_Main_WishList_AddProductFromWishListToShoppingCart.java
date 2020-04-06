package test;

import core.BaseTest;
import data.ContactUsData;
import data.LoginUser;
import org.junit.Test;
import step.HomePageStep;


public class FTC_Auto_Main_WishList_AddProductFromWishListToShoppingCart extends BaseTest {
    HomePageStep homePageStep;


    @Test
    public void addProductToCartFromWishList() {
        homePageStep = new HomePageStep(driver);
        LoginUser user = new LoginUser(ContactUsData.REG_E_MAIL, ContactUsData.REG_PASSWORD);
        //check: user has already in his Account
        homePageStep.clickMyAccount().clickloginDropDown()
                .fillAllFields(user).clickOnWishListButton().getEmptyWishList()
                .logout().clickOnLogoLink()
                .clickOnProduct("iPhone")
                .addToCart().addProductToCart();
    }

}



