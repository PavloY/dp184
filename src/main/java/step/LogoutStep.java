package step;

import core.BaseStep;
import org.openqa.selenium.WebDriver;
import page.LogoutPage;

public class LogoutStep extends BaseStep<LogoutPage> {
  public LogoutStep(WebDriver driver) {
    super(driver, new LogoutPage(driver));
  }

  LogoutPage logoutPage;

  public LogoutStep clickContinioButton() {
    logoutPage.clickOnContinueButton();
    return this;
  }
}
