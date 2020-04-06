package step;

import core.BaseStep;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.ProductPage;
import page.WishListPage;

public class WishListStep extends BaseStep<WishListPage> {

    private final Wait<WebDriver> wait;

    public WishListStep(WebDriver driver) {
        super(driver, new WishListPage(driver));
        wait = new WebDriverWait(driver, 10, 1000);
    }

    public CartStep addProductToCartFromWishList() {
        page.addProductToCart();
        wait.until(ExpectedConditions.visibilityOf(page.getShoppingCartLink()));
        page.getShoppingCartLink().click();
        String expected = "Shopping Cart";
        String actual = driver.getTitle();
        Assert.assertEquals(expected, actual);
        return new CartStep(driver);

    }

    private boolean isEmptyWishList() {
        try {
            String expected = "Your wish list is empty.";
            String actual = page.getMessageSuccessRemove();
            Assert.assertEquals(expected, actual);
            return true;
        } catch (NoSuchElementException e) {
            System.out.println("Your wish list isn't empty.");
            return false;
        }
    }

    public WishListStep getEmptyWishList() {
        do {
            if (!isEmptyWishList())
            {
                page.removeProductFromWishList();
            }
        } while (!isEmptyWishList());
        return this;
    }


    public WishListStep removeProductFromWishList() {
        page.removeProductFromWishList();
        String expected = "Your wish list is empty.";
        String actual = page.getMessageSuccessRemove();
        Assert.assertEquals(expected, actual);
        return this;
    }

    public MyAccountStep continueShoppingFromWishListTest() {
        page.continueShoppingFromWishList();
        String expected = "Account";
        String actual = page.goToAccount();
        Assert.assertEquals(expected, actual);
        return new MyAccountStep(driver);
    }
}
