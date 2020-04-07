package test;

import core.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import step.HomePageStep;
import step.LoginStep;

import java.net.MalformedURLException;

public class FTC_Main_Login_SignInRegisteredUserWithInvalidData extends BaseTest{

  private HomePageStep homePageStep;
  private LoginStep loginStep;

  @Before
  @Override
  public void setUp() throws MalformedURLException {
    super.setUp();
    homePageStep = new HomePageStep(driver);
    loginStep = new LoginStep(driver);
  }


  @Test
  public void testSignInRegisteredUserWithInvalidData() {
    homePageStep.clickMyAccount();
    homePageStep.clickloginDropDown();
    loginStep.fillLoginEmail("test");
    loginStep.fillLoginPassword("test");
    loginStep.clickLogInPageButton();
    Assert.assertTrue(loginStep.isAllertVisible());
  }
}