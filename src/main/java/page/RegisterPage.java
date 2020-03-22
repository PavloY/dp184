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


    public RegisterPage fillFirstName(String userFirstName){
        fillField(firstName, userFirstName);
        return this;
    }

    public RegisterPage fillLastName(String userLastName){
        fillField(lastName, userLastName);
        return this;
    }

    public RegisterPage fillEmail(String userEmail){
        fillField(email, userEmail);
        return this;
    }

    public RegisterPage fillTelephone(String userTelephone){
        fillField(telephone, userTelephone);
        return this;
    }

    public RegisterPage fillFax(String userFax){
        fillField(fax, userFax);
        return this;
    }

    public RegisterPage fillCompany(String userCompany){
        fillField(company, userCompany);
        return this;
    }

    public RegisterPage fillAddress1(String userAddress1){
        fillField(address1, userAddress1);
        return this;
    }

    public RegisterPage fillAddress2(String userAddress2){
        fillField(address2, userAddress2);
        return this;
    }

    public RegisterPage fillCity(String userCity){
        fillField(city, userCity);
        return this;
    }

    public RegisterPage fillPostCode(String userPostCode){
        fillField(postcode, userPostCode);
        return this;
    }

    public RegisterPage chooseCountry(String userCountry){
        chooseDataFromDropDownMenu(country, userCountry);
        return this;
    }

    public RegisterPage chooseRegion(String userRegion){
        chooseDataFromDropDownMenu(zone, userRegion);
        return this;
    }

    public RegisterPage fillPassword(String userPassword){
        fillField(password, userPassword);
        return this;
    }

    public RegisterPage fillConfirmPassword(String userConfirmPassword){
        fillField(confirm, userConfirmPassword);
        return this;
    }

    public WebElement getAgree() {
        return agree;
    }

    public SuccessPage clickOnButtonWithValidData(){
        System.out.println(5555);
        button.click();
        return new SuccessPage(driver);
    }

    public RegisterPage clickOnButtonWithInvalidData(){
        button.click();
        return this;
    }
}
