package step;

import core.BaseStep;
import org.openqa.selenium.WebDriver;
import page.HomePage;

public class HomePageStep extends BaseStep<HomePage> {


    public HomePageStep(WebDriver driver) {
        super(driver, new HomePage(driver));
    }
}
