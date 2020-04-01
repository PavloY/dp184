package step;

import core.BaseStep;
import data.User;
import org.openqa.selenium.WebDriver;
import page.ContactUsPage;

public class ContactUsStep extends BaseStep<ContactUsPage> {


    public ContactUsStep(WebDriver driver) {
        super(driver, new ContactUsPage(driver));
    }

    public ContactUsStep clickOnSubmitButton(){
        page.clickOnSubmitButton();
        return this;
    }

    public ContactUsStep fillAllFieldsWithInvalidData(User user){
        fillAllFields(user);
        //assert
        return this;
    }
    public BaseStep fillAllFieldsWithValidData(User user){
        fillAllFields(user);
        //assert
        return this;
    }
    private void fillAllFields(User user){
        page.fillName(user.getNameContactUs());
        page.fillEmail(user.getEmailContactUs());
        page.fillEnquiry(user.getEnquiryContactUs());
        page.clickOnSubmitButton();
    }

}


