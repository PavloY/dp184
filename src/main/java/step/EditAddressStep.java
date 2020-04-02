package step;

import core.BaseStep;
import org.openqa.selenium.WebDriver;
import page.AccountPage;
import page.EditAddressPage;

public class EditAddressStep extends BaseStep<EditAddressPage> {
    public EditAddressStep(WebDriver driver) {
        super(driver, new EditAddressPage(driver));


    }

}
