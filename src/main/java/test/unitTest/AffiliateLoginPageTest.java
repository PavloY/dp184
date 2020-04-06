package test.unitTest;

import core.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import page.AffiliateLoginPage;

import java.net.MalformedURLException;

import static org.junit.Assert.assertEquals;

public class AffiliateLoginPageTest extends BaseTest {

    AffiliateLoginPage affiliateLoginPage;

    @Before
    @Override
    public void setUp() throws MalformedURLException {
        super.setUp();
        affiliateLoginPage = new AffiliateLoginPage(driver);
        driver.get("http://184-dp.tk/index.php?route=affiliate/login");
    }

    @After
    @Override
    public void tearDown() {
        super.tearDown();
        affiliateLoginPage = null;
    }

    @Test
    public void fillAffiliateEmailInvalid() {
        affiliateLoginPage.fillAffiliatePassword("11111");
        affiliateLoginPage.clickOnButtonLogin();
        String expected = "Warning: Your account has exceeded allowed number of login attempts. Please try again in 1 hour.";
        String actual = affiliateLoginPage.getWarningMessage();
        assertEquals(expected, actual);
    }

    @Test
    public void fillAffiliatePasswordInvalid() {
        affiliateLoginPage.fillAffiliateEmail("example@example.com");
        affiliateLoginPage.clickOnButtonLogin();
        String expected = "Warning: No match for E-Mail Address and/or Password.";
        String actual = affiliateLoginPage.getWarningMessage();
        assertEquals(expected, actual);
    }
}