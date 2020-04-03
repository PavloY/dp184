package test;

import core.BasePage;
import core.BaseTest;
import data.ContactUsUser;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import page.SuccessPage;
import step.ContactUsStep;
import step.HomePageStep;

import java.net.MalformedURLException;

import static org.junit.Assert.assertEquals;

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
        String expected = "";
        //String actual = successPage.getTitlePage();
        //assertEquals(expected,actual);
    }


}
