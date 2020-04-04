package step;

import core.BaseStep;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import page.AccountPage;
import page.ShoppingCartPage;

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

    public MyAccountStep clickOnLogoutButton(){
        page.clickOnLogoutPageLink();
        String expected = "Account";
        String actual = driver.getTitle();
        Assert.assertEquals(expected, actual);
        return this;
    }

    public CartStep clickOnShoppingCartButton(){
        page.goToShoppingCartPage();
        String expected = "Shopping Cart";
        String actual = driver.getTitle();
        Assert.assertEquals(expected, actual);
        return new CartStep(driver);
    }


//    public MyAccountStep clickOnBackButton(){
//        page.clickOnBackButton();
//        String expected = "My Account";
//        String actual = driver.getTitle();
//
//        return new MyAccountStep(driver);
//    }
}
