package step;

import core.BaseStep;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import page.ContactUsPage;
import page.HomePage;
import page.LoginPage;

import java.util.List;

public class HomePageStep extends BaseStep<HomePage> {
    public HomePageStep(WebDriver driver) {
        super(driver, new HomePage(driver));
    }

    public HomePageStep clickMyAccount() {
        page.clickMyAccount();
        return this;
    }

    public LoginStep clickloginDropDown() {
        page.clickloginDropDown();
        return new LoginStep(driver);
    }

    public ContactUsStep clickContactUs() {
        page.goToContactUsPage();
        return new ContactUsStep(driver);
    }

    public ProductStep clickOnProduct(String nameOfProduct) {
        page.getNameProductsList();
        page.clickOnNameOfProduct(nameOfProduct);
        String expected = nameOfProduct;
        String actual = page.getTitlePage();
        Assert.assertEquals(expected, actual);
        return new ProductStep(driver);
    }

}