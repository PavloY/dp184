package page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductComparisonPage extends BasePage {

    @FindBy(xpath = "//*[contains(text(), 'Continue')]")
    private WebElement continueFromProductComparisonButton;

    public ProductComparisonPage(WebDriver driver){
        super(driver);
    }

    public HomePage goToHomePageFromProductComparison(){
        continueFromProductComparisonButton.click();
        return new HomePage(driver);
    }
}
