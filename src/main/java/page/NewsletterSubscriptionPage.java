package page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewsletterSubscriptionPage extends BasePage {

    public NewsletterSubscriptionPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@value='0']")
    private WebElement no;
    @FindBy(xpath = "//input[@value='1']")
    private WebElement yes;
    @FindBy(xpath = "//input[@value='Continue']")
    private WebElement continueButton;

    public NewsletterSubscriptionPage chooseCheckBoxNo() {
        chooseCheckBox(no);
        return this;
    }

    public NewsletterSubscriptionPage chooseCheckBoxYes() {
        chooseCheckBox(yes);
        return this;
    }

    public String clickOnContinueButton() {
        continueButton.click();
        return new SuccessPage(driver).getSuccessMessage();
    }
}