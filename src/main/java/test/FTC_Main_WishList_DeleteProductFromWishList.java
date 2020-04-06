package test;

import core.BaseTest;
import data.ContactUsData;
import data.LoginUser;
import org.junit.Test;
import step.HomePageStep;


public class FTC_Main_WishList_DeleteProductFromWishList extends BaseTest {
    HomePageStep homePageStep;
    LoginUser user;


    @Test
    public void deleteProductFromWishList() {
        homePageStep = new HomePageStep(driver);
        user = new LoginUser(ContactUsData.REG_E_MAIL, ContactUsData.REG_PASSWORD);
        homePageStep.clickMyAccount().clickloginDropDown()
                .fillAllFields(user).clickOnWishListButton().getEmptyWishList()
                .logout().clickOnLogoLink()
                .clickOnProduct("MacBook")
                .addProductToWishList().removeProductFromWishList();
        }

}
