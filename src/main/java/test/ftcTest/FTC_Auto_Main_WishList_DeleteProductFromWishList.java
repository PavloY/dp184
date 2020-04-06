package test.ftcTest;

import core.BaseTest;
import data.ContactUsData;
import data.LoginUser;
import org.junit.Before;
import org.junit.Test;
import step.HomePageStep;

import java.net.MalformedURLException;


public class FTC_Auto_Main_WishList_DeleteProductFromWishList extends BaseTest {
    HomePageStep homePageStep;
    LoginUser user;

    @Before
    @Override
    public void setUp() throws MalformedURLException {
        super.setUp();
        user = new LoginUser(ContactUsData.REG_E_MAIL, ContactUsData.REG_PASSWORD);
        homePageStep = new HomePageStep(driver);
        homePageStep.clickMyAccount().clickloginDropDown()
                .fillAllFields(user).clickOnWishListButton().getEmptyWishList()
                .logout().clickOnLogoLink();
    }

    @Test
    public void deleteProductFromWishList() {
        homePageStep.clickOnProduct("MacBook")
                .addProductToWishList().removeProductFromWishList();
        }

}
