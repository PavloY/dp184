package test.ftcTest;

import core.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import page.AffiliateLoginPage;
import page.SuccessPage;
import step.AffiliateRegisterPageStep;

import java.net.MalformedURLException;

import static org.junit.Assert.assertEquals;

public class FTC__Auto_Main_AffiliateRegister_AffiliateRegisterWithValidData extends BaseTest {

    AffiliateRegisterPageStep affiliateRegisterPageStep;
    SuccessPage successPage;
    AffiliateLoginPage affiliateLoginPage;

    @Before
    @Override
    public void setUp() throws MalformedURLException {
        super.setUp();
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
    }

    @Test
    public void validData() {
        affiliateRegisterPageStep.fillValidData("Inokentiy", "Best", "someuser@example.com",
                "1111111111", "SomeAddress", "SomeCity",
                "10000", "11111", "11111");
        String expected = "Congratulations! Your new account has been successfully created!";
        String actual = successPage.getCongratulationsMessage();
        assertEquals(expected, actual);
    }
}