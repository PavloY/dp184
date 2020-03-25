package page;

import core.BasePage;
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

    public WishListPage(WebDriver driver){
        super(driver);
    }

    public ShoppingCartPage addProductToCart(){
        addProductToCartButton.click();
        return new ShoppingCartPage(driver);
    }

    public WishListPage removeProductFromWishList(){
        removeProductFromWishListButton.click();
        return this;
    }

    public LogInPage continueShoppingFromWishList(){
        continueShoppingFromWishListButton.click();
        return new LogInPage(driver);
    }

}
