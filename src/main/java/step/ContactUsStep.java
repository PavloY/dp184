package step;

import core.BaseStep;
import data.ContactUsUser;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page.ContactUsPage;
import page.SuccessPage;

import java.util.HashMap;

public class ContactUsStep extends BaseStep<ContactUsPage> {

    private HashMap<String,String> messages;
    public ContactUsStep(WebDriver driver) {
        super(driver, new ContactUsPage(driver));
    }

    public ContactUsStep clickOnSubmitButton(){
        page.clickOnSubmitButton();
        return this;
    }

    public ContactUsStep fillAllFieldsWithInvalidData(ContactUsUser user){
        fillAllFields(user);
        messages = page.getAllWarningMessages();
        Assert.assertFalse(messages.isEmpty());
        return this;
    }
    public BaseStep fillAllFieldsWithValidData(ContactUsUser user){
        fillAllFields(user);
        messages = page.getAllWarningMessages();
        Assert.assertTrue(messages.isEmpty());
        return this;
    }
    public HashMap<String,String> getMessages(){
        return messages;
    }

    private void fillAllFields(ContactUsUser user){
        page.fillName(user.getName());
        page.fillEmail(user.getEmail());
        page.fillEnquiry(user.getEnquiry());
        page.clickOnSubmitButton();
    }
    public String getSuccessfulSendEnquiryMessage(){
        SuccessPage successPage = new SuccessPage(driver);
        return successPage.getSuccessMessageForEnquirySending();
    }

}


