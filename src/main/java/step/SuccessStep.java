package step;

import core.BaseStep;
import org.openqa.selenium.WebDriver;
import page.SuccessPage;

public class SuccessStep extends BaseStep<SuccessPage> {
    public SuccessStep(WebDriver driver) {
        super(driver, new SuccessPage(driver));
    }
}
