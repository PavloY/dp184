package page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductReturnsPage extends BasePage {

    public ProductReturnsPage(WebDriver driver) {
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

    @FindBy(xpath = "//div[@class=\"radio\"]/label[contains(.,\"Dead On Arrival\")]/input")
    private WebElement deadOnArrival;
    @FindBy(xpath = "//div[@class=\"radio\"]/label[contains(.,\"Faulty, please supply details\")]/input")
    private WebElement faultyPleaseSupplyDetails;
    @FindBy(xpath = "//div[@class=\"radio\"]/label[contains(.,\"Other, please supply details\")]/input")
    private WebElement otherPleaseSupplyDetails;
    @FindBy(xpath = "//div[@class=\"radio\"]/label[contains(.,\"Order Error\")]/input")
    private WebElement orderError;
    @FindBy(xpath = "//div[@class=\"radio\"]/label[contains(.,\"Received Wrong Item\")]/input")
    private WebElement receivedWrongItem;

    @FindBy(id = "input-comment")
    private WebElement faultyOrOtherDetails;

    @FindBy(xpath = "//input[@value='Submit']")
    private WebElement submitButton;

    public ProductReturnsPage fillFirstName(String userFirstName) {
        fillField(firstName, userFirstName);
        return this;
    }

    public ProductReturnsPage fillLastName(String userLastName) {
        fillField(lastName, userLastName);
        return this;
    }

    public ProductReturnsPage fillEmail(String userEmail) {
        fillField(email, userEmail);
        return this;
    }

    public ProductReturnsPage fillTelephone(String userTelephone) {
        fillField(telephone, userTelephone);
        return this;
    }

    public ProductReturnsPage fillOrderId(String userOrderId) {
        fillField(orderId, userOrderId);
        return this;
    }

    public ProductReturnsPage fillOrderDate(String userOrderDate) {
        fillField(orderDate, userOrderDate);
        return this;
    }

    public ProductReturnsPage fillProductName(String userProductName) {
        fillField(productName, userProductName);
        return this;
    }

    public ProductReturnsPage fillProductCode(String userProductCode) {
        fillField(productCode, userProductCode);
        return this;
    }

    public ProductReturnsPage fillQuantity(String userQuantity) {
        fillField(quantity, userQuantity);
        return this;
    }

    public ProductReturnsPage fillFaultyOrOtherDetails(String userFaultyOrOtherDetails) {
        fillField(faultyOrOtherDetails, userFaultyOrOtherDetails);
        return this;
    }

    public ProductReturnsPage chooseRadioButtonDeadOnArrival() {
        //chooseRadioButton(deadOnArrival);
        return this;
    }

    public SuccessPage clickOnButtonForValidData() {
        submitButton.click();
        return new SuccessPage(driver);
    }

    public ProductReturnsPage clickOnButtonForInvalidData() {
        submitButton.click();
        return this;
    }
}