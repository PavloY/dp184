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

    @FindBy(id ="button-cart")
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

    public ProductPage(WebDriver driver){
        super(driver);
    }

    public String getNameValue() {
        return productName.getText();
    }

    public String getPriceValue() {
        return productPrice.getText();
    }

    public WishListPage addProductToWishList(){
        wishListButton.click();
        return new WishListPage(driver);
    }

    public ProductComparisonPage addProductToProductComparison(){
        comparisonButton.click();
        return new ProductComparisonPage(driver);
    }

    public ProductPage fillProductQuantity(String userQuantity){
       fillField(quantityInput, userQuantity);
        return this;
    }

    public void addToCart(){
        addToCartButton.click();
        //return new ShoppingCartPage(driver);
    }

    public ProductPage clickOnReviewLink() {
        reviewProductButton.click();
        return this;
    }

    public ProductPage fillName(String userName) {
        fillField(nameInput, userName);
        return this;
    }

    public ProductPage fillReview(String userReview) {
        fillField(reviewInput, userReview);
        return this;
    }
    public ProductPage checkRating(int userRating){
        listRatingButton.get(userRating).click();
        return this;
    }

    public ProductPage sendReview(){
        sendReviewButton.click();
        return this;
    }

    // add method sharing the products
}
