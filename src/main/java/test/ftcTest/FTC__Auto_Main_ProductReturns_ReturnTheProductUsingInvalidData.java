package test.ftcTest;

import core.BaseTest;
import data.Constants;
import data.ReturnsUser;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import page.ProductReturnsPage;
import step.ProductReturnsStep;

import java.net.MalformedURLException;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
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

    public static Object[][] fillFieldsWithInValidData() {
        return new Object[][]{
                {Constants.RETURNS_USER_INVALID_DATA_SHORT},
                {Constants.RETURNS_USER_INVALID_DATA_LONG},
        };
    }

    @Test
    @Parameters(method = "fillFieldsWithInValidData")
    public void testFillFieldsWithInValidData(ReturnsUser returnsUser) {
        productReturnsStep.fillWithInValidData(returnsUser);
        String expected = "Product Returns";
        String actual = productReturnsPage.getTitlePage();
        assertEquals(expected, actual);
    }
}