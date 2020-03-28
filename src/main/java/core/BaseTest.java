package core;


import junitparams.JUnitParamsRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.junit.runner.RunWith;
import org.junit.Rule;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.MalformedURLException;
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
  protected WebDriver driver;

    @BeforeClass
    public static void start(){
        System.setProperty(Config.driver, Config.pathForDriver);
    }

    @Before
    public void setUp() throws MalformedURLException {
        driver = Config.getBrowserInstance();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(Config.site);
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
