package test;

import core.BaseTest;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import page.LogoutPage;
import step.HomePageStep;
import step.LoginStep;

import java.net.MalformedURLException;

@RunWith(JUnitParamsRunner.class)
public class FTC_Main_Login_SignInRegisteredUserWithInvalidData extends BaseTest {

  HomePageStep homePageStep;
  LoginStep loginStep;
  LogoutPage logoutPage;

  @Before
  @Override
  public void setUp() throws MalformedURLException {
    super.setUp();
    homePageStep = new HomePageStep(driver);
    loginStep = new LoginStep(driver);
    logoutPage = new LogoutPage(driver);

    loginStep.checkUserLoginExist("test_opencard@mailforspam.com", "Qwerty123456");
    homePageStep.clickMyAccount().clickLogoutDropDown();
    logoutPage.clickOnContinueButton();
    homePageStep.isUserLogIn();
  }

  public static Object[][] signInRegisteredUserWithInvalidData() {
    return new Object[][]{
            {"test_opencard@mailforspam.com", "W123"},
            {"pencard@mailforspam.com", "Qwerty123456"},
            {"opencar@mailforspam.com", "Qwert"},
    };
  }

  @Test
  @Parameters(method = "signInRegisteredUserWithInvalidData")
  public void testSignInRegisteredUserWithInvalidData(String userEmail, String userPassword) {
    homePageStep.clickMyAccount().clickloginDropDown();
    loginStep.fillLoginEmail(userEmail).fillLoginPassword(userPassword).clickLogInPageButton();
    Assert.assertTrue(loginStep.isAllertVisible());
  }
}