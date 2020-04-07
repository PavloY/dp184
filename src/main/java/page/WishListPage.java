package page;

import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishListPage extends BasePage {
    @FindBy(xpath = "//button[@data-original-title=\"Add to Cart\"]")
    private WebElement addProductToCartButton;

    @FindBy(xpath = "//a[@data-original-title=\"Remove\"]")
    protected WebElement removeProductFromWishListButton;

    @FindBy(xpath = "//*[contains(text(), 'Continue')]")
    protected WebElement continueShoppingFromWishListButton;

    @FindBy(xpath = "//a[contains(text(), 'shopping cart')]")
    private WebElement shoppingCartLink;

    @FindBy(className = "breadcrumb")
    private WebElement goToAccount;

    @FindBy(xpath = "//p[text()[contains(.,'Your wish list is empty.')]]")
    private WebElement messageSuccessRemove;

    @FindBy(xpath = "//div[contains(text(), 'You have modified your wish list!')]")
    private WebElement modifiedWishList;


    public WishListPage(WebDriver driver){
        super(driver);
    }

    public void addProductToCart(){
        addProductToCartButton.click();
    }

    public void removeProductFromWishList(){
        removeProductFromWishListButton.click();
    }

    public void continueShoppingFromWishList(){
        continueShoppingFromWishListButton.click();
    }

    public String getMessageOnAlertCart() {
        return shoppingCartLink.getText();
    }

    public String getMessageSuccessRemove() {
        return messageSuccessRemove.getText();
    }
    public WebElement getShoppingCartLink() {
        return shoppingCartLink;
    }
    public String goToAccount() {
        return goToAccount.getText();
    }
    public WebElement getModifiedWishList(){
        return modifiedWishList;
    }
}
