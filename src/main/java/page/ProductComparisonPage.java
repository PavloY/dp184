package page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductComparisonPage extends BasePage {

    @FindBy(xpath = "//*[@value=\"Add to Cart\"]")
    protected WebElement addToCartButton;

    @FindBy(xpath = "//*[contains(text(), 'Remove')]")
    protected WebElement removeFromProductComparisonButton;

    @FindBy(xpath = "//*[contains(text(), 'Continue')]")
    private WebElement continueFromProductComparisonButton;

    public ProductComparisonPage(WebDriver driver){
        super(driver);
    }

    public void goToHomePageFromProductComparison(){
        continueFromProductComparisonButton.click();
    }

    public void addToCart(){
        addToCartButton.click();
    }

    public void removeFromProductComparisonPage(){
        removeFromProductComparisonButton.click();
    }

}
