package test.ftcTest.FTS_Registration;

import data.User;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

@RunWith(JUnitParamsRunner.class)
public class FTC_Auto_Main_Registration_RegisterUserWithInvalidDataUsingOnlyNecessaryFields extends BaseTestRegistration {



    public static Collection<Object[]> inputDataConvertPositive(){
        return Arrays.asList(new Object[][]{
                {Constants.INVALID_USER_DATA_1, Constants.INVALID_RESULT_1},
                {Constants.INVALID_USER_DATA_2, Constants.INVALID_RESULT_2},
                {Constants.INVALID_USER_DATA_3, Constants.INVALID_RESULT_3},
                {Constants.INVALID_USER_DATA_4, Constants.INVALID_RESULT_4}
        });
    }

    @Test
    @Parameters(method = "inputDataConvertPositive")
    public void testConvertFromIntToArrayIntPositive(User input, HashMap<String, String> expected){
        Assert.assertEquals(expected, registerStep.fillOnlyNecessaryFieldWithInvalidData(input));
    }


}
