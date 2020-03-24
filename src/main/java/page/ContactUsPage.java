package page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends BasePage {

    @FindBy(id="input-name")
    private WebElement name;

    @FindBy(id="input-email")
    private WebElement email;

    @FindBy(id="input-enquiry")
    private WebElement enquiry;

    @FindBy(xpath = "//input[@value='Submit']")
    private WebElement submitButton;


    public ContactUsPage(WebDriver driver) {
        super(driver);
    }

    public ContactUsPage fillName(String userName){
        fillField(name,userName);
        return this;
    }
    public ContactUsPage fillEmail(String userEmail){
        fillField(email,userEmail);
        return this;
    }
    public ContactUsPage fillEnquiry(String userEnquiry){
        name.sendKeys(userEnquiry);
        return this;
    }
}
