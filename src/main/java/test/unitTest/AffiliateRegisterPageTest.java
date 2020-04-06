package test.unitTest;

import core.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import page.AffiliateRegisterPage;

import java.net.MalformedURLException;

import static org.junit.Assert.assertEquals;

public class AffiliateRegisterPageTest extends BaseTest {

    AffiliateRegisterPage affiliateRegisterPage;

    @Before
    @Override
    public void setUp() throws MalformedURLException {
        super.setUp();
        affiliateRegisterPage = new AffiliateRegisterPage(driver);
        driver.get("http://184-dp.tk/index.php?route=affiliate/register");
    }

    @After
    @Override
    public void tearDown() {
        super.tearDown();
        affiliateRegisterPage = null;
    }

    @Test
    public void fillFirstName() {
        affiliateRegisterPage.fillFirstName(" ");
        affiliateRegisterPage.buttonContinueClick();
        String expected = "First Name must be between 1 and 32 characters!";
        String actual = affiliateRegisterPage.getWarningForFirstName().getText();
        assertEquals(expected, actual);
    }

    @Test
    public void fillLastName() {
        affiliateRegisterPage.fillLastName(" ");
        affiliateRegisterPage.buttonContinueClick();
        String expected = "Last Name must be between 1 and 32 characters!";
        String actual = affiliateRegisterPage.getWarningForLastName().getText();
        assertEquals(expected, actual);
    }

    @Test
    public void fillEmail() {
        affiliateRegisterPage.fillEmail(" ");
        affiliateRegisterPage.buttonContinueClick();
        String expected = "E-Mail Address does not appear to be valid!";
        String actual = affiliateRegisterPage.getWarningForEmail().getText();
        assertEquals(expected, actual);
    }

    @Test
    public void fillTelephone() {
        affiliateRegisterPage.fillTelephone(" ");
        affiliateRegisterPage.buttonContinueClick();
        String expected = "Telephone must be between 3 and 32 characters!";
        String actual = affiliateRegisterPage.getWarningForTelephone().getText();
        assertEquals(expected, actual);
    }


    @Test
    public void fillAddress1() {
        affiliateRegisterPage.fillAddress1(" ");
        affiliateRegisterPage.buttonContinueClick();
        String expected = "Address 1 must be between 3 and 128 characters!";
        String actual = affiliateRegisterPage.getWarningForAddress1().getText();
        assertEquals(expected, actual);
    }

    @Test
    public void fillCity() {
        affiliateRegisterPage.fillCity(" ");
        affiliateRegisterPage.buttonContinueClick();
        String expected = "City must be between 2 and 128 characters!";
        String actual = affiliateRegisterPage.getWarningForCity().getText();
        assertEquals(expected, actual);
    }

    @Test
    public void fillPostcode() {
        affiliateRegisterPage.fillPostcode(" ");
        affiliateRegisterPage.buttonContinueClick();
        String expected = "Postcode must be between 2 and 10 characters!";
        String actual = affiliateRegisterPage.getWarningForPostcode().getText();
        assertEquals(expected, actual);
    }

    @Test
    public void chooseRegion() {
        affiliateRegisterPage.buttonContinueClick();
        String expected = "Please select a region / state!";
        String actual = affiliateRegisterPage.getWarningForRegion().getText();
        assertEquals(expected, actual);
    }

    @Test
    public void fillPassword() {
        affiliateRegisterPage.fillPassword(" ");
        affiliateRegisterPage.buttonContinueClick();
        String expected = "Password must be between 4 and 20 characters!";
        String actual = affiliateRegisterPage.getWarningForPassword().getText();
        assertEquals(expected, actual);
    }

    @Test
    public void fillPasswordConfirm() {
        affiliateRegisterPage.fillPassword("12345");
        affiliateRegisterPage.fillPasswordConfirm("213345");
        affiliateRegisterPage.buttonContinueClick();
        String expected = "Password confirmation does not match password!";
        String actual = affiliateRegisterPage.getWarningForPasswordConfirm().getText();
        assertEquals(expected, actual);
    }

    @Test
    public void chooseAgree() {
        affiliateRegisterPage.buttonContinueClick();
        String expected = "Warning: You must agree to the About Us!";
        String actual = affiliateRegisterPage.getWarningForAgreeCheckbox().getText();
        assertEquals(expected, actual);
    }

    @Test
    public void fillFirstName1() {
        affiliateRegisterPage.fillFirstName("Lorem ipsum dolor sit amet, conse");
        affiliateRegisterPage.buttonContinueClick();
        String expected = "First Name must be between 1 and 32 characters!";
        String actual = affiliateRegisterPage.getWarningForFirstName().getText();
        assertEquals(expected, actual);
    }

    @Test
    public void fillLastName1() {
        affiliateRegisterPage.fillLastName("Lorem ipsum dolor sit amet, conse");
        affiliateRegisterPage.buttonContinueClick();
        String expected = "Last Name must be between 1 and 32 characters!";
        String actual = affiliateRegisterPage.getWarningForLastName().getText();
        assertEquals(expected, actual);
    }

    @Test
    public void fillTelephone1() {
        affiliateRegisterPage.fillTelephone("Lorem ipsum dolor sit amet, conse");
        affiliateRegisterPage.buttonContinueClick();
        String expected = "Telephone must be between 3 and 32 characters!";
        String actual = affiliateRegisterPage.getWarningForTelephone().getText();
        assertEquals(expected, actual);
    }


    @Test
    public void fillAddress1_1() {
        affiliateRegisterPage.fillAddress1("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut en");
        affiliateRegisterPage.buttonContinueClick();
        String expected = "Address 1 must be between 3 and 128 characters!";
        String actual = affiliateRegisterPage.getWarningForAddress1().getText();
        assertEquals(expected, actual);
    }

    @Test
    public void fillCity1() {
        affiliateRegisterPage.fillCity("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut en");
        affiliateRegisterPage.buttonContinueClick();
        String expected = "City must be between 2 and 128 characters!";
        String actual = affiliateRegisterPage.getWarningForCity().getText();
        assertEquals(expected, actual);
    }

    @Test
    public void fillPostcode1() {
        affiliateRegisterPage.fillPostcode("Lorem ipsum");
        affiliateRegisterPage.buttonContinueClick();
        String expected = "Postcode must be between 2 and 10 characters!";
        String actual = affiliateRegisterPage.getWarningForPostcode().getText();
        assertEquals(expected, actual);
    }

    @Test
    public void fillPassword1() {
        affiliateRegisterPage.fillPassword("Lorem ipsum dolor sit");
        affiliateRegisterPage.buttonContinueClick();
        String expected = "Password must be between 4 and 20 characters!";
        String actual = affiliateRegisterPage.getWarningForPassword().getText();
        assertEquals(expected, actual);
    }
}