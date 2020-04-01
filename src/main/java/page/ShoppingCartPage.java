package page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage {

    @FindBy(xpath = "//*[contains(text(), 'Use Coupon Code')]")
    private WebElement useCouponArea;

    @FindBy(name = "coupon")
    private WebElement useCouponField;

    @FindBy(id = "button-coupon")
    private WebElement applyCoupon;

    @FindBy(xpath = "//*[contains(text(), 'Estimate Shipping')]")
    private WebElement estimateShippingArea;

    @FindBy(name = "country_id")
    private WebElement country;

    @FindBy(name = "zone_id")
    private WebElement region;

    @FindBy(name = "postcode")
    private WebElement postCode;

    @FindBy(id = "button-quote")
    private WebElement getQuotesButton;

    @FindBy(xpath = "//*[contains(text(), 'Use Gift Certificate')]")
    private WebElement useGiftCertificate;

    @FindBy(name = "voucher")
    private WebElement giftCertificateField;

    @FindBy(id = "button-voucher")
    private WebElement applyGiftSertificateButton;

    @FindBy(xpath = "//*[contains(text(), 'Continue Shopping')]")
    private WebElement continueShoppingButton;

    public ShoppingCartPage (WebDriver driver){
        super(driver);
    }
}
