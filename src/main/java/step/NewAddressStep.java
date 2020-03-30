package step;

import core.BaseStep;
import org.openqa.selenium.WebDriver;
import page.AccountPage;
import page.NewAddressPage;

public class NewAddressStep extends BaseStep<NewAddressPage> {
    public NewAddressStep (WebDriver driver) {
        super(driver, new NewAddressPage(driver));
    }
}
