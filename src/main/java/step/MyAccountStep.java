package step;

import core.BaseStep;
import org.openqa.selenium.WebDriver;
import page.AccountPage;

public class MyAccountStep extends BaseStep<AccountPage> {
    public MyAccountStep(WebDriver driver) {
        super(driver, new AccountPage(driver));
    }
}
