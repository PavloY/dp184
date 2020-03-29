package step;

import core.BaseStep;
import org.openqa.selenium.WebDriver;
import page.ContactUsPage;

public class ContactUsStep extends BaseStep<ContactUsPage> {


    public ContactUsStep(WebDriver driver) {
        super(driver, new ContactUsPage(driver));
    }
}
