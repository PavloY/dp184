package step;

import core.BaseStep;
import data.Constants;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
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

    private void emptyShoppingCart() {
        page.goToShoppingCartPage();
        wait.until(ExpectedConditions.visibilityOf(page.getShoppingCartTitle()));
        String expected = "Your shopping cart is empty!";
        String actual = page.getMessageEmptyCart();
        Assert.assertEquals(expected, actual);
    }

    private boolean isEmptyShoppingCart() {
        boolean elementCondition = false;
        try {
            elementCondition = page.getContinueButtonEmptyCart().isDisplayed();
        } catch (NoSuchElementException e) {
            return elementCondition;
        }
        return elementCondition;
    }


    public CartStep getEmptyCart() {
        if (!isEmptyShoppingCart()) {
            do {
                removeProductFromCart();
            } while (!isEmptyShoppingCart());
            emptyShoppingCart();
            return this;
        } else {
            isEmptyShoppingCart();
            emptyShoppingCart();
            return this;
        }
    }

    public void removeProductFromCart() {
        page.getItems().get(0).getRemove().click();
        wait.until(ExpectedConditions.visibilityOf(page.getContinueButtonEmptyCart()));
    }

    public String getMessageEmptyCart() {
        return page.getMessageEmptyCart();
    }

    public CartStep addProductToCart() {
        String expected = Constants.LINK_IPHONE;
        String actual = page.getItems().get(0).getName().findElement(By.tagName("a")).getAttribute("href");
        Assert.assertEquals(expected, actual);
        return this;
    }

    public CheckoutStep clickOnCheckoutButton() {
        page.clickOnCheckoutButton();
        String expected = "Checkout";
        String actual = page.getTitlePage();
        Assert.assertEquals(expected, actual);
        return new CheckoutStep(driver);
    }
}
