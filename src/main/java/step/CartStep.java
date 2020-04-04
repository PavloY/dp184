package step;

import core.BaseStep;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.ShoppingCartPage;

public class CartStep extends BaseStep<ShoppingCartPage> {

    private final Wait<WebDriver> wait;

    public CartStep(WebDriver driver) {
        super(driver, new ShoppingCartPage(driver));
        wait = new WebDriverWait(driver, 5, 1000);
    }

    public CartStep checkEmptyShoppingCart(){
        page.goToShoppingCartPage();
        String expected = "Your shopping cart is empty!";
        String actual = page.getMessageEmptyCart();
        Assert.assertEquals(expected, actual);
        return this;
    }
    public CartStep checkAddProductToCart(){
        wait.until(ExpectedConditions.visibilityOf(page.getShoppingCartTitle()));
        String expected = "iPhone";
        String actual = page.getNameOfProduct();
        Assert.assertEquals(expected, actual);
        return this;
    }

}
