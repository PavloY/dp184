package test.ftcTest;

import core.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import page.AffiliateLoginPage;
import step.AffiliateLoginStep;

import java.net.MalformedURLException;

import static org.junit.Assert.assertEquals;

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

    @Test
    public void inValidData() {
        affiliateLoginStep.fillAffiliateLoginInvalid("", "");
        String expected = "Warning: No match for E-Mail Address and/or Password.";
        String actual = affiliateLoginPage.getWarningMessage();
        assertEquals(expected, actual);
    }
}
