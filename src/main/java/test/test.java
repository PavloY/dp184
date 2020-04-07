package test;

import core.BaseTest;
import org.junit.Test;
import page.HomePage;
import page.LoginPage;
import page.LogoutPage;
import step.HomePageStep;
import step.LoginStep;
import step.LogoutStep;

public class test extends BaseTest {

  public HomePageStep homePageStep;
  public LoginStep loginStep;
  public LoginPage loginPage;
  public HomePage homePage;
  public LogoutStep logoutStep;
  public LogoutPage logoutPage;

  @Test
  public void testSignIn() {
    homePageStep = new HomePageStep(driver);
    loginStep = new LoginStep(driver);
    logoutStep = new LogoutStep(driver);
    logoutPage = new LogoutPage(driver);

    loginStep.checkUserLoginExist("test_opencard@mailforspam.com", "Qwerty123456");

    homePageStep.clickMyAccount().clickLogoutDropDown();
    logoutPage.clickOnContinueButton();

    homePageStep.isUserLogIn();
  }
}
