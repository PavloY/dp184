package page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SuccessPage extends BasePage {

    @FindBy(tagName = "h1")
    private WebElement content;

    @FindBy(tagName = "p")
    private WebElement pSuccessMessage;

    @FindBy(xpath = "//*[contains(text(), 'Success')]")
    private WebElement successMessage;

    SuccessPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
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