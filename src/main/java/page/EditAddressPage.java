package page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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


    public EditAddressPage(WebDriver driver) {
        super(driver);
    }

        public EditAddressPage fillFirstName(String userFirstName){
            fillField(firstName, userFirstName);
            return this;
    }

    public EditAddressPage fillLastName(String userLastName){
        fillField(lastName, userLastName);
        return this;
    }

    public EditAddressPage fillCompany(String userCompany){
        fillField(company, userCompany);
        return this;
    }

    public EditAddressPage fillAddress1(String userAddress1){
        fillField(address1, userAddress1);
        return this;
    }

    public EditAddressPage fillAddress2(String userAddress2){
        fillField(address2, userAddress2);
        return this;
    }

    public EditAddressPage fillCity(String userCity){
        fillField(city, userCity);
        return this;
    }

    public EditAddressPage fillPostCode(String userPostCode){
        fillField(postCode, userPostCode);
        return this;
    }

    public EditAddressPage chooseCountry(String userCountry){
        chooseDataFromDropDownMenu(country, userCountry);
        return this;
    }

    public EditAddressPage chooseRegion(String userRegion){
        chooseDataFromDropDownMenu(zone, userRegion);
        return this;
    }

    public void clickOnButtonBack(){
        buttonBack.click();
    }

    public void clickOnButtonContinueValidData(){
        buttonContinue.click();
    }

    public EditAddressPage clickOnButtonContinueInvalidData(){
        buttonContinue.click();
        return this;
    }

    public String getFirstNameValue(){
        return firstName.getAttribute("value");

    }
}
