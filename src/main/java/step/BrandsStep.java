package step;

import core.BaseStep;
import org.openqa.selenium.WebDriver;
import page.BrandsPage;

public class BrandsStep extends BaseStep<BrandsPage> {
    public BrandsStep(WebDriver driver) {
        super(driver, new BrandsPage(driver));
    }
}
