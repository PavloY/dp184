package core;

import io.qameta.allure.Attachment;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.junit.runner.RunWith;
import org.junit.Rule;
import junitparams.JUnitParamsRunner;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.MalformedURLException;
import java.net.URI;
import java.util.concurrent.TimeUnit;

    @RunWith(JUnitParamsRunner.class)
    public class BaseTest{
        static final Logger logger = LoggerFactory.getLogger(BaseTest.class);
        @Rule
        public TestWatcher watchman= new TestWatcher(){

            @Override
            public void starting(Description method) {
                logger.info("Run Test {}...", method.getMethodName());
            }
            @Override
            public void succeeded(Description method) {
                logger.info("Test {} succeeded.", method.getMethodName());
            }
            @Override
            public void failed(Throwable e, Description method) {
                logger.error("Test {} failed with {}.", method.getMethodName(), e);
            }
        };
        protected RemoteWebDriver driver;

  
    @Attachment
    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", false);
        driver = new RemoteWebDriver(URI.create("http://144.76.5.68:4444/wd/hub").toURL(),capabilities);
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
