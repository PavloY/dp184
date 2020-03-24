package page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import java.util.List;


public class ProductPage extends BasePage {
    @FindBy(className = "btn-default")
    protected List<WebElement> wishListAndComparisonListButton;

    @FindBy(id = "input-quantity")
    protected WebElement quantityInput;

    @FindBy(className = "thumbnail")
    protected List<WebElement> listPhoto;

    @FindBy(className = "mfp-arrow")
    protected WebElement turnPhotoButton;

    @FindBy(className = "mfp-close")
    protected WebElement closePhotoButton;

    @FindBy(id ="button-cart")
    protected WebElement addToCartButton;

    @FindBy(xpath = "//*[contains(text(), 'Reviews')]")
    protected WebElement reviewProductButton;

    @FindBy(id = "input-name")
    protected WebElement nameInput;

    @FindBy(id = "input-review")
    protected WebElement reviewInput;

    @FindBy(id = "button-review")
    protected WebElement sendReviewButton;

    @FindBy(name = "rating")
    protected List<WebElement> listRatingButton;

    public ProductPage(WebDriver driver){
        super(driver);
    }

    public WishListPage addProductToWishList(){
        wishListAndComparisonListButton.get(1).click();
        return new WishListPage(driver);
    }

    public ProductComparisonPage addProductToProductComparison(){
        wishListAndComparisonListButton.get(2).click();
        return new ProductComparisonPage(driver);
    }

    public ProductPage fillProductQuantity(String userQuantity){
       fillField(quantityInput, userQuantity);
        return this;
    }

    public ProductPage zoomPhoto(){
        listPhoto.get(0).click();
        return this;
    }

    public ProductPage turnPhoto(){
        turnPhotoButton.click();
        return this;
    }

    public ProductPage closePhoto(){
        closePhotoButton.click();
        return this;
    }

    public void addToCart(){
        addToCartButton.click();
        // return new ShoppingCartPage;
    }

    public ProductPage addReviewOfProduct(String userName, String userReview, int userRating){
        reviewProductButton.click();
        fillField(nameInput, userName);
        fillField(reviewInput, userReview);
        checkRatingButton(userRating);
        sendReviewButton.click();
        return this;
    }
    private void checkRatingButton(int numberOfRatingButton){
        listRatingButton.get(numberOfRatingButton).click();
    }
    // add method sharing the products
}
