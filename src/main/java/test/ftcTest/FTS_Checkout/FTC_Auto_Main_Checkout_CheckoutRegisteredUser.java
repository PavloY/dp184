package test.ftcTest.FTS_Checkout;

import core.BaseTest;
import data.Constants;
import data.LoginUser;
import org.junit.Before;
import org.junit.Test;
import step.CartStep;
import step.HomePageStep;


import java.net.MalformedURLException;

public class FTC_Auto_Main_Checkout_CheckoutRegisteredUser extends BaseTest {
    HomePageStep homePageStep;
    CartStep cartStep;
    LoginUser user;

    @Before
    @Override
    public void setUp() throws MalformedURLException {
        super.setUp();
        user = new LoginUser(Constants.REG_E_MAIL, Constants.REG_PASSWORD);
        homePageStep = new HomePageStep(driver);
        homePageStep.clickOnProduct("iPhone").addToCart().goToCart();
        cartStep = new CartStep(driver);
    }

    @Test
    public void addProductToShoppingCartByRegisteredUser() {
        cartStep.clickOnCheckoutButton().fillAllFields(user).checkoutAllContinueButtons();
    }

}
