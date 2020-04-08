package test.ftcTest.FTS_ContactUs;

import core.BaseTest;
import org.junit.After;
import org.junit.Before;
import step.ContactUsStep;
import step.HomePageStep;

import java.net.MalformedURLException;

public class BaseTestContactUs extends BaseTest {

    private ContactUsStep contactUsStep;

    @Before
    @Override
    public void setUp() throws MalformedURLException {
        super.setUp();
        contactUsStep = new HomePageStep(driver).clickContactUs();
    }

    public ContactUsStep getContactUsStep(){
        return contactUsStep;
    }

    @After
    @Override
    public void tearDown(){
        super.tearDown();
        contactUsStep = null;
    }
}
