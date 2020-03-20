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

    ////Reason for Return?????????////////
///////// copy XPATH vs full XPATH

//    change to short xpath
    @FindBy(xpath = "/html/body/div[2]/div/div/form/fieldset[2]/div[4]/div/div[1]/label/input")
    private WebElement deadOnArrival;

    @FindBy(id = "input-comment")
    private WebElement faultyOrOtherDetails;

    @FindBy(xpath = "/html/body/div[2]/div/div/form/div/div[2]/input")
    private WebElement submitButton;

    public WebElement getFirstName() {
        return firstName;
    }

    public WebElement getEmail() {
        return email;
    }

    public WebElement getTelephone() {
        return telephone;
    }

    public WebElement getOrderId() {
        return orderId;
    }

    public WebElement getOrderDate() {
        return orderDate;
    }

    public WebElement getProductName() {
        return productName;
    }

    public WebElement getProductCode() {
        return productCode;
    }

    public WebElement getQuantity() {
        return quantity;
    }

    public WebElement getDeadOnArrival() {
        return deadOnArrival;
    }

    public WebElement getFaultyOrOtherDetails() {
        return faultyOrOtherDetails;
    }

    //    public SuccessPage clickOnButtonWithValidData(){
//        submitButton.click();
//        return new SuccessPage(driver);
//    }

    public ProductReturns clickOnButtonWithInvalidData() {
        submitButton.click();
        return this;
    }
}
