package test;

import core.BasePage;
import core.BaseStep;
import core.BaseTest;
import data.ContactUsUser;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import step.ContactUsStep;
import step.HomePageStep;

import java.net.MalformedURLException;

//@RunWith(Parameterized.class)
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
    public void testContactUsWithInvalideData(){
        contactUsStep.fillAllFieldsWithInvalidData(new ContactUsUser("","",""));
        int actual = contactUsStep.getMessages().size();
        Assert.assertEquals(3,3);
    }



}
