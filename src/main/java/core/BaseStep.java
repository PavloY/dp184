package core;

import core.BasePage;
import org.openqa.selenium.WebDriver;

public abstract class BaseStep <T extends BasePage> {
    protected WebDriver driver;
    protected T page;

    public BaseStep(WebDriver driver, T page) {
        this.driver = driver;
        this.page = page;
    }
}
