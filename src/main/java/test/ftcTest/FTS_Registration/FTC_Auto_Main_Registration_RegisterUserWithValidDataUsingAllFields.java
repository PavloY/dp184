package test.ftcTest.FTS_Registration;

import data.Constants;
import org.junit.Assert;
import org.junit.Test;
import step.SuccessStep;

public class FTC_Auto_Main_Registration_RegisterUserWithValidDataUsingAllFields extends BaseTestRegistration {


    @Test
    public void registerUserWithValidDataUsingAllFields(){
        SuccessStep successStep = registerStep.fillAllFieldWithValidData(Constants.VALID_USER_ALL_FIELDS);
        String expected = "Your Account Has Been Created!";
        String actual = successStep.getContent();
        Assert.assertEquals(expected, actual);
    }
}
