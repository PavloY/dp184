package page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductReturns extends BasePage {

    public ProductReturns(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "input-firstname")
    private WebElement firstName;

    @FindBy(id = "input-lastname")
    private WebElement lastName;

    @FindBy(id = "input-email")
    private WebElement email;

    @FindBy(id = "input-telephone")
    private WebElement telephone;

    @FindBy(id = "input-order-id")
    private WebElement orderId;

    @FindBy(id = "input-date-ordered")
    private WebElement orderDate;

    @FindBy(id = "input-product")
    private WebElement productName;

    @FindBy(id = "input-model")
    private WebElement productCode;

    @FindBy(id = "input-quantity")
    private WebElement quantity;

    @FindBy(xpath = "//input[@value='1']")
    private WebElement deadOnArrival;

    @FindBy(id = "input-comment")
    private WebElement faultyOrOtherDetails;

    @FindBy(xpath = "//input[@value='Submit']")
    private WebElement submitButton;

    public ProductReturns fillFirstName(String userFirstName) {
        fillField(firstName, userFirstName);
        return this;
    }

    public ProductReturns fillLastName(String userLastName) {
        fillField(lastName, userLastName);
        return this;
    }

    public ProductReturns fillEmail(String userEmail) {
        fillField(email, userEmail);
        return this;
    }

    public ProductReturns fillTelephone(String userTelephone) {
        fillField(telephone, userTelephone);
        return this;
    }

    public ProductReturns fillOrderId(String userOrderId) {
        fillField(orderId, userOrderId);
        return this;
    }

    public ProductReturns fillOrderDate(String userOrderDate) {
        fillField(orderDate, userOrderDate);
        return this;
    }

    public ProductReturns fillProductName(String userProductName) {
        fillField(productName, userProductName);
        return this;
    }

    public ProductReturns fillProductCode(String userProductCode) {
        fillField(productCode, userProductCode);
        return this;
    }

    public ProductReturns fillQuantity(String userQuantity) {
        fillField(quantity, userQuantity);
        return this;
    }

    public ProductReturns fillFaultyOrOtherDetails(String userFaultyOrOtherDetails) {
        fillField(faultyOrOtherDetails, userFaultyOrOtherDetails);
        return this;
    }

    public ProductReturns chooseCheckBoxDeadOnArrival(WebElement deadOnArrival) {
        chooseCheckBox(deadOnArrival);
        return this;
    }

    public SuccessPage clickOnButtonForValidData() {
        submitButton.click();
        return new SuccessPage(driver);
    }

    public ProductReturns clickOnButtonForInvalidData() {
        submitButton.click();
        return this;
    }
}