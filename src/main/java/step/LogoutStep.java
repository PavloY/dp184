package step;

import core.BaseStep;
import org.openqa.selenium.WebDriver;
import page.LogoutPage;
import page.ProductPage;

public class LogoutStep extends BaseStep<LogoutPage> {
    public LogoutStep(WebDriver driver) {
        super(driver, new LogoutPage(driver));
    }

}
