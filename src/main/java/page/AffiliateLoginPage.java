package page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AffiliateLoginPage extends BasePage {

    public AffiliateLoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "input-email")
    private WebElement affiliateEmail;

    @FindBy(id = "input-password")
    private WebElement affiliatePassword;

    @FindBy(xpath = "//input[contains(@value, 'Login')]")
    private WebElement buttonLogin;

    @FindBy(xpath = "//a[(text()='Continue')]")
    private WebElement buttonContinue;

    @FindBy(xpath = "//div[contains(text(), 'Warning')]")
    private WebElement warningMessage;

    @FindBy(xpath = "//h2[contains(text(), 'My Affiliate Account')]")
    private WebElement successMessage;

    public void fillAffiliateEmail(String userAffiliateEmail) {
        fillField(affiliateEmail, userAffiliateEmail);
    }

    public void fillAffiliatePassword(String userAffiliatePassword) {
        fillField(affiliatePassword, userAffiliatePassword);
    }

    public void clickOnButtonLogin() {
        buttonLogin.click();
    }

    public void clickOnButtonContinue() {
        buttonContinue.click();
    }

    public String getWarningMessage() {
        return warningMessage.getText();
    }

    public String getSuccessMessage() {
        return successMessage.getText();
    }
}