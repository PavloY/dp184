package test.ftcTest.FTC_ProductComparison;

import core.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import step.HomePageStep;
import step.ProductComparisonStep;

import java.net.MalformedURLException;

public class FTC_Auto_Main_ProductComparison_DeleteProductFromProductComparison extends BaseTest {
    ProductComparisonStep productComparisonStep;

    @Before
    @Override
    public void setUp() throws MalformedURLException {
        super.setUp();
        productComparisonStep = new HomePageStep(driver).clickOnProduct("iPhone")
                .addProductToProductComparison();
    }

    @After
    @Override
    public void tearDown() {
        super.tearDown();
        productComparisonStep = null;
    }

    @Test
    public void deleteProductFromProductComparison() {
        productComparisonStep.removeProductFromProductComparison();
        String expected = "Product Comparison";
        String actual = driver.getTitle();
        Assert.assertEquals(expected, actual);
    }
}
