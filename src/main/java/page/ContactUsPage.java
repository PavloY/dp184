package page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;

public class ContactUsPage extends BasePage {

    @FindBy(id="input-name")
    private WebElement name;

    @FindBy(id="input-email")
    private WebElement email;

    @FindBy(id="input-enquiry")
    private WebElement enquiry;

    @FindBy(xpath = "//input[@value='Submit']")
    private WebElement submitButton;

    @FindBy(xpath = "//div[contains(text(), 'Name must be between 3 and 32')]")
    private WebElement nameDanger;

    @FindBy(xpath = "//div[contains(text(), 'E-Mail Address does not appear to be')]")
    private WebElement emailDanger;

    @FindBy(xpath = "//div[contains(text(), 'Enquiry must be between 10')]")
    private WebElement enquiryDanger;


    public ContactUsPage(WebDriver driver) {
        super(driver);
    }

    public void fillName(String userName){
        fillField(name,userName);
    }

    public void fillEmail(String userEmail){
        fillField(email,userEmail);
    }

    public void fillEnquiry(String userEnquiry){
        fillField(enquiry, userEnquiry);
    }

    public void clickOnSubmitButton(){
        submitButton.click();
    }

    public HashMap<String, String> getAllWarningMessages(){

        HashMap<String, String> result = new HashMap<>();
        if(isWarningMessage(nameDanger )){
            result.put("name", nameDanger.getText());
        }
        if(isWarningMessage(emailDanger )){
            result.put("email", emailDanger.getText());
        }
        if(isWarningMessage(enquiryDanger )){
            result.put("enquiry", enquiryDanger.getText());
        }

        return result;
    }


}
