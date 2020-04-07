package test;

import core.BaseTest;
import org.junit.Test;
import page.HomePage;
import page.LoginPage;
import step.HomePageStep;
import step.LoginStep;

public class test extends BaseTest {

  public HomePageStep homePageStep;
  public LoginStep loginStep;
  public LoginPage loginPage;
  public HomePage homePage;

  @Test
  public void testSignIn() {
    homePageStep = new HomePageStep(driver);
    loginStep = new LoginStep(driver);

   // loginStep.checkUserLoginExist("test_opencard@mailforspam.com", "Qwerty123456");
  //  homePageStep.logoutExistUser();
  //  homePage.clickMyAccount();
  //  homePage.clickloginDropDown();
  //  Assert.assertTrue(homePage.isUserLogIn());
  }
}
