package test.ftcTest;

import core.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import page.AffiliateLoginPage;
import page.AffiliateRegisterPage;
import page.SuccessPage;
import step.AffiliateRegisterPageStep;

import java.net.MalformedURLException;

import static org.junit.Assert.assertEquals;

public class FTC__Auto_Main_AffiliateRegister_AffiliateRegisterWithInvalidData extends BaseTest {

    AffiliateRegisterPageStep affiliateRegisterPageStep;
    SuccessPage successPage;
    AffiliateLoginPage affiliateLoginPage;
    AffiliateRegisterPage affiliateRegisterPage;

    @Before
    @Override
    public void setUp() throws MalformedURLException {
        super.setUp();
        affiliateRegisterPage = new AffiliateRegisterPage(driver);
        affiliateRegisterPageStep = new AffiliateRegisterPageStep(driver);
        successPage = new SuccessPage(driver);
        affiliateLoginPage = new AffiliateLoginPage(driver);
        affiliateLoginPage.clickAffiliateButton();
        affiliateLoginPage.clickOnButtonContinue();
    }

    @After
    @Override
    public void tearDown() {
        super.tearDown();
        affiliateRegisterPageStep = null;
        successPage = null;
        affiliateLoginPage = null;
        affiliateRegisterPage = null;
    }

    @Test
    public void inValidDataShort() {
        affiliateRegisterPageStep.fillInvalidData(" ", " ", " ",
                " ", " ", " ",
                " ", " ", " ");
        String expected = "Affiliate Program";
        String actual = affiliateRegisterPage.getTitlePage();
        assertEquals(expected, actual);
    }

    @Test
    public void inValidDataLong() {
        affiliateRegisterPageStep.fillInvalidData("Lorem ipsum dolor sit amet, conse", "Lorem ipsum dolor sit amet, conse", "someuserexample.com",
                "Lorem ipsum dolor sit amet, conse", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut en", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut en",
                "Lorem ipsum d", "Lorem ipsum dolor sit", "Lorem ipsum dolor sit");
        String expected = "Affiliate Program";
        String actual = affiliateRegisterPage.getTitlePage();
        assertEquals(expected, actual);
    }
}