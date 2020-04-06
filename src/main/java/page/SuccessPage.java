package page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SuccessPage extends BasePage {

    @FindBy(tagName = "h1")
    private WebElement content;

    @FindBy(xpath = "//p[contains(text(), 'Thank you')]")
    private WebElement thankYouSuccessMessage;

    @FindBy(xpath = "//*[contains(text(), 'Success')]")
    private WebElement successMessage;

    @FindBy(xpath = "//p[contains(text(), 'Congratulations')]")
    private WebElement congratulationsMessage;

    @FindBy(xpath = "//p[contains(text(), 'Your enquiry has')]")
    private WebElement successfulSentEnquiryMessage;

    public SuccessPage(WebDriver driver) {
        super(driver);
    }

    public String getContent() {
        return content.getText();
    }

    public String getThankYouSuccessMessage() {
        return thankYouSuccessMessage.getText();
    }

    public String getSuccessMessage() {
        return successMessage.getText();
    }

    public String getCongratulationsMessage() {
        return congratulationsMessage.getText();
    }
    public String getSuccessMessageForEnquirySending(){
        return successfulSentEnquiryMessage.getText();
    }
    
}