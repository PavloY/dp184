package step;

import core.BaseStep;
import data.EditAddressUser;
import data.User;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import page.AccountPage;
import page.EditAddressPage;

import java.util.HashMap;

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
        page.clickOnButtonContinue();
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
        page.clickOnButtonContinue();
        String actual = driver.getTitle();
        Assert.assertNotEquals(unexpected,actual);
        return new AddressBookStep(driver);
    }

    public HashMap<String, String> fillOnlyNecessaryFieldWithInvalidData(User user){
        page.fillFirstName(user.getFirstName());
        page.fillLastName(user.getLastName());
        page.fillAddress1(user.getAddress1());
        page.fillCity(user.getCity());
        if(!user.getCountry().isEmpty()) page.chooseCountry(user.getCountry());
        if(!user.getRegion().isEmpty()) page.chooseRegion(user.getRegion());
        page.defaultAddressYes();
        String expected = driver.getTitle();
        page.clickOnButtonContinue();
        String actual = driver.getTitle();
        Assert.assertEquals(expected, actual);
        return page.getAllWarningMessages();
    }


}
