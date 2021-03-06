package step;

import core.BaseStep;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.ProductPage;


public class ProductStep extends BaseStep<ProductPage> {
    private final Wait<WebDriver> wait;

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

    public ProductComparisonStep addProductToProductComparison() {
        page.addProductToProductComparison();
        wait.until(ExpectedConditions.visibilityOf(page.getProductComparisonLink()));
        page.goToProductComparison();
        String expected = "Product Comparison";
        String actual = driver.getTitle();
        Assert.assertEquals(expected, actual);
        return new ProductComparisonStep(driver);
    }

    public WishListStep addProductToWishList() {
        page.addProductToWishList();
        wait.until(ExpectedConditions.visibilityOf(page.getWishListLink()));
        page.goToWishList();
        return new WishListStep(driver);
    }

}
