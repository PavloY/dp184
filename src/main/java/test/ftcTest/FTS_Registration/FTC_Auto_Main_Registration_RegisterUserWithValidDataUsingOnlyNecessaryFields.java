package test.ftcTest.FTS_Registration;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import step.SuccessStep;

import java.net.MalformedURLException;

public class FTC_Auto_Main_Registration_RegisterUserWithValidDataUsingOnlyNecessaryFields extends BaseTestRegistration {

    @Before
    @Override
    public void setUp() throws MalformedURLException {
        super.setUp();


    }

    @Test
    public void registerUserWithValidDataUsingAllFields(){
        SuccessStep successStep = registerStep.fillOnlyNecessaryFieldWithValidData(Constants.VALID_USER_ONLY_NECESSARY_FIELDS);


        String actual = driver.getCurrentUrl();

        Assert.assertTrue(actual.contains("success"));

        String expected = "Your Account Has Been Created!";

        actual = successStep.getContent();

        Assert.assertEquals(expected, actual);
        Assert.assertTrue(true);
    }
}
