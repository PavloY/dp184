package page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;
import java.util.List;

public class EditAddressPage extends BasePage {

    @FindBy(id = "input-firstname")
    private WebElement firstName;

    @FindBy(id = "input-lastname")
    private WebElement lastName;

    @FindBy(id ="input-company")
    private WebElement company;

    @FindBy(id ="input-address-1")
    private WebElement address1;

    @FindBy(id = "input-address-2")
    private WebElement address2;

    @FindBy(id = "input-city")
    private WebElement city;

    @FindBy(id = "input-postcode")
    private  WebElement postCode;

    @FindBy(id = "input-country")
    private WebElement country;

    @FindBy(id = "input-zone")
    private WebElement zone;

    @FindBy( xpath = "//div[@class='pull-left']/a")
    private WebElement buttonBack;

    @FindBy(xpath = "//div[@class='pull-right']/input")
    private WebElement buttonContinue;

    @FindBy(xpath = "//label[@class='radio-inline']")
    private List<WebElement> defaultAddress;

    @FindBy(xpath = "//div[contains(text(), 'First Name must be')]")
    private WebElement firstNameDanger;

    @FindBy(xpath = "//div[contains(text(), 'Last Name must be')]")
    private WebElement lastNameDanger;

    @FindBy(xpath = "//div[contains(text(), 'Address 1 must be')]")
    private WebElement address1Danger;

    @FindBy(xpath = "//div[contains(text(), 'City must be')]")
    private WebElement cityDanger;

    @FindBy(xpath = "//div[contains(text(), 'Please select a country!')]")
    private WebElement countryDanger;

    @FindBy(xpath = "//div[contains(text(), 'Please select a region / state!')]")
    private WebElement regionDanger;



    public EditAddressPage(WebDriver driver) {
        super(driver);
    }

        public void fillFirstName(String userFirstName){
            fillField(firstName, userFirstName);
    }

    public void fillLastName(String userLastName){
        fillField(lastName, userLastName);
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
        fillField(postCode, userPostCode);
    }

    public void chooseCountry(String userCountry){
        chooseDataFromDropDownMenu(country, userCountry);
    }

    public void chooseRegion(String userRegion){
        chooseDataFromDropDownMenu(zone, userRegion);
    }

    public void defaultAddressYes(){
        defaultAddress.get(0).click();
    }

    public void defaultAddressNo(){
        defaultAddress.get(1).click();
    }

    public void clickOnButtonBack(){
        buttonBack.click();
    }

    public void clickOnButtonContinue(){
        buttonContinue.click();
    }

//    public EditAddressPage clickOnButtonContinueInvalidData(){
//        buttonContinue.click();
//        return this;
//    }
//
//    public String getFirstNameValue(){
//        return firstName.getAttribute("value");
//
 //   }
public HashMap<String, String> getAllWarningMessages(){
    HashMap<String, String> result = new HashMap<>();

    if(isWarningMessage(firstNameDanger)){
        result.put("fName", firstNameDanger.getText());
    }
    if(isWarningMessage(lastNameDanger)){
        result.put("lName", lastNameDanger.getText());
    }
    if(isWarningMessage(address1Danger)){
        result.put("address1", address1Danger.getText());
    }
    if (isWarningMessage(cityDanger)) {
        result.put("city", cityDanger.getText());
    }
    if(isWarningMessage(countryDanger)){
        result.put("country", countryDanger.getText());
    }
    if(isWarningMessage(regionDanger)){
        result.put("region", regionDanger.getText());
    }
    return result;
}

}
