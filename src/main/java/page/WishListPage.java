package page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class WishListPage extends BasePage {

    @FindBy(className = "btn-primary")
    protected List<WebElement> addProductToCartButton;

    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/table/tbody/tr/td[6]/a")
    protected WebElement removeProductFromWishListButton;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div")
    protected WebElement continueShoppingFromWishListButton;

    public WishListPage(WebDriver driver){
        super(driver);
    }

    public ShoppingCartPage addProductFromWishListToCart(int numberOfProduct){
        addProductToCartButton.get(numberOfProduct).click();
        return new ShoppingCartPage(driver);
    }

    public WishListPage removeProductFromWishList(){
        removeProductFromWishListButton.click();
        return this;
    }

    public LoginPage continueShoppingFromWishList(){
        continueShoppingFromWishListButton.click();
        return new LoginPage(driver);
    }

}
