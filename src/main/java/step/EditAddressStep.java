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

    public AddressBookStep fillAllFieldWithValidData (EditAddressUser editAddressUser){
        System.out.println("4444");
        fillAllNecessaryFields(editAddressUser);
        System.out.println("22222");
        page.fillCompany(editAddressUser.getCompany());
        System.out.println("33333");
        page.fillAddress2(editAddressUser.getAddress2());
        page.fillPostCode(editAddressUser.getPostCode());
        page.defaultAddressYes();
        page.clickOnButtonContinue();
        String expected = "Your address has been successfully updated";
        String actual = page.clickOnButtonContinue().getContentSuccessfullyUpdatedMessage();
        Assert.assertEquals(expected, actual);
        return new AddressBookStep(driver);
    }

    public AddressBookStep fillOnlyNecessaryFieldWithValidData (EditAddressUser editAddressUser){
        fillAllNecessaryFields(editAddressUser);
        String expected = "Your address has been successfully updated";
        String actual = page.clickOnButtonContinue().getContentSuccessfullyUpdatedMessage();
        Assert.assertEquals(expected, actual);
        return new AddressBookStep(driver);
    }

    public HashMap<String, String> fillOnlyNecessaryFieldWithInvalidData(EditAddressUser editAddressUser){
        fillAllNecessaryFields(editAddressUser);
        String expected = driver.getTitle();
        page.clickOnButtonContinue();
        String actual = driver.getTitle();
        Assert.assertEquals(expected, actual);
        return page.getAllWarningMessages();
    }

    private void fillAllNecessaryFields(EditAddressUser editAddressUser){
        page.fillFirstName(editAddressUser.getFirstName());
        page.fillLastName(editAddressUser.getLastName());
        page.fillAddress1(editAddressUser.getAddress1());
        page.fillCity(editAddressUser.getCity());
        if(!editAddressUser.getCountry().isEmpty()) page.chooseCountry(editAddressUser.getCountry());
        if(!editAddressUser.getRegion().isEmpty()) page.chooseRegion(editAddressUser.getRegion());
    }



}
