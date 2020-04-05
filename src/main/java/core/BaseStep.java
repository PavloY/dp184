package core;

import core.BasePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import step.HomePageStep;
import step.MyAccountStep;

public abstract class BaseStep <T extends BasePage> {
    protected WebDriver driver;
    protected T page;

    public BaseStep(WebDriver driver, T page) {
        this.driver = driver;
        this.page = page;
    }

    public MyAccountStep logout() {
        page.goToLogoutPage();
        String expected = "Account Logout";
        String actual = page.getTitlePage();
        Assert.assertEquals(expected, actual);
        return new MyAccountStep(driver);
    }

    public HomePageStep goToHomePage(){
        page.goToHomePage();
        String expected = "Logout";
        String actual = page.getTitlePage();
        Assert.assertEquals(expected, actual);
        return new HomePageStep(driver);
    }

}
