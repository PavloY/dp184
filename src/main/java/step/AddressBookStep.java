package step;

import core.BasePage;
import core.BaseStep;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import page.AddressBookPage;

public class AddressBookStep extends BaseStep<AddressBookPage> {
    public AddressBookStep(WebDriver driver) {
        super(driver, new AddressBookPage(driver));
    }

    public MyAccountStep clickOnBackButton(){
        page.clickOnBackButton();
        String expected = "My Account";
        String actual = driver.getTitle();
        Assert.assertEquals(expected, actual);
        return new MyAccountStep(driver);
    }
}
