package test;

import core.BaseTest;
import data.ContactUsData;
import data.LoginUser;
import org.junit.Test;
import step.HomePageStep;

public class FTC_Auto_Main_Product_AddProductToShoppingCartByRegisteredUser extends BaseTest {
    HomePageStep homePageStep;


    @Test
    public void addProductToShoppingCartByRegisteredUser() {
        homePageStep = new HomePageStep(driver);
        LoginUser user = new LoginUser(ContactUsData.REG_E_MAIL, ContactUsData.REG_PASSWORD);
        homePageStep.clickMyAccount().clickloginDropDown()
                .fillAllFields(user).goToCart().getEmptyCart()
                .logout().clickOnLogoLink()
                .clickOnProduct("iPhone")
                .addToCart().addProductToCart();
    }
}
