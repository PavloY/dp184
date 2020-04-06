package page;

import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {
    @FindBy(id = "input-email")
    private WebElement emailAddressField;

    @FindBy(id = "input-password")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@value='Login']")
    private WebElement loginButton;

    @FindBy(id = "button-payment-address")
    private WebElement continuePaymentAddress;

    @FindBy(id = "button-shipping-address")
    private WebElement continueShippingAddress;

    @FindBy(id = "button-shipping-method")
    private WebElement continueShippingMethod;

    @FindBy(xpath = "//input[@name='agree']")
    private WebElement checkboxAgree;

    @FindBy(id = "button-payment-method")
    private WebElement continuePaymentMethod;

    @FindBy(id ="button-confirm")
    private WebElement confirmOrder;


    public CheckoutPage(WebDriver driver) {
        super(driver);
    }


    public void fillLoginEmail(String userEmail){
        fillField(emailAddressField,userEmail);
    }

    public void  fillLoginPassword(String userPassword){
        fillField(passwordField,userPassword);
    }

    public void clickLogInPageButton() {
        loginButton.click();
    }

    public void clickPaymentAddress() {
        continuePaymentAddress.click();
    }

    public void clickShippingAddress() {
        continueShippingAddress.click();
    }

    public void clickShippingMethod() {
        continueShippingMethod.click();
    }

    public void checkboxAgree(){
        chooseCheckBox(checkboxAgree);
    }

    public void clickPaymentMethod() {
        continuePaymentMethod.click();
    }

    public void clickConfirmOrder() {
        confirmOrder.click();
    }
}
