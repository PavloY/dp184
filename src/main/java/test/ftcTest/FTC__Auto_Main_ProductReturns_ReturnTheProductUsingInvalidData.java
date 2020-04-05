package test.ftcTest;

import core.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import page.ProductReturnsPage;
import step.ProductReturnsStep;

import java.net.MalformedURLException;

import static org.junit.Assert.assertEquals;

public class FTC__Auto_Main_ProductReturns_ReturnTheProductUsingInvalidData extends BaseTest {
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
    public void fillWithInValidDataShort() {
        productReturnsStep.fillWithInValidData(" ", " ", " ",
                " ", " ", " ",
                " ", " ", " ",
                " ");
        String expected = "Product Returns";
        String actual = productReturnsPage.getTitlePage();
        assertEquals(expected, actual);
    }

    @Test
    public void fillWithInValidDataLong() {
        productReturnsStep.fillWithInValidData("333333333333333333333333333333333", "333333333333333333333333333333333", "example",
                "333333333333333333333333333333333", "$", "$",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. A diam sollicitudin tempor id eu nisl nunc. Ac tortor dignissim convallis aenean et tortor at risus viverra. Feugiat vivamus at augue", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed does", "$",
                "$");
        String expected = "Product Returns";
        String actual = productReturnsPage.getTitlePage();
        assertEquals(expected, actual);
    }
}