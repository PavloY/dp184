package test.ftcTest.FTS_Registration;

import core.BaseTest;
import org.junit.After;
import org.junit.Before;
import step.HomePageStep;
import step.RegisterStep;

import java.net.MalformedURLException;

public class BaseTestRegistration extends BaseTest {
    protected RegisterStep registerStep;

    @Before
    @Override
    public void setUp() throws MalformedURLException {
        super.setUp();
        HomePageStep homePageStep = new HomePageStep(driver);
        registerStep = homePageStep.goToRegisterPage();
    }

    @After
    @Override
    public void tearDown() {
        super.tearDown();
    }
}
