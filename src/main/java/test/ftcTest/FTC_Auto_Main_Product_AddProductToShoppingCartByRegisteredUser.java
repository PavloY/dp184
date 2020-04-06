package test.ftcTest;

import core.BaseTest;
import data.ContactUsData;
import data.LoginUser;
import org.junit.Before;
import org.junit.Test;
import step.HomePageStep;
import step.ProductStep;
import step.WishListStep;

import java.net.MalformedURLException;

public class FTC_Auto_Main_Product_AddProductToShoppingCartByRegisteredUser extends BaseTest {
    HomePageStep homePageStep;
    ProductStep productStep;

    @Before
    @Override
    public void setUp() throws MalformedURLException {
        super.setUp();
        LoginUser user = new LoginUser(ContactUsData.REG_E_MAIL, ContactUsData.REG_PASSWORD);
        //check: user has already in his Account
        homePageStep = new HomePageStep(driver);
        homePageStep.clickMyAccount().clickloginDropDown()
                .fillAllFields(user).goToCart().getEmptyCart()// It needs to improve
                .logout().clickOnLogoLink()
                .clickOnProduct("iPhone");
        productStep = new ProductStep(driver);
    }

    @Test
    public void addProductToShoppingCartByRegisteredUser() {
       productStep.addToCart().addProductToCart();
    }
}
