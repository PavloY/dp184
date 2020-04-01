package step;

import core.BaseStep;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import page.AccountPage;

public class MyAccountStep extends BaseStep<AccountPage> {
    public MyAccountStep(WebDriver driver) {
        super(driver, new AccountPage(driver));
    }

    public AddressBookStep clickOnAddressBookPageLink(){
        page.clickOnAddressBookPageLink();
        String expected = "Address Book";
        String actual = driver.getTitle();
        Assert.assertEquals(expected, actual);
        return new AddressBookStep(driver);
    }

//    public MyAccountStep clickOnBackButton(){
//        page.clickOnBackButton();
//        String expected = "My Account";
//        String actual = driver.getTitle();
//
//        return new MyAccountStep(driver);
//    }
}
