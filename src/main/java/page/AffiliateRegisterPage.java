package page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AffiliateRegisterPage extends BasePage {

    public AffiliateRegisterPage(WebDriver driver) {
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

    @FindBy(id = "input-address-1")
    private WebElement address1;

    @FindBy(id = "input-city")
    private WebElement city;

    @FindBy(id = "input-postcode")
    private WebElement postcode;

    @FindBy(id = "input-zone")
    private WebElement region;

    @FindBy(xpath = "//div//*[(text()='Stirling')]")
    private WebElement regionStirling;

    @FindBy(id = "input-password")
    private WebElement password;

    @FindBy(id = "input-confirm")
    private WebElement passwordConfirm;

    @FindBy(xpath = "//input[contains(@name, 'agree')]")
    private WebElement agreeCheckbox;

    @FindBy(xpath = "//input[contains(@value, 'Continue')]")
    private WebElement buttonContinue;

    //    Error Messages
    @FindBy(xpath = "//div[contains(text(), 'First Name must be')]")
    private WebElement warningForFirstName;
    @FindBy(xpath = "//div[contains(text(), 'Last Name must be')]")
    private WebElement warningForLastName;
    @FindBy(xpath = "//div[contains(text(), 'E-Mail Address does not appear')]")
    private WebElement warningForEmail;
    @FindBy(xpath = "//div[contains(text(), 'Telephone must be')]")
    private WebElement warningForTelephone;
    @FindBy(xpath = "//div[contains(text(), 'Address 1 must be')]")
    private WebElement warningForAddress1;
    @FindBy(xpath = "//div[contains(text(), 'City must be')]")
    private WebElement warningForCity;
    @FindBy(xpath = "//div[contains(text(), 'Postcode must be')]")
    private WebElement warningForPostcode;
    @FindBy(xpath = "//div[contains(text(), 'Please select a region')]")
    private WebElement warningForRegion;
    @FindBy(xpath = "//div[contains(text(), 'Password must be')]")
    private WebElement warningForPassword;
    @FindBy(xpath = "//div[contains(text(), 'does not match')]")
    private WebElement warningForPasswordConfirm;
    @FindBy(xpath = "//div[contains(text(), 'Warning')]")
    private WebElement warningForAgreeCheckbox;
    //    end of error messages

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

    public WebElement getWarningForAddress1() {
        return warningForAddress1;
    }

    public WebElement getWarningForCity() {
        return warningForCity;
    }

    public WebElement getWarningForPostcode() {
        return warningForPostcode;
    }

    public WebElement getWarningForRegion() {
        return warningForRegion;
    }

    public WebElement getWarningForPassword() {
        return warningForPassword;
    }

    public WebElement getWarningForPasswordConfirm() {
        return warningForPasswordConfirm;
    }

    public WebElement getWarningForAgreeCheckbox() {
        return warningForAgreeCheckbox;
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

    public void fillAddress1(String userAddress1) {
        fillField(address1, userAddress1);
    }

    public void fillCity(String userCity) {
        fillField(city, userCity);
    }

    public void fillPostcode(String userPostcode) {
        fillField(postcode, userPostcode);
    }

    public void chooseRegionStirling() {
        region.click();
        regionStirling.click();
    }

    public void fillPassword(String userPassword) {
        fillField(password, userPassword);
    }

    public void fillPasswordConfirm(String userPasswordConfirm) {
        fillField(passwordConfirm, userPasswordConfirm);
    }

    public void chooseAgree() {
        chooseCheckBox(agreeCheckbox);
    }

    public void buttonContinueClick() {
        buttonContinue.click();
    }
}