package test.ftcTest.EditAddress;

import core.BaseTest;
import data.LoginUser;
import org.junit.After;
import org.junit.Before;
import step.EditAddressStep;
import step.HomePageStep;

import java.net.MalformedURLException;

public class BaseTestEditAddress extends BaseTest {
    protected EditAddressStep editAddressStep;
    protected LoginUser user;

    @Before
    @Override
    public void setUp() throws MalformedURLException {
        super.setUp();

        HomePageStep homePageStep = new HomePageStep(driver);
        user = new LoginUser("NatalyShimko@gmail.com", "040777");
        editAddressStep = homePageStep.clickMyAccount().clickloginDropDown().fillAllFields(user).clickOnAddressBookPageLink().clickOnEditButton();

    }

    @After
    @Override
    public void tearDown() {
        super.tearDown();
    }
}
