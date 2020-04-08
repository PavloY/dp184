package page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage extends BasePage {

  @FindBy(xpath = "//a[contains(text(), 'Continue')]")
  private WebElement continueButton;

  public LogoutPage(WebDriver driver) {
    super(driver);
  }

  public void clickOnContinueButton() {
    continueButton.click();
  }
}
