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
        PageFactory.initElements(driver, this);
    }

    public RegisterPage fillFirstName(String userFirstName){
        firstName.sendKeys(userFirstName);
        return this;
    }

    public RegisterPage fillLastName(String userLastName){
        lastName.sendKeys(userLastName);
        return this;
    }

    public RegisterPage fillEmail(String userEmail){
        _email.sendKeys(userEmail);
        return this;
    }

    public RegisterPage fillPhone(String userPhone){
        telephone.sendKeys(userPhone);
        return this;
    }

    public RegisterPage fillFax(String userFax){
        fax.sendKeys(userFax);
        return this;
    }

    public RegisterPage fillCompany(String userCompany){
        company.sendKeys(userCompany);
        return this;
    }

    public RegisterPage fillAddress1(String userAddress1){
        address1.sendKeys(userAddress1);
        return this;
    }

    public RegisterPage fillAddress2(String userAddress2){
        address2.sendKeys(userAddress2);
        return this;
    }

    public RegisterPage fillCity (String userCity){
        city.sendKeys(userCity);
        return this;
    }

    public RegisterPage fillPostCode(String userPostCode){
        postcode.sendKeys(userPostCode);
        return this;
    }

    public RegisterPage chooseCountry(String userCountry){
        country.click();
        driver.findElement(By.xpath("//*[@id='input-country']/option[text()='"+ userCountry + "']")).click();
        return this;
    }

    public RegisterPage chooseRegion(String userRegion){
        zone.click();
        driver.findElement(By.xpath("//*[@id='input-zone']/option[text()='" + userRegion + "']")).click();
        return this;
    }

    public RegisterPage fillPassword(String userPassword){
        password.sendKeys(userPassword);
        return this;
    }

    public RegisterPage fillConfirmPassword(String userConfirmPassword){
        confirm.sendKeys(userConfirmPassword);
        return this;
    }

    public RegisterPage chooseSubscribe(String userSubscribe){
        if(userSubscribe.equals("Yes")){
            driver.findElement(By.xpath("//label[@class='radio-inline'][1]/input")).click();
        }
        return this;
    }

    public RegisterPage checkAgree(){
        agree.click();
        return  this;
    }

    public SuccessPage clickOnButtonWithValidData(){
        button.click();
        return new SuccessPage(driver);
    }

    public RegisterPage clickOnButtonWithInvalidData(){
        button.click();
        return this;
    }

//    public SuccessPage registerOnlyWithOnlyNecessaryFields(){
//        firstName.sendKeys("Boris");
//        lastName.sendKeys("Borisov");
//        _email.sendKeys("Borisov@gmail.com");
//        telephone.sendKeys("79055625489");
//        address1.sendKeys("Moscow");
//        city.sendKeys("Moscow");
//        country.click();
//        driver.findElement(By.xpath("//*[@id='input-country']/option[text()='Russian Federation']")).click();
//        zone.click();
//        driver.findElement(By.xpath("//*[@id='input-zone']/option[text()='Moscow']")).click();
//        password.sendKeys("QWERTY");
//        confirm.sendKeys("QWERTY");
//        agree.click();
//        button.click();
//        return new SuccessPage(driver);
//    }
}
