package step;

import core.BaseStep;
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

    public ContactUsStep fillAllFieldsWithInvalidData(ContactUsUser user){
        fillAllFields(user);
        //assert
        return this;
    }
    public BaseStep fillAllFieldsWithValidData(ContactUsUser user){
        fillAllFields(user);
        //assert
        return this;
    }
    private void fillAllFields(ContactUsUser user){
        page.fillName(user.getName());
        page.fillEmail(user.getEmail());
        page.fillEnquiry(user.getEnquiry());
        page.clickOnSubmitButton();
    }

}

class ContactUsUser {
    private String email;
    private String name;
    private String enquiry;

    public ContactUsUser(String email, String name, String enquiry) {
        this.email = email;
        this.name = name;
        this.enquiry = enquiry;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getEnquiry() {
        return enquiry;
    }
}
