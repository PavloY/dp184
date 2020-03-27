package page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage {

    @FindBy(xpath = "//*[contains(text(), 'Use Coupon Code')]")
    public WebElement useCouponCode;

    @FindBy(xpath = "//*[contains(text(), 'Estimate Shipping')]")
    public WebElement estimateShipping;

    @FindBy(xpath = "//*[contains(text(), 'Use Gift Certificate')]")
    public WebElement useGiftCertificate;

    public ShoppingCartPage (WebDriver driver){
        super(driver);
    }
}
