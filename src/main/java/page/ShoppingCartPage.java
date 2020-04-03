package page;

import core.BasePage;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @FindBy(xpath = "//p[text()[contains(.,'Your shopping cart is empty!')]]")
    private WebElement messageEmptyCart;

    @FindBy(xpath = "//a[contains(text(), 'iPhone')]")
    private WebElement nameOfProduct;

    @FindBy(xpath = "//h1")
    private WebElement shoppingCartTitle;

    private List<CartItem> items;

//    @FindBy(xpath = "//*[@id='content']/form/div/table")
//    private WebElement tableItems;


    public List getItems(){
        WebElement tableItems = driver.findElement(By.xpath("//*[@id='content']/form/div/table"));

        List<WebElement> headers = tableItems.findElement(By.tagName("thead")).findElements(By.tagName("td"));
        Map<String, Integer> columnName = new HashMap<>();
        for (int i =0; i < headers.size(); i++){
            System.out.println(headers.get(i).getText());
            columnName.put(headers.get(i).getText(), i);
        }


        List<WebElement> items = tableItems.findElement(By.tagName("tbody")).findElements(By.tagName("tr"));
        List<WebElement> itemProperty = items.get(0).findElements(By.tagName("td"));
       // CartItem item = CartItem.builder().name(itemProperty.get(columnName.get("Product Name"))).price(itemProperty.get(4)).build();
//        CartItem item = new CartItem(itemProperty.get(1), itemProperty.get(4));
        CartItem item = new CartItem(itemProperty.get(columnName.get("Product Name")),itemProperty.get(4));
        System.out.println(item);
        return new ArrayList();
    }

    public ShoppingCartPage (WebDriver driver){
        super(driver);
    }

    public String getMessageEmptyCart(){
        return messageEmptyCart.getText();
    }

    public String getNameOfProduct(){
       return nameOfProduct.getText();
    }

    public WebElement getShoppingCartTitle(){
        return shoppingCartTitle;
    }
}

//@AllArgsConstructor
@Getter
@Builder
class CartItem{
    private WebElement name;
    private WebElement price;

    public CartItem(WebElement name, WebElement price) {
        this.name = name;
        this.price = price;
    }


    @Override
    public String toString() {
        return "CartItem{" +
                "name=" + name.findElement(By.tagName("a")).getAttribute("href") +
                ", price=" + price.getText() +
                '}';
    }
}

