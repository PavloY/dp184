package page;

import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;

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

    @FindBy(xpath = "//input[@value='1']")
    private WebElement subscribe;


    @FindBy(name = "agree")
    private WebElement agree;

    @FindBy(xpath = "//input[@value='Continue']")
    private WebElement button;

    @FindBy(className = "alert-danger")
    private WebElement policyWarning;

    @FindBy(xpath = "//div[contains(text(), 'First Name must be')]")
    private WebElement firstNameDanger;

    @FindBy(xpath = "//div[contains(text(), 'Last Name must be')]")
    private WebElement lastNameDanger;

    @FindBy(xpath = "//div[contains(text(), 'E-Mail Address does not appear to be valid!')]")
    private WebElement emailDanger;

    @FindBy(xpath = "//div[contains(text(), 'Telephone must be')]")
    private WebElement telephoneDanger;

    @FindBy(xpath = "//div[contains(text(), 'Address 1 must be')]")
    private WebElement address1Danger;

    @FindBy(xpath = "//div[contains(text(), 'City must be')]")
    private WebElement cityDanger;

    @FindBy(xpath = "//div[contains(text(), 'Postcode must be')]")
    private WebElement postCodeDanger;

    @FindBy(xpath = "//div[contains(text(), 'Please select a country!')]")
    private WebElement countryDanger;

    @FindBy(xpath = "//div[contains(text(), 'Please select a region / state!')]")
    private WebElement regionDanger;

    @FindBy(xpath = "//div[contains(text(), 'Password must be')]")
    private WebElement passwordDanger;

    @FindBy(xpath = "//div[contains(text(), 'Password confirmation does not match password!')]")
    private WebElement confirmPassDanger;


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

    public void subscribe(){
        subscribe.click();
    }

    public WebElement getAgree() {
        return agree;
    }

    public void clickOnButtonContinue(){
        button.click();
    }

    public HashMap<String, String> getAllWarningMessages(){
        HashMap<String, String> result = new HashMap<>();
        if(isWarningMessage(policyWarning )){
            result.put("policy", policyWarning.getText());
        }
        if(isWarningMessage(firstNameDanger)){
            result.put("fName", firstNameDanger.getText());
        }
        if(isWarningMessage(lastNameDanger)){
            result.put("lName", lastNameDanger.getText());
        }
        if(isWarningMessage(emailDanger)){
            result.put("email", emailDanger.getText());
        }
        if(isWarningMessage(telephoneDanger)){
            result.put("telephone", telephoneDanger.getText());
        }
        if(isWarningMessage(address1Danger)){
            result.put("address1", address1Danger.getText());
        }
        if (isWarningMessage(cityDanger)) {
            result.put("city", cityDanger.getText());
        }
        if(isWarningMessage(postCodeDanger)){
            result.put("postCode", postCodeDanger.getText());
        }
        if(isWarningMessage(countryDanger)){
            result.put("country", countryDanger.getText());
        }
        if(isWarningMessage(regionDanger)){
            result.put("region", regionDanger.getText());
        }
        if(isWarningMessage(passwordDanger)){
            result.put("password", passwordDanger.getText());
        }
        if(isWarningMessage(confirmPassDanger)){
            result.put("confirmPass", confirmPassDanger.getText());
        }
        return result;
    }
}
