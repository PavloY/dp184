package test.ftcTest;

import core.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import page.HomePage;

import java.net.MalformedURLException;

import static org.junit.Assert.assertEquals;

public class FTC__Auto_Main_Logo_LogoRedirectingLink extends BaseTest {

    HomePage homePage;

    @Before
    @Override
    public void setUp() throws MalformedURLException {
        super.setUp();
        homePage = new HomePage(driver);
        homePage.clickNewsletterButton();
    }

    @After
    @Override
    public void tearDown() {
        super.tearDown();
        homePage = null;
    }

    @Test
    public void logoRedirectingLink() {
        homePage.goToHomePage();
        String expected = "Your Store";
        String actual = homePage.getTitlePage();
        assertEquals(expected, actual);
    }
}
