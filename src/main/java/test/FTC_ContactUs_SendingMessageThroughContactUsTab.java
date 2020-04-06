package test;

import core.BaseTest;
import data.ContactUsUser;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import page.SuccessPage;
import step.ContactUsStep;
import step.HomePageStep;

import java.net.MalformedURLException;


public class FTC_ContactUs_SendingMessageThroughContactUsTab extends BaseTest {

    ContactUsStep contactUsStep;
    HomePageStep homePageStep;
    SuccessPage successPage;

    @Before
    @Override
    public void setUp() throws MalformedURLException {
        super.setUp();
        homePageStep = new HomePageStep(driver);
        contactUsStep = new ContactUsStep(driver);
        successPage = new SuccessPage(driver);
        homePageStep.clickContactUs();
    }

    @Test
    public void testSendingMessageThroughContactUsTab(){

        ContactUsUser contactUsUser = new ContactUsUser("Alex","alex@mail.com","Hello World !!!!!!!!!!!!!");
        contactUsStep.fillAllFieldsWithValidData(contactUsUser);
        String expected = "Your enquiry has been successfully sent to the store owner!";
        String actual = successPage.getSuccessMessageForEnquirySending();   // Change to successStep
        Assert.assertEquals(expected, actual);
    }


}
