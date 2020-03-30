package step;

import core.BaseStep;
import org.openqa.selenium.WebDriver;
import page.HomePage;
import page.LoginPage;

public class HomePageStep extends BaseStep<HomePage> {
  public HomePageStep(WebDriver driver) {
    super(driver, new HomePage(driver));
  }

  public HomePageStep clickMyAccount(){
    page.clickMyAccount();;
    return this;
  }

  public LoginPage clickloginDropDown(){
    page.clickloginDropDown();
    return new LoginPage(driver);
  }
}