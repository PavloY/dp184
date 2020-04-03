package page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class ProductPage extends BasePage {
    @FindBy(tagName = "h1")
    private WebElement productName;

    @FindBy(xpath = "//li/h2")
    private WebElement productPrice;

    @FindBy(xpath = "//button[@data-original-title=\"Add to Wish List\"]")
    private WebElement wishListButton;

    @FindBy(xpath = "//button[@data-original-title=\"Compare this Product\"]")
    private WebElement comparisonButton;

    @FindBy(id = "input-quantity")
    private WebElement quantityInput;

    @FindBy(id = "button-cart")
    private WebElement addToCartButton;

    @FindBy(xpath = "//*[contains(text(), 'Reviews')]")
    private WebElement reviewProductButton;

    @FindBy(id = "input-name")
    private WebElement nameInput;

    @FindBy(id = "input-review")
    private WebElement reviewInput;

    @FindBy(id = "button-review")
    private WebElement sendReviewButton;

    @FindBy(name = "rating")
    private List<WebElement> listRatingButton;

    @FindBy(xpath = "//a[contains(text(), 'product comparison')]")
    private WebElement productComparisonLink;

    @FindBy(xpath = "//a[contains(text(), 'wish list')]")
    private WebElement wishListLink;

    @FindBy(xpath = "//a[contains(text(), 'shopping cart')]")
    private WebElement shoppingCartLink;

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getProductComparisonLink() {
        return productComparisonLink;
    }

    public WebElement getWishListLink() {
        return wishListLink;
    }

    public WebElement getShoppingCartLink() {
        return shoppingCartLink;
    }

    public String getNameValue() {
        return productName.getText();
    }

    public String getPriceValue() {
        return productPrice.getText();
    }

    public void addProductToWishList() {
        wishListButton.click();
    }

    public void addProductToProductComparison() {
        comparisonButton.click();
    }

    public void fillProductQuantity(String userQuantity) {
        fillField(quantityInput, userQuantity);
    }

    public void addToCart() {
        addToCartButton.click();
    }

    public void clickOnReviewLink() {
        reviewProductButton.click();
    }

    public void fillName(String userName) {
        fillField(nameInput, userName);
    }

    public void fillReview(String userReview) {
        fillField(reviewInput, userReview);
    }

    public void checkRating(int userRating) {
        listRatingButton.get(userRating).click();
    }

    public void sendReview() {
        sendReviewButton.click();
    }

    public String getMessageOnAlertProductComparison() {
        return productComparisonLink.getText();
    }

    public String getMessageOnAlertWishList() {
        return wishListLink.getText();
    }

    public String getMessageOnAlertCart() {
        return shoppingCartLink.getText();
    }

    public double getDollarPriceAsDouble() {
        chooseCurrency();
        getDollar().click();
        String dollar = getPriceValue().replaceAll("\\$", "");
        double dollarPrice = Double.parseDouble(dollar);
        return dollarPrice;
    }

    public double getSterlingPriceAsDouble() {
        chooseCurrency();
        getSterling().click();
        String sterling = getPriceValue().replaceAll("£", "");
        double sterlingPrice = Double.parseDouble(sterling);
        return sterlingPrice;
    }

    public double getEuroPriceAsDouble() {
        chooseCurrency();
        getEuro().click();
        String euro = getPriceValue().replaceAll("€", "");
        double euroPrice = Double.parseDouble(euro);
        return euroPrice;
    }
}
