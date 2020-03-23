package page;

import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ProductPage extends BasePage {
    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div[2]/div[1]/button[1]/i")
    protected WebElement wishListButton;

    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div[2]/div[1]/button[2]")
    protected WebElement productComparisonButton;

    @FindBy(id = "input-quantity")
    protected WebElement quantityInput;

    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div[1]/ul[1]/li[1]/a")
    protected WebElement photo;

    @FindBy(xpath = "/html/body/div[2]/div/button[2]")
    protected WebElement turnPhotoButton;

    @FindBy(className = "mfp-close")
    protected WebElement closePhotoButton;

    @FindBy(id ="button-cart")
    protected WebElement addToCartButton;

    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div[1]/ul[2]/li[2]/a")
    protected WebElement reviewProductButton;

    @FindBy(id = "input-name")
    protected WebElement nameInput;

    @FindBy(id = "input-review")
    protected WebElement reviewInput;

    @FindBy(id = "button-review")
    protected WebElement sendReviewButton;

    public ProductPage(WebDriver driver){
        super(driver);
    }

    public WishListPage addProductToWishList(){
        wishListButton.click();
        return new WishListPage(driver);
    }

    public void addProductToProductComparison(){
        productComparisonButton.click();
        // return new ProductComparisonPage(driver);
    }

    public ProductPage fillProductQuantity(String userQuantity){
       fillField(quantityInput, userQuantity);
        return this;
    }

    public ProductPage zoomPhoto(){
        photo.click();
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
        driver.findElement(By.xpath("//*[@id=\"form-review\"]/div[4]/div/input[" + numberOfRatingButton +"]")).click();
    }
    // add method sharing the products
}
