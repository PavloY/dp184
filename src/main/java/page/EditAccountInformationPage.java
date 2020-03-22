package page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditAccountInformationPage extends BasePage {

    @FindBy(id = "input-firstname")
    private WebElement firstName;

    @FindBy(id = "input-lastname")
    private WebElement lastName;

    @FindBy(id = "input-email")
    private WebElement email;

    @FindBy(id = "input-telephone")
    private WebElement phone;

    @FindBy(id = "input-fax")
    private WebElement fax;

    @FindBy(xpath = "//div[@class='pull-left']/a")
    private WebElement buttonBack;

    @FindBy(xpath = "//div[@class='pull-right']/input")
    private WebElement buttonContinue;


    public EditAccountInformationPage(WebDriver driver) {
        super(driver);
    }

    public EditAccountInformationPage updateFirstName(String newUserFirstName, boolean clear){
        if(clear) firstName.clear();
        firstName.sendKeys(newUserFirstName);
        return this;
    }

    public EditAccountInformationPage updateLastName(String newUserLastName, boolean clear){
        if(clear) lastName.clear();
        lastName.sendKeys(newUserLastName);
        return this;
    }

    public EditAccountInformationPage updateEmail(String newUserEmail, boolean clear){
        if(clear) email.clear();
        email.sendKeys(newUserEmail);
        return this;
    }

    public EditAccountInformationPage updatePhone(String newUserPhone, boolean clear){
        if(clear) phone.clear();
        phone.sendKeys(newUserPhone);
        return this;
    }

    public EditAccountInformationPage updateFax(String newUserPhone, boolean clear){
        if(clear) fax.clear();
        fax.sendKeys(newUserPhone);
        return this;
    }

    public void clickOnBackButton(){
        buttonBack.click();
    }

    public void clickOnContinueButton(){
        buttonContinue.click();
    }


}
