package step;

import core.BaseStep;
import data.LoginUser;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import page.HomePage;
import page.LogoutPage;
import page.ProductPage;

public class LogoutStep extends BaseStep<LogoutPage> {
    public LogoutStep(WebDriver driver) {
        super(driver, new LogoutPage(driver));
    }

    LogoutPage logoutPage;

        public LogoutStep clickContinioButton() {
        logoutPage.clickOnContinueButton();
        return this;
    }

}
