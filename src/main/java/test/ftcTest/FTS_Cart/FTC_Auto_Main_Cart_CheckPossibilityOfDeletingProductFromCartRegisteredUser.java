package test.ftcTest.FTS_Cart;

import core.BaseTest;
import data.ContactUsData;
import data.LoginUser;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import step.CartStep;
import step.HomePageStep;

import java.net.MalformedURLException;

public class FTC_Auto_Main_Cart_CheckPossibilityOfDeletingProductFromCartRegisteredUser extends BaseTest {
    CartStep cartStep;

    @Before
    @Override
    public void setUp() throws MalformedURLException {
        super.setUp();
        LoginUser user = new LoginUser(ContactUsData.REG_E_MAIL, ContactUsData.REG_PASSWORD);
        cartStep = new HomePageStep(driver).clickMyAccount().clickloginDropDown()
                .fillAllFields(user).goToCart().getEmptyCart()
                .clickOnLogoLink()
                .clickOnProduct("iPhone").addToCart().addProductToCart();
    }

    @After
    @Override
    public void tearDown() {
        super.tearDown();
        cartStep = null;
    }

    @Test
    public void addProductToShoppingCartByRegisteredUser() {
        cartStep.removeProductFromCart();
        String expected = "Your shopping cart is empty!";
        String actual = cartStep.getMessageEmptyCart();
        Assert.assertEquals(expected, actual);
    }

}
