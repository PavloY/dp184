package test.ftcTest;

import core.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import page.ProductReturnsPage;
import step.ProductReturnsStep;

import java.net.MalformedURLException;

import static org.junit.Assert.assertEquals;

public class FTC_Main_ProductReturns_ReturnTheProductUsingInvalidData extends BaseTest {
    ProductReturnsStep productReturnsStep;
    ProductReturnsPage productReturnsPage;

    @Before
    @Override
    public void setUp() throws MalformedURLException {
        super.setUp();
        productReturnsStep = new ProductReturnsStep(driver);
        productReturnsPage = new ProductReturnsPage(driver);
        productReturnsPage.clickReturnsButton();
    }

    @After
    @Override
    public void tearDown() {
        super.tearDown();
        productReturnsStep = null;
        productReturnsPage = null;
    }

    @Test
    public void fillWithInValidDate() {
        productReturnsStep.fillWithInValidDate(" ", " ", " ",
                " ", " ", " ",
                " ", " ", " ",
                " ");
        String expected = "Product Returns";
        String actual = productReturnsPage.getTitlePage();
        assertEquals(expected, actual);
    }
}