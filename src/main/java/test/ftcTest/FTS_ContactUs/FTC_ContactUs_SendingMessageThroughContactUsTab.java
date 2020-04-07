package test.ftcTest.FTS_ContactUs;

import data.ContactUsData;
import org.junit.Assert;
import org.junit.Test;
import step.SuccessStep;



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
