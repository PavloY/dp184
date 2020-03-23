package page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class WishListPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/table/tbody/tr/td[6]/button")
    protected WebElement addProductToCartButton;

    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/table/tbody/tr/td[6]/a")
    protected WebElement removeProductFromWishListButton;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div")
    protected WebElement continueShoppingFromWishListButton;

    public WishListPage(WebDriver driver){
        super(driver);
    }

    public void addProductFromWishListToCart(){
        addProductToCartButton.click();
        // return new ShoppingCartPage(driver);
    }

    public WishListPage removeProductFromWishList(){
        removeProductFromWishListButton.click();
        return this;
    }

    public void continueShoppingFromWishList(){
        continueShoppingFromWishListButton.click();
        // return new LoginPage(driver);
    }

}
