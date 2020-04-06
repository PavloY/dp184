package test;

import core.BaseTest;
import data.ContactUsData;
import data.LoginUser;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import step.CartStep;
import step.HomePageStep;

public class FTC_Auto_Main_WishList_AddProductFromWishListToShoppingCart extends BaseTest {
    HomePageStep homePageStep;
    CartStep cartStep;
    LoginUser user;


//    @Test
//    @Ignore
//    public void addProductToCartFromWishList() {
//         check empty Shopping Cart: loginStep, check the empty Cart, logoutStep
//        homePageStep = new HomePageStep(driver);
//        LoginUser user = new LoginUser(ContactUsData.REG_E_MAIL, ContactUsData.REG_PASSWORD);
//        homePageStep.clickMyAccount()
//                .clickloginDropDown().fillAllFields(user).clickOnShoppingCartButton();
//                .clickOnProduct("iPhone")
//                .checkAddProductToWishList()
//                .addProductToCartFromWishList();
        // assert item is on Shopping Cart
//    }


}
