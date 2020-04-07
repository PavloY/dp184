package step;

import core.BaseStep;
import data.CommentsUser;
import data.ContactUsData;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.LoginPage;
import page.ProductPage;


public class ProductStep extends BaseStep<ProductPage> {
    private final Wait<WebDriver> wait;
    private String messageForReview;

    public ProductStep(WebDriver driver) {
        super(driver, new ProductPage(driver));
        wait = new WebDriverWait(driver, 5, 1000);
    }

    public ProductStep successMessageAddToProductComparison() {
        page.addProductToProductComparison();
        String expected = "product comparison";
        String actual = page.getMessageOnAlertProductComparison();
        Assert.assertEquals(expected, actual);
        return this;
    }

    public ProductStep successMessageAddToWishList() {
        page.addProductToWishList();
        String expected = "wish list";
        String actual = page.getMessageOnAlertWishList();
        Assert.assertEquals(expected, actual);
        return this;
    }

    public ProductStep successMessageAddToCart() {
        page.addToCart();
        String expected = "shopping cart";
        String actual = page.getMessageOnAlertCart();
        Assert.assertEquals(expected, actual);
        return this;
    }

    public CartStep addToCart() {
        page.addToCart();
        wait.until(ExpectedConditions.visibilityOf(page.getShoppingCartLink()));
        page.goToShoppingCartPage();
        String expected = "Shopping Cart";
        String actual = driver.getTitle();
        Assert.assertEquals(expected, actual);
        return new CartStep(driver);
    }

    public ProductStep addProductToProductComparison() {
        page.addProductToProductComparison();
        wait.until(ExpectedConditions.visibilityOf(page.getProductComparisonLink()));
        page.goToProductComparison();
        String expected = "Product Comparison";
        String actual = driver.getTitle();
        Assert.assertEquals(expected, actual);
        return this;
    }

    public WishListStep addProductToWishList() {
        page.addProductToWishList();
        wait.until(ExpectedConditions.visibilityOf(page.getWishListLink()));
        page.goToWishList();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.fillLoginEmail(ContactUsData.REG_E_MAIL);
        loginPage.fillLoginPassword(ContactUsData.REG_PASSWORD);
        loginPage.clickLogInPageButton();
        String expected = "My Wish List";
        String actual = driver.getTitle();
        Assert.assertEquals(expected, actual);
        return new WishListStep(driver);

    }
    public ProductStep clickOnReview(){
        page.clickOnReviewLink();
        return this;
    }

    public ProductStep fillFieldsWithInvalidName(CommentsUser user){
        fillAllFieldsForReview(user);
        messageForReview = page.getMessageAlertOnReview();

        //Assert string.size != 0;
        return this;
    }
    public ProductStep fillFieldsWithInvalidReview(CommentsUser user){
        fillAllFieldsForReview(user);
        messageForReview = page.getMessageAlertOnReview();

        //Assert
        return this;
    }
    public ProductStep fillFieldsWithInvalidRating(CommentsUser user){
        fillAllFieldsForReview(user);
        messageForReview = page.getMessageAlertOnReview();

        return this;
    }
    public ProductStep fillFieldsWithValidData(CommentsUser user){
        fillAllFieldsForReview(user);
        messageForReview = page.getMessageSuccessOnReview();

        return this;
    }
    public String getMessageForReview(){
        return messageForReview;
    }

    private void fillAllFieldsForReview(CommentsUser user){
        page.fillName(user.getName());
        page.fillReview(user.getReview());
        page.checkRating(user.getRating());
        page.sendReview();
    }

}
