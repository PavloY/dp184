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

    @FindBy(xpath = "//div[contains(text(), 'First Name must be')]")
    public WebElement firstNameDanger;


    public RegisterPage(WebDriver driver) {
        super(driver);
    }


    public void fillFirstName(String userFirstName){
        fillField(firstName, userFirstName);
    }

    public void fillLastName(String userLastName){
        fillField(lastName, userLastName);
    }

    public void fillEmail(String userEmail){
        fillField(email, userEmail);
    }

    public void fillTelephone(String userTelephone){
        fillField(telephone, userTelephone);
    }

    public void fillFax(String userFax){
        fillField(fax, userFax);
    }

    public void fillCompany(String userCompany){
        fillField(company, userCompany);
    }

    public void fillAddress1(String userAddress1){
        fillField(address1, userAddress1);
    }

    public void fillAddress2(String userAddress2){
        fillField(address2, userAddress2);
    }

    public void fillCity(String userCity){
        fillField(city, userCity);
    }

    public void fillPostCode(String userPostCode){
        fillField(postcode, userPostCode);
    }

    public void chooseCountry(String userCountry){
        chooseDataFromDropDownMenu(country, userCountry);
    }

    public void chooseRegion(String userRegion){
        chooseDataFromDropDownMenu(zone, userRegion);
    }

    public void fillPassword(String userPassword){
        fillField(password, userPassword);
    }

    public void fillConfirmPassword(String userConfirmPassword){
        fillField(confirm, userConfirmPassword);
    }

    public WebElement getAgree() {
        return agree;
    }

    public void clickOnButtonContinue(){
        button.click();
    }
}
