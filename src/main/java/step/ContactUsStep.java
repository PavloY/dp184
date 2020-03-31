package step;

import core.BaseStep;
import org.openqa.selenium.WebDriver;
import page.ContactUsPage;

public class ContactUsStep extends BaseStep<ContactUsPage> {


    public ContactUsStep(WebDriver driver) {
        super(driver, new ContactUsPage(driver));
    }

    public ContactUsStep fillName(String userName){
        page.fillName(userName);

        return this;
    }

    public ContactUsStep fillEmail(String userEmail){
        page.fillEmail(userEmail);

        return this;
    }

    public ContactUsStep fillEnquiry(String userEnquiry){
        page.fillEnquiry(userEnquiry);

        return this;
    }

    public ContactUsStep clickOnSubmitButton(){
        page.clickOnSubmitButton();
        return this;
    }
}
