package test.ftcTest;

import core.BaseTest;
import data.Constants;
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
    public void validData() {
        productReturnsStep.fillValidData(Constants.RETURNS_USER_VALID_DATA);
        String expected = "Thank you for submitting your return request." +
                " Your request has been sent to the relevant department for processing.";
        String actual = successPage.getThankYouSuccessMessage();
        assertEquals(expected, actual);
    }
}