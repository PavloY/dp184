package test.ftcTest;

import core.BaseTest;
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
        double expected = productPage.getEuroPriceAsDouble() * 1.274608783442706;
        double actual = productPage.getDollarPriceAsDouble();
        assertEquals(expected, actual, delta);

    }

    @Test
    public void priceConvertationEuroToSterling() {
        double expected = productPage.getEuroPriceAsDouble() * 0.7806663301362948;
        double actual = productPage.getSterlingPriceAsDouble();
        assertEquals(expected, actual, delta);
    }

    @Test
    public void priceConvertationDollarToSterling() {
        double expected = productPage.getDollarPriceAsDouble() * 0.6124752475247525;
        double actual = productPage.getSterlingPriceAsDouble();
        assertEquals(expected, actual, delta);
    }
}
