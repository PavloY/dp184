package page;

import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
  @FindBy(id = "input-email")
  protected WebElement emailAddressField;

  @FindBy(id = "input-password")
  protected WebElement passwordField;

  @FindBy(linkText = "Forgotten Password")
  private WebElement forgottenPasswordLink;

  @FindBy(xpath = "//input[@value='Login']")
  protected WebElement loginButton;

  String allertByText = ("//div[text()[contains(.,'Warning')]]");

  public LoginPage(WebDriver driver) {
    super(driver);
  }

  public void fillLoginEmail(String userEmail) {
    fillField(emailAddressField, userEmail);
  }

  public void fillLoginPassword(String userPassword) {
    fillField(passwordField, userPassword);
  }

  public boolean isAllertVisible() {
    return driver.findElement(By.xpath(allertByText)).isDisplayed();
  }

  public void clickLogInPageButton() {
    loginButton.click();
  }

  public void forgottenPasswordLink() {
    loginButton.click();
  }
}
