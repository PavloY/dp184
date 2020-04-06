package page;

import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    public LoginPage (WebDriver driver){
        super(driver);
    }

    @FindBy(id = "input-email")
    protected WebElement emailAddressField;

    @FindBy(id = "input-password")
    protected WebElement passwordField;

    @FindBy(xpath = "//input[@value='Login']")
    protected WebElement loginButton;

    @FindBy(xpath = "//a[text() ='Continue']")
    private WebElement continueButton;

    @FindBy(xpath = "//div[contains(text(), 'Warning')]")
    private WebElement warningMessage;

    @FindBy(xpath = "//h2[contains(text(), 'My Account')]")
    private WebElement successMessage;

    public void fillLoginEmail(String userEmail){
        fillField(emailAddressField,userEmail);
    }

    public void  fillLoginPassword(String userPassword){
        fillField(passwordField,userPassword);
    }

    public void clickLogInPageButton() {
        loginButton.click();
    }

    public void clickOnContinueButton(){
        continueButton.click();
    }

    public String getWarningMessage(){
        return warningMessage.getText();
    }

    public String getSuccessMessage(){
        return successMessage.getText();
    }
}
