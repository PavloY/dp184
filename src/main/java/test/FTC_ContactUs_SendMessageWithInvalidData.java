package test;

import core.BaseTest;
import data.ContactUsUser;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import step.ContactUsStep;
import step.HomePageStep;

import java.net.MalformedURLException;

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
        int expected = 3;
        int actual = contactUsStep.getMessages().size();
        Assert.assertEquals(3,actual);
    }



}
