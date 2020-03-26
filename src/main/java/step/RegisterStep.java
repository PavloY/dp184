package step;

import core.BasePage;
import core.BaseStep;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import page.RegisterPage;

public class RegisterStep extends BaseStep<RegisterPage> {

    public RegisterStep(WebDriver driver) {
        super(driver, new RegisterPage(driver));
    }

    public RegisterStep fillValidFirstName(String userFirstName){
        page.fillFirstName(userFirstName);
        page.clickOnButtonContinue();
        String expected = null;
        String actual = page.getWarningMessage(page.firstNameDanger);
        Assert.assertEquals(expected, actual);
        return this;
    }

    public RegisterStep fillValidLastName(String userLastName){
        page.fillFirstName(userLastName);
        Assert.assertTrue(true);
        return this;
    }


}
