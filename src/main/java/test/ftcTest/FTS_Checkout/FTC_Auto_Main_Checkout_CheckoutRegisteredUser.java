package test.ftcTest.FTS_Checkout;

import core.BaseTest;
import data.ContactUsData;
import data.LoginUser;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import step.CartStep;
import step.HomePageStep;
import step.SuccessStep;


import java.net.MalformedURLException;

public class FTC_Auto_Main_Checkout_CheckoutRegisteredUser extends BaseTest {
    HomePageStep homePageStep;
    CartStep cartStep;
    LoginUser user;
    SuccessStep successStep;

    @Before
    @Override
    public void setUp() throws MalformedURLException {
        super.setUp();
        user = new LoginUser("Natalyshimko@gmail.com", "040777");
        homePageStep = new HomePageStep(driver);
        homePageStep.clickOnProduct("iPhone").addToCart().goToCart();
        cartStep = new CartStep(driver);
        successStep = new SuccessStep(driver);
    }

    @Test
    public void addProductToShoppingCartByRegisteredUser() {
        cartStep.clickOnCheckoutButton().fillAllFields(user).checkoutAllContinueButtons();
        String expected = "Your order has been placed!";
        String actual = successStep.getContent();
        Assert.assertEquals(expected, actual);
    }

}
