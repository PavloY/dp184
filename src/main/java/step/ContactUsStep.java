package step;

import core.BaseStep;
import data.ContactUsUser;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page.ContactUsPage;

import java.util.HashMap;

public class ContactUsStep extends BaseStep<ContactUsPage> {


    public ContactUsStep(WebDriver driver) {
        super(driver, new ContactUsPage(driver));
    }

    public ContactUsStep clickOnSubmitButton(){
        page.clickOnSubmitButton();
        return this;
    }

    public ContactUsStep fillAllFieldsWithInvalidData(ContactUsUser user){
        fillAllFields(user);
        HashMap<String,String> actual = page.getAllWarningMessages();
        Assert.assertFalse(actual.isEmpty());
        return this;
    }
    public BaseStep fillAllFieldsWithValidData(ContactUsUser user){
        fillAllFields(user);
        HashMap<String,String> actual = page.getAllWarningMessages();   // ????
        Assert.assertTrue(actual.isEmpty());                            // ????
        return this;
    }

    private void fillAllFields(ContactUsUser user){
        page.fillName(user.getName());
        page.fillEmail(user.getEmail());
        page.fillEnquiry(user.getEnquiry());
        page.clickOnSubmitButton();
    }


}


