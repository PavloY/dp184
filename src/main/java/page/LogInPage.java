package page;

import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static java.lang.String.format;
import static org.openqa.selenium.By.xpath;

public class LogInPage extends BasePage {

  @FindBy(id = "input-email")
  private WebElement emailAddressField;

  @FindBy(id = "input-password")
  private WebElement passwordField;

  @FindBy(linkText = "Forgotten Password")
  private WebElement forgottenPasswordLink;

  @FindBy(xpath = "//input[@value='Login']")
  private WebElement loginButton;

  String allertByText = ("//div[text()[contains(.,'%s')]]");

  public LogInPage(WebDriver driver) {
    super(driver);
  }

  public LogInPage setEmailAddress(String emailAddress) {
    fillField(emailAddressField, emailAddress);
    return this;
  }

  public LogInPage setPassword(String password){
      fillField(passwordField, password);
      return this;
    }

  public boolean isAllertVisible(String message) {
    return driver.findElements(xpath(format(allertByText, message))).size() > 0
            && driver.findElements(xpath(format(allertByText, message))).get(0).isDisplayed();
  }

  public LogInPage clickLogInPageButton() {
         loginButton.click();
         return this;
        }

  public LogInPage forgottenPasswordLink() {
         loginButton.click();
         return this; //new ForgottenPasswordPage(driver);
        }


}
