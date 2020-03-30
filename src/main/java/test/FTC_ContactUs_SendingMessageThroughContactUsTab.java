package test;

import core.BaseTest;
import org.junit.Test;
import step.ContactUsStep;

public class FTC_ContactUs_SendingMessageThroughContactUsTab extends BaseTest {

    ContactUsStep contactUsStep;

    @Test
    public void testSendingMessageThroughContactUsTab(){

        contactUsStep = new ContactUsStep(driver);
        contactUsStep.fillName("Alexander");
        contactUsStep.fillEmail("alexvonbor@gmail.com");
        contactUsStep.fillEnquiry("Hello world test message");
        contactUsStep.clickOnSubmitButton();

    }


}
