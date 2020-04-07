package test.ftcTest.FTS_ContactUs;

import core.BaseTest;
import data.ContactUsData;
import data.ContactUsUser;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import page.SuccessPage;
import step.ContactUsStep;
import step.HomePageStep;
import step.SuccessStep;

import java.net.MalformedURLException;


public class FTC_ContactUs_SendingMessageThroughContactUsTab extends BaseTestContactUs {


    private SuccessStep successStep;

    @Test
    public void testSendingMessageThroughContactUsTab(){
        successStep = new SuccessStep(driver);
        getContactUsStep().fillAllFieldsWithValidData(ContactUsData.contactUsUserWithValidData);
        String expected = "Your enquiry has been successfully sent to the store owner!";
        String actual = successStep.getSuccessfulSendEnquiryMessage();
        Assert.assertEquals(expected, actual);
    }


}
