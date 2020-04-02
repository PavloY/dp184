package page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SuccessPage extends BasePage {

    @FindBy(tagName = "h1")
    private WebElement content;

    @FindBy(tagName = "p")
    private WebElement pSuccessMessage;

    @FindBy(xpath = "//*[contains(text(), 'Success')]")
    private WebElement successMessage;

    public SuccessPage(WebDriver driver) {
        super(driver);
    }

    public String getContent() {
        return content.getText();
    }

    public String getPsuccessMessage() {
        return pSuccessMessage.getText();
    }

    public String getSuccessMessage() {
        return successMessage.getText();
    }
}
