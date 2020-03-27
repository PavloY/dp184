package page;

import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static java.lang.String.format;
import static org.openqa.selenium.By.xpath;

public class LoginPage extends BasePage {
    @FindBy(id = "input-email")
    protected WebElement emailAddressField;

    @FindBy(id = "input-password")
    protected WebElement passwordField;

    @FindBy(linkText = "Forgotten Password")
    private WebElement forgottenPasswordLink;

    @FindBy(xpath = "//input[@value='Login']")
    protected WebElement loginButton;

    String allertByText = ("//div[text()[contains(.,'%s')]]");

    public LoginPage (WebDriver driver){
        super(driver);
    }

    public LoginPage fillLoginEmail(String userEmail){
        fillField(emailAddressField,userEmail);
        return this;
    }
    public LoginPage fillLoginPassword(String userPassword){
        fillField(passwordField,userPassword);
        return this;
    }

    public boolean isAllertVisible(String message) {
        return driver.findElement(By.xpath(allertByText)).isDisplayed();
    }

    public LoginPage clickLogInPageButton() {
        loginButton.click();
        return this;
    }

    public LoginPage forgottenPasswordLink() {
        loginButton.click();
        return this; //new ForgottenPasswordPage(driver);
    }
}
