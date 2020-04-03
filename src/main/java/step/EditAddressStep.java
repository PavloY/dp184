package step;

import core.BaseStep;
import data.EditAddressUser;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import page.AccountPage;
import page.EditAddressPage;

public class EditAddressStep extends BaseStep<EditAddressPage> {
    public EditAddressStep(WebDriver driver) {
        super(driver, new EditAddressPage(driver));
    }

    public AddressBookStep FillAllFieldWithValidData (EditAddressUser editAddressUser){
        page.fillFirstName(editAddressUser.getFirstName());
        page.fillLastName(editAddressUser.getLastName());
        page.fillCompany(editAddressUser.getCompany());
        page.fillAddress1(editAddressUser.getAddress1());
        page.fillAddress2(editAddressUser.getAddress2());
        page.fillCity(editAddressUser.getCity());
        page.fillPostCode(editAddressUser.getPostCode());
        page.chooseCountry(editAddressUser.getCountry());
        page.chooseRegion(editAddressUser.getRegion());
        page.defaultAddressYes();
        String unexpected = driver.getTitle();
        page.clickOnButtonContinueValidData();
        String actual = driver.getTitle();
        Assert.assertNotEquals(unexpected,actual);
        return new AddressBookStep(driver);
    }

    public AddressBookStep FillOnlyNecessaryFieldWithValidData (EditAddressUser editAddressUser){
        page.fillFirstName(editAddressUser.getFirstName());
        page.fillLastName(editAddressUser.getLastName());
        page.fillAddress1(editAddressUser.getAddress1());
        page.fillCity(editAddressUser.getCity());
        page.chooseCountry(editAddressUser.getCountry());
        page.chooseRegion(editAddressUser.getRegion());
        page.defaultAddressYes();
        String unexpected = driver.getTitle();
        page.clickOnButtonContinueValidData();
        String actual = driver.getTitle();
        Assert.assertNotEquals(unexpected,actual);
        return new AddressBookStep(driver);
    }



}
