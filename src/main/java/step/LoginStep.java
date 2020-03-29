package step;

import core.BaseStep;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page.LoginPage;

public class LoginStep extends BaseStep<LoginPage> {
  public LoginStep(WebDriver driver) {
    super(driver, new LoginPage(driver));
  }

  public LoginStep fillLoginEmail(String userEmail){
    page.fillLoginEmail(userEmail);
    return this;
    }

  public LoginStep fillLoginPassword(String userPassword){
    page.fillLoginPassword(userPassword);
    return this;
  }

  public LoginStep clickLogInPageButton() {
    page.clickLogInPageButton();
    return this;
  }

  public LoginStep forgottenPasswordLink() {
    page.forgottenPasswordLink();
    return this; //new ForgottenPasswordPage(driver);
  }

  public boolean isAllertVisible() {
    return page.isAllertVisible();
  }

}
