package step;

import core.BaseStep;
import data.LoginUser;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.CheckoutPage;


public class CheckoutStep  extends BaseStep<CheckoutPage> {
    private final Wait<WebDriver> wait;



    public CheckoutStep(WebDriver driver) {
        super(driver, new CheckoutPage(driver));
        wait = new WebDriverWait(driver, 15, 1000);
    }


    public CheckoutStep fillAllFields(LoginUser user){
        page.fillLoginEmail(user.getEmail());
        page.fillLoginPassword(user.getPassword());
        page.clickLogInPageButton();
        return this;
    }

    public SuccessStep checkoutAllContinueButtons(){
        page.clickPaymentAddress();
        page.clickShippingAddress();
        page.clickShippingMethod();
        wait.until(ExpectedConditions.visibilityOf(page.getCheckBoxAgree()));
        page.checkboxAgree();
        page.clickPaymentMethod();
        page.clickConfirmOrder();
        wait.until(ExpectedConditions.titleContains("Your order has been placed!"));
        String expected = "Your order has been placed!";
        String actual = page.getTitlePage();
        Assert.assertEquals(expected, actual);
        return new SuccessStep(driver);
    }

}
