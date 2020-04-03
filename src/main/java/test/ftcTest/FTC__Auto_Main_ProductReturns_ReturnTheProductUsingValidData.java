package test.ftcTest;

import core.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import page.SuccessPage;
import step.ProductReturnsStep;

import java.net.MalformedURLException;

import static org.junit.Assert.assertEquals;

public class FTC__Auto_Main_ProductReturns_ReturnTheProductUsingValidData extends BaseTest {
    ProductReturnsStep productReturnsStep;
    SuccessPage successPage;

    @Before
    @Override
    public void setUp() throws MalformedURLException {
        super.setUp();
        productReturnsStep = new ProductReturnsStep(driver);
        successPage = new SuccessPage(driver);
        successPage.clickReturnsButton();
    }

    @After
    @Override
    public void tearDown() {
        super.tearDown();
        productReturnsStep = null;
        successPage = null;
    }

    @Test
    public void validDate() {
        productReturnsStep.fillValidDate("Inokentiy", "Best", "someuser@example.com",
                "1111111111", "11111", "2020-02-01",
                "iphone", "product 11", "5",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
        String expected = "Thank you for submitting your return request." +
                " Your request has been sent to the relevant department for processing.";
        String actual = successPage.getThankYouSuccessMessage();
        assertEquals(expected, actual);
    }
}