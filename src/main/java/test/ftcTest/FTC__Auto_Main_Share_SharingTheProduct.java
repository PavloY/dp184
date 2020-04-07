package test.ftcTest;

import core.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import page.HomePage;
import page.ProductPage;

import java.net.MalformedURLException;

import static org.junit.Assert.assertEquals;

public class FTC__Auto_Main_Share_SharingTheProduct extends BaseTest {

    HomePage homePage;
    ProductPage productPage;

    @Before
    @Override
    public void setUp() throws MalformedURLException {
        super.setUp();
        homePage = new HomePage(driver);
        productPage = new ProductPage(driver);
        homePage.clickOnNumberOfProduct(1);
    }

    @After
    @Override
    public void tearDown() {
        super.tearDown();
        homePage = null;
        productPage = null;
    }

    @Test
    public void sharingTheProduct() {
        productPage.getShareTweetLink().click();
        String expected = "Поделиться ссылкой в Твиттере";
        String actual = productPage.getTitlePage();
        assertEquals(expected, actual);
    }
}