package test.ftcTest.FTS_ContactUs;

import core.BaseTest;
import data.ContactUsUser;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import step.ContactUsStep;
import step.HomePageStep;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.HashMap;

public class FTC_ContactUs_SendMessageWithInvalidData extends BaseTestContactUs {


    @Test
    public void testContactUsWithInvalidData(){
        getContactUsStep().fillAllFieldsWithInvalidData(new ContactUsUser("","",""));
        HashMap<String, String> expected = new HashMap<>();
        expected.put("name","Name must be between 3 and 32 characters!");
        expected.put("email","E-Mail Address does not appear to be valid!");
        expected.put("enquiry","Enquiry must be between 10 and 3000 characters!");
        HashMap<String, String>  actual = getContactUsStep().getMessages();
        Assert.assertEquals(expected, actual);
    }



}
