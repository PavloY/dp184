package test;

import core.BaseTest;
import org.junit.BeforeClass;
import org.junit.Test;
import step.ContactUsStep;
import step.HomePageStep;

public class FTC_ContactUs_SendingMessageThroughContactUsTab extends BaseTest {

    ContactUsStep contactUsStep;
    HomePageStep homePageStep;



    @Test
    public void testSendingMessageThroughContactUsTab(){
        homePageStep = new HomePageStep(driver);
        contactUsStep = new ContactUsStep(driver);
        homePageStep.clickContactUs();

    }


}
