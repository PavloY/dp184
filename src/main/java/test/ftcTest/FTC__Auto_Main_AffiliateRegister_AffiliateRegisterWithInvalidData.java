package test.ftcTest;

import core.BaseTest;
import data.AffiliateRegisterUser;
import data.Constants;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import page.AffiliateLoginPage;
import page.AffiliateRegisterPage;
import page.SuccessPage;
import step.AffiliateRegisterPageStep;

import java.net.MalformedURLException;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
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

    public static Object[][] inValidData() {
        return new Object[][]{
                {Constants.AFFILIATE_REGISTER_USER_INVALID_DATA_1},
                {Constants.AFFILIATE_REGISTER_USER_INVALID_DATA_2}
        };
    }

    @Parameters(method = "inValidData")
    @Test
    public void testInValidData(AffiliateRegisterUser affiliateRegisterUser) {
        affiliateRegisterPageStep.fillInvalidData(affiliateRegisterUser);
        String expected = "Affiliate Program";
        String actual = affiliateRegisterPage.getTitlePage();
        assertEquals(expected, actual);
    }
}