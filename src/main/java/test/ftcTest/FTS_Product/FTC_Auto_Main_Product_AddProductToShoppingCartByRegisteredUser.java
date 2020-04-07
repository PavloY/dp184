package test.ftcTest.FTS_Product;

import core.BaseTest;
import data.ContactUsData;
import data.LoginUser;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import step.HomePageStep;
import step.ProductStep;


import java.net.MalformedURLException;

public class FTC_Auto_Main_Product_AddProductToShoppingCartByRegisteredUser extends BaseTest{
    ProductStep productStep;

    @Before
    @Override
    public void setUp() throws MalformedURLException {
        super.setUp();
        LoginUser user = new LoginUser(ContactUsData.REG_E_MAIL, ContactUsData.REG_PASSWORD);
        productStep = new HomePageStep(driver).clickMyAccount().clickloginDropDown()
                .fillAllFields(user).goToCart().getEmptyCart()
                .clickOnLogoLink()
                .clickOnProduct("iPhone");
    }

    @After
    @Override
    public void tearDown() {
        super.tearDown();
        productStep = null;
    }

    @Test
    public void addProductToShoppingCartByRegisteredUser() {
       productStep.addToCart().addProductToCart();
        String expected = "Shopping Cart";
        String actual = driver.getTitle();
        Assert.assertEquals(expected, actual);
    }
}
