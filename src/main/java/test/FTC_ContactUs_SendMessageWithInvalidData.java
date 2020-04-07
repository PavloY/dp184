package test;

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

public class FTC_ContactUs_SendMessageWithInvalidData extends BaseTest {

    ContactUsStep contactUsStep;
    HomePageStep homePageStep;

    @Before
    @Override
    public void setUp() throws MalformedURLException {
        super.setUp();
        homePageStep = new HomePageStep(driver);
        contactUsStep = new ContactUsStep(driver);
        homePageStep.clickContactUs();
    }
    
    @Test
    public void testContactUsWithInvalidData(){
        contactUsStep.fillAllFieldsWithInvalidData(new ContactUsUser("","",""));
        HashMap<String, String> expected = new HashMap<>();
        expected.put("name","Name must be between 3 and 32 characters!");
        expected.put("email","E-Mail Address does not appear to be valid!");
        expected.put("enquiry","Enquiry must be between 10 and 3000 characters!");
        HashMap<String, String>  actual = contactUsStep.getMessages();
        Assert.assertEquals(expected, actual);
    }



}
