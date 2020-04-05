package test.unitTest;

import core.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import page.AccountPage;
import page.AddressBookPage;
import page.HomePage;
import page.LoginPage;

import java.net.MalformedURLException;

public class AddressBookPageTest extends BaseTest {
    AddressBookPage addressBookPage;
    LoginPage loginPage;
    HomePage homePage;
    AccountPage accountPage;

    @Override
    public void setUp() throws MalformedURLException {
        super.setUp();
//       driver.get("http://184-dp.tk/index.php?route=account/login");
        addressBookPage = new AddressBookPage(driver);
       loginPage = new LoginPage(driver);
       homePage = new HomePage(driver);
        accountPage = new AccountPage(driver);
        homePage.clickMyAccount();
        homePage.clickloginDropDown();

        loginPage.fillLoginEmail("Natalyshimko@gmail.com");
       loginPage.fillLoginPassword("040777");
       loginPage.clickLogInPageButton();
        accountPage.clickOnAddressBookPageLink();
    }

    @Test
    public void clickOnBackButtonTest() {
        String notExpected = addressBookPage.getTitlePage();
        addressBookPage.clickOnBackButton();
        String actual = driver.getTitle();
        Assert.assertNotEquals(notExpected, actual);

    }

    @Test
    public void clickOnNewAddressButtonTest() {
    }

    @Test
    public void clickOnEditButtonTest() {
    }

    @Test
    public void clickOnDeleteButtonTest() {
    }
}