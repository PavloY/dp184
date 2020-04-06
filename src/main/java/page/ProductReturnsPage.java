package page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductReturnsPage extends BasePage {

    public ProductReturnsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//p[text()=Please complete the form below to request an RMA number.]")
    private WebElement pleaseComplete;

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

    //    radio buttons
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
    //    end of radio buttons

    @FindBy(id = "input-comment")
    private WebElement faultyOrOtherDetails;

    @FindBy(xpath = "//input[@value='Submit']")
    private WebElement submitButton;

    //    Error Messages
    @FindBy(xpath = "//div[contains(text(), 'First Name must be')]")
    private WebElement warningForFirstName;
    @FindBy(xpath = "//div[contains(text(), 'Last Name must be')]")
    private WebElement warningForLastName;
    @FindBy(xpath = "//div[contains(text(), 'E-Mail Address does not appear')]")
    private WebElement warningForEmail;
    @FindBy(xpath = "//div[contains(text(), 'Telephone must be')]")
    private WebElement warningForTelephone;
    @FindBy(xpath = "//div[contains(text(), 'Order ID required!')]")
    private WebElement warningForOrderId;
    @FindBy(xpath = "//div[contains(text(), 'Product Name must be')]")
    private WebElement warningForProductName;
    @FindBy(xpath = "//div[contains(text(), 'Product Model must be')]")
    private WebElement warningForProductCode;
    @FindBy(xpath = "//div[contains(text(), 'You must select a return product reason!')]")
    private WebElement warningForReasonForReturn;
    @FindBy(xpath = "p[text()=Please complete the form below to request an RMA number.")
    private WebElement failedMessage;
    //    end of error messages

    public WebElement getPleaseComplete() {
        return pleaseComplete;
    }

    public WebElement getWarningForFirstName() {
        return warningForFirstName;
    }

    public WebElement getWarningForLastName() {
        return warningForLastName;
    }

    public WebElement getWarningForEmail() {
        return warningForEmail;
    }

    public WebElement getWarningForTelephone() {
        return warningForTelephone;
    }

    public WebElement getWarningForOrderId() {
        return warningForOrderId;
    }

    public WebElement getWarningForProductName() {
        return warningForProductName;
    }

    public WebElement getWarningForProductCode() {
        return warningForProductCode;
    }

    public WebElement getWarningForReasonForReturn() {
        return warningForReasonForReturn;
    }

    public WebElement getFailedMessage() {
        return failedMessage;
    }

    public void fillFirstName(String userFirstName) {
        fillField(firstName, userFirstName);
    }

    public void fillLastName(String userLastName) {
        fillField(lastName, userLastName);
    }

    public void fillEmail(String userEmail) {
        fillField(email, userEmail);
    }

    public void fillTelephone(String userTelephone) {
        fillField(telephone, userTelephone);
    }

    public void fillOrderId(String userOrderId) {
        fillField(orderId, userOrderId);
    }

    public void fillOrderDate(String userOrderDate) {
        fillField(orderDate, userOrderDate);
    }

    public void fillProductName(String userProductName) {
        fillField(productName, userProductName);
    }

    public void fillProductCode(String userProductCode) {
        fillField(productCode, userProductCode);
    }

    public void fillQuantity(String userQuantity) {
        fillField(quantity, userQuantity);
    }

    public void fillFaultyOrOtherDetails(String userFaultyOrOtherDetails) {
        fillField(faultyOrOtherDetails, userFaultyOrOtherDetails);
    }

    public void chooseRadioButtonDeadOnArrival() {
        chooseRadioButton(deadOnArrival);
    }

    public void clickOnSubmitButton() {
        submitButton.click();
    }
}