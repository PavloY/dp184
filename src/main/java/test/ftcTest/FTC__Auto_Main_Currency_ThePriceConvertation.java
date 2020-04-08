package test.ftcTest;

import core.BaseTest;
import data.Constants;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import page.HomePage;
import page.ProductPage;

import java.net.MalformedURLException;

import static org.junit.Assert.assertEquals;

public class FTC__Auto_Main_Currency_ThePriceConvertation extends BaseTest {

    HomePage homePage;
    ProductPage productPage;
    double delta = 0.001;

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
    public void priceConvertationEuroToDollar() {
        double dollarPrice = productPage.getEuroPriceAsDouble() * Constants.EURO_TO_DOLLAR_COURSE;
        double expected = dollarPrice;
        double actual = productPage.getDollarPriceAsDouble();
        assertEquals(expected, actual, delta);

    }

    @Test
    public void priceConvertationEuroToSterling() {
        double sterlingPrice = productPage.getEuroPriceAsDouble() * Constants.EURO_TO_STERLING_COURSE;
        double expected = sterlingPrice;
        double actual = productPage.getSterlingPriceAsDouble();
        assertEquals(expected, actual, delta);
    }

    @Test
    public void priceConvertationDollarToSterling() {
        double sterlingPrice = productPage.getDollarPriceAsDouble() * Constants.DOLLAR_TO_STERLING_COURSE;
        double expected = sterlingPrice;
        double actual = productPage.getSterlingPriceAsDouble();
        assertEquals(expected, actual, delta);
    }
}