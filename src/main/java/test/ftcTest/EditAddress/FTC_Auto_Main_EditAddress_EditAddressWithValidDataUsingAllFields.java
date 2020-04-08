package test.ftcTest.EditAddress;

import data.ConstansEditAddress;
import org.junit.Assert;
import org.junit.Test;
import page.AddressBookPage;
import step.AddressBookStep;
import step.SuccessStep;

public class FTC_Auto_Main_EditAddress_EditAddressWithValidDataUsingAllFields extends BaseTestEditAddress{


    @Test
    public void editAddressWithValidDataUsingAllFields(){
        System.out.println("6666");
       AddressBookStep addressBookStep = editAddressStep.fillAllFieldWithValidData(ConstansEditAddress.VALID_EDITADDRESSUSER_ALL_FIELDS);

       String expected = "Your address has been successfully updated";
       String actual = addressBookStep.getSuccessfullyUpdatedMessage();
       Assert.assertEquals(expected, actual);
    }
}
