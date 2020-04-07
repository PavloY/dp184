package test.ftcTest;

import core.BaseTest;
import data.AffiliateLoginUser;
import data.Constants;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import page.AffiliateLoginPage;
import step.AffiliateLoginStep;

import java.net.MalformedURLException;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class FTC__Auto_Main_AffiliateLogin_AffiliateLoginWithInvalidData extends BaseTest {

    AffiliateLoginPage affiliateLoginPage;
    AffiliateLoginStep affiliateLoginStep;

    @Before
    @Override
    public void setUp() throws MalformedURLException {
        super.setUp();
        affiliateLoginStep = new AffiliateLoginStep(driver);
        affiliateLoginPage = new AffiliateLoginPage(driver);
        affiliateLoginPage.clickAffiliateButton();
    }

    @After
    @Override
    public void tearDown() {
        super.tearDown();
        affiliateLoginStep = null;
        affiliateLoginPage = null;
    }

    public static Object[][] inValidData() {
        return new Object[][]{
                {Constants.AFFILIATE_LOGIN_USER_INVALID_DATA_1},
                {Constants.AFFILIATE_LOGIN_USER_INVALID_DATA_2},
                {Constants.AFFILIATE_LOGIN_USER_INVALID_DATA_3},
                {Constants.AFFILIATE_LOGIN_USER_INVALID_DATA_4},
        };
    }

    @Parameters(method = "inValidData")
    @Test
    public void testInValidData(AffiliateLoginUser affiliateLoginUser) {
        affiliateLoginStep.fillAffiliateLoginInvalid(affiliateLoginUser);
        String expected = "Warning: No match for E-Mail Address and/or Password.";
        String actual = affiliateLoginPage.getWarningMessage();
        assertEquals(expected, actual);
    }
}