package test;

import core.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import step.HomePageStep;
import step.LoginStep;

public class FTC_Main_Login_SignInRegisteredUserWithInvalidData extends BaseTest{

  HomePageStep homePageStep;
  LoginStep loginStep;

  @Test
  public void testSignInRegisteredUserWithInvalidData() {
    homePageStep = new HomePageStep(driver);
    homePageStep.clickMyAccount();
    homePageStep.clickloginDropDown();
    loginStep = new LoginStep(driver);
    loginStep.fillLoginEmail("test");
    loginStep.fillLoginPassword("test");
    loginStep.clickLogInPageButton();
    Assert.assertTrue(loginStep.isAllertVisible());
  }
}