package test.ftcTest.FTS_Checkout;

import core.BaseTest;
import data.ContactUsData;
import data.LoginUser;
import org.junit.Before;
import org.junit.Test;
import step.HomePageStep;
import step.ProductStep;

import java.net.MalformedURLException;

public class FTC_Auto_Main_Checkout_CheckoutRegisteredUser extends BaseTest {
    HomePageStep homePageStep;

    @Before
    @Override
    public void setUp() throws MalformedURLException {
        super.setUp();
        LoginUser user = new LoginUser(ContactUsData.REG_E_MAIL, ContactUsData.REG_PASSWORD);
        homePageStep = new HomePageStep(driver);
        homePageStep.clickOnProduct("iPhone").checkAddToCart();
        ProductStep productStep = new ProductStep(driver);

    }

    @Test
    public void addProductToShoppingCartByRegisteredUser() {
        homePageStep.clickOnProduct("iPhone").checkAddToCart();
    }

}
