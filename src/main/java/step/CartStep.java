package step;

import core.BaseStep;
import data.ContactUsData;
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

    public boolean isEmptyShoppingCart() {
        try {
            page.goToShoppingCartPage();
            wait.until(ExpectedConditions.visibilityOf(page.getShoppingCartTitle()));
            String expected = "Your shopping cart is empty!";
            String actual = page.getMessageEmptyCart();
            Assert.assertEquals(expected, actual);
            return true;
        } catch (NoSuchElementException e) {
            System.out.println("Your cart isn't empty.");
            return false;
        }
    }

    public CartStep getEmptyCart() {
        if (isEmptyShoppingCart()) {
            return this;
        } else {
            for (int i = 0; i < page.getItems().size(); i++) {
                page.getItems().get(i).getRemove().click();
            }
            return this;
        }
    }

    public CartStep addProductToCart() {
        String expected = ContactUsData.LINK_IPHONE;
            //    page.goToHomePage().getLinkProductsList().get(1); It needs to update
        String actual = page.getItems().get(0).getName().findElement(By.tagName("a")).getAttribute("href");
        Assert.assertEquals(expected, actual);
        return this;
    }

    public CheckoutStep clickOnCheckoutButton(){
        page.clickOnCheckoutButton();
        String expected = "Checkout";
        String actual = page.getTitlePage();
        Assert.assertEquals(expected, actual);
        return new CheckoutStep(driver);
    }

}
