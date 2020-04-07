package test.ftcTest.FTS_Comments;

import core.BaseTest;
import org.junit.After;
import org.junit.Before;
import step.HomePageStep;
import step.ProductStep;

import java.net.MalformedURLException;

public class BaseTestComment extends BaseTest {

    private ProductStep productStep;

    @Before
    @Override
    public void setUp() throws MalformedURLException {
        super.setUp();
        productStep = new HomePageStep(driver).clickOnProduct("iPhone").clickOnReview();
    }
    public ProductStep getProductPageStep(){
        return productStep;
    }
    @After
    @Override
    public void tearDown(){
        super.tearDown();
        productStep = null;
    }
}
