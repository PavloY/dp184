package test.ftcTest;

import core.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import page.LoginPage;
import step.HomePageStep;
import step.LoginStep;

import java.net.MalformedURLException;

import static org.junit.Assert.assertEquals;

public class FTC_Auto_Main_Login_SignInRegisteredUserWithValidData extends BaseTest {
    LoginPage loginPage;
    LoginStep loginStep;
    HomePageStep homePageStep;

    @Before
    @Override
    public void setUp() throws MalformedURLException {
        super.setUp();
        loginStep = new LoginStep(driver);
        loginPage = new LoginPage(driver);
        loginPage.clickLogInPageButton();//?????????
        homePageStep = new HomePageStep(driver);
        homePageStep.clickMyAccount();
        homePageStep.clickloginDropDown();

    }

    @After
    @Override
    public void tearDown() {
        super.tearDown();
        loginStep = null;
        loginPage = null;
    }

//    @Test
//    public void loginWithValidData() {
//        loginStep.fillLoginWithValidData("Natalyshimko@gmail.com", "040777");
//        String expected = "My Account";
//        String actual = loginPage.getSuccessMessage();
//        assertEquals (expected,actual);
//    }
}
