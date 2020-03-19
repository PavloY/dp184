package page;

import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends BasePage {

    @FindBy(id = "input-firstname")
    private WebElement firstName;

    @FindBy(id = "input-lastname")
    private WebElement lastName;

    @FindBy(id = "input-email")
    private WebElement email;

    @FindBy(id = "input-email")
    private WebElement _email;

    @FindBy(id = "input-telephone")
    private WebElement telephone;

    @FindBy(id = "input-fax")
    private WebElement fax;

    @FindBy(id = "input-company")
    private WebElement company;

    @FindBy(id = "input-address-1")
    private WebElement address1;

    @FindBy(id = "input-address-2")
    private WebElement address2;

    @FindBy(id = "input-city")
    private WebElement city;

    @FindBy(id = "input-postcode")
    private WebElement postcode;

    @FindBy(id = "input-country")
    private WebElement country;

    @FindBy(id = "input-zone")
    private WebElement zone;

    @FindBy(id = "input-password")
    private WebElement password;

    @FindBy(id = "input-confirm")
    private WebElement confirm;


    @FindBy(name = "agree")
    private WebElement agree;

    @FindBy(xpath = "//input[@value='Continue']")
    private WebElement button;

    public RegisterPage(WebDriver driver) {
        super(driver);
    }


    public WebElement getFirstName() {
        return firstName;
    }

    public WebElement getLastName() {
        return lastName;
    }

    public WebElement getEmail() {
        return email;
    }

    public WebElement get_email() {
        return _email;
    }

    public WebElement getTelephone() {
        return telephone;
    }

    public WebElement getFax() {
        return fax;
    }

    public WebElement getCompany() {
        return company;
    }

    public WebElement getAddress1() {
        return address1;
    }

    public WebElement getAddress2() {
        return address2;
    }

    public WebElement getCity() {
        return city;
    }

    public WebElement getPostcode() {
        return postcode;
    }

    public WebElement getCountry() {
        return country;
    }

    public WebElement getZone() {
        return zone;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getConfirm() {
        return confirm;
    }

    public WebElement getAgree() {
        return agree;
    }


    public SuccessPage clickOnButtonWithValidData(){
        button.click();
        return new SuccessPage(driver);
    }

    public RegisterPage clickOnButtonWithInvalidData(){
        button.click();
        return this;
    }
}
