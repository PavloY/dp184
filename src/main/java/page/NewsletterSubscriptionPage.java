package page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewsletterSubscriptionPage extends BasePage/*extends LoginPage*/ {

    public NewsletterSubscriptionPage(WebDriver driver) {
        super(driver);
    }

    //E-Mail Address from LoginPage
    //Password from LoginPage
    // LoginButton from LoginPage
    @FindBy(xpath = "//input[@value='0']")
    private WebElement no;
    @FindBy(xpath = "//input[@value='1']")
    private WebElement yes;

    @FindBy(xpath = "//input[@value='Continue']")
    private WebElement continueButton;

    public NewsletterSubscriptionPage chooseCheckBoxNo(WebElement no) {
        chooseCheckBox(no);
        return this;
    }

    public NewsletterSubscriptionPage chooseCheckBoxYes(WebElement yes) {
        chooseCheckBox(yes);
        return this;
    }

    public SuccessPage clickOnContinueButton() {
        continueButton.click();
        return new SuccessPage(driver);
    }
}