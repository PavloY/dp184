package test.ftcTest.FTS_Comments;

import core.BaseTest;
import org.junit.After;
import org.junit.Before;
import step.HomePageStep;
import step.ProductStep;

import java.net.MalformedURLException;

public class BaseTestComment extends BaseTest {

    private HomePageStep homePageStep;
    private ProductStep productStep;

    @Before
    @Override
    public void setUp() throws MalformedURLException {
        super.setUp();
        homePageStep = new HomePageStep(driver);
        productStep = new ProductStep(driver);
        homePageStep.clickOnProduct("iPhone"); // HardCode
        productStep.clickOnReview();
    }
    public ProductStep getProductPageStep(){
        return productStep;
    }
    @After
    @Override
    public void tearDown(){
        super.tearDown();
        homePageStep = null;
        productStep = null;
    }
}