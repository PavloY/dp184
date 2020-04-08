package test.ftcTest.FTS_Checkout;

import core.BaseTest;
import data.LoginUser;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import step.CartStep;
import step.CheckoutStep;
import step.HomePageStep;
import step.SuccessStep;

import java.net.MalformedURLException;

public class FTC_Auto_Main_CheckoutWithoutAgreeTerms extends BaseTest {
    CartStep cartStep;
    LoginUser user;
    SuccessStep successStep;
    CheckoutStep checkoutStep;
    @Before
    @Override
    public void setUp() throws MalformedURLException {
        super.setUp();
        user = new LoginUser("Natalyshimko@gmail.com", "040777");
        cartStep = new HomePageStep(driver).clickMyAccount().clickloginDropDown()
                .fillAllFields(user).clickOnLogoLink().clickOnProduct("iPhone").addToCart().goToCart();
        successStep = new SuccessStep(driver);
    }

    @Test
    public void checkoutWithoutAgreeTerms() {
        cartStep.clickOnCheckoutButton().checkoutWithoutAgree();
        String expected = "Warning: You must agree to the Terms & Conditions!";
        String actual = checkoutStep.getMessage().trim();
        Assert.assertEquals(expected, actual);
    }
}
