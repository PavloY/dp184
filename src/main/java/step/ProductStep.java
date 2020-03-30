package step;

import core.BaseStep;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import page.ProductPage;

import java.util.concurrent.TimeUnit;

public class ProductStep extends BaseStep<ProductPage> {
    public ProductStep(WebDriver driver) {
        super(driver, new ProductPage(driver));
    }

    public ProductStep checkSuccessMessageAddToProductComparison(){
        page.addProductToProductComparison();
        String expected = "product comparison";
        String actual = page.getMessageOnAlertProductComparison();
        Assert.assertEquals(expected, actual);
        return this;
    }

    public ProductStep checkSuccessMessageAddToWishList(){
        page.addProductToWishList();
        String expected = "wish list";
        String actual = page.getMessageOnAlertWishList();
        Assert.assertEquals(expected, actual);
        return this;
    }

    public ProductStep checkSuccessMessageAddToCart(){
        page.addToCart();
        String expected = "shopping cart";
        String actual = page.getMessageOnAlertCart();
        Assert.assertEquals(expected, actual);
        return this;
    }

    public ProductStep checkAddProductToCart(){
        page.addToCart();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        page.goToShoppingCartPage();
        String expected = "Shopping Cart";
        String actual = driver.getTitle();
        Assert.assertEquals(expected, actual);
        return new ProductStep(driver);
    }
}
