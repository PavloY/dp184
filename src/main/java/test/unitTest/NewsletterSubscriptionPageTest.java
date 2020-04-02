package test.unitTest;

import core.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import page.LoginPage;
import page.NewsletterSubscriptionPage;
import page.SuccessPage;

import java.net.MalformedURLException;

import static org.junit.Assert.assertEquals;

public class NewsletterSubscriptionPageTest extends BaseTest {
    NewsletterSubscriptionPage newsletterSubscriptionPage;
    LoginPage loginPage;
    SuccessPage successPage;

    @Before
    @Override
    public void setUp() throws MalformedURLException {
        super.setUp();
        newsletterSubscriptionPage = new NewsletterSubscriptionPage(driver);
        loginPage = new LoginPage(driver);
        successPage = new SuccessPage(driver);
        driver.get("http://184-dp.tk/index.php?route=account/login");
        loginPage.fillLoginEmail("opencard@mailforspam.com");
        loginPage.fillLoginPassword("Qwerty");
        loginPage.clickLogInPageButton();
        loginPage.clickNewsletterButton();
    }

    @After
    @Override
    public void tearDown() {
        super.tearDown();
        newsletterSubscriptionPage = null;
        loginPage = null;
        successPage = null;
    }

    @Test
    public void chooseCheckBoxNo() {
        newsletterSubscriptionPage.chooseCheckBoxNo();
        String expected = "Newsletter Subscription";
        String actual = newsletterSubscriptionPage.getTitlePage();
        assertEquals(expected, actual);
    }

    @Test
    public void chooseCheckBoxYes() {
        newsletterSubscriptionPage.chooseCheckBoxYes();
        String expected = "Newsletter Subscription";
        String actual = newsletterSubscriptionPage.getTitlePage();
        assertEquals(expected, actual);
    }

    @Test
    public void clickOnContinueButton() {
        newsletterSubscriptionPage.clickOnContinueButton();
        String expected = "Success: Your newsletter subscription has been successfully updated!";
        String actual = successPage.getSuccessMessage();
        assertEquals(expected, actual);
    }
}