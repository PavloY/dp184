package step;

import core.BaseStep;
import data.LoginUser;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import page.CheckoutPage;
import page.LoginPage;

public class CheckoutStep  extends BaseStep<CheckoutPage> {
    public CheckoutStep(WebDriver driver) {
        super(driver, new CheckoutPage(driver));
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
        page.checkboxAgree();
        page.clickPaymentMethod();
        page.clickConfirmOrder();
        String expected = "Your order has been placed!";
        String actual = page.getTitlePage();
        Assert.assertEquals(expected, actual);
        return new SuccessStep(driver);
    }

}
