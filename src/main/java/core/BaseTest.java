package core;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;


import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected WebDriver driver;

    @BeforeClass
    public static void start(){
        System.setProperty(Config.driver, Config.pathForDriver);
    }

    @Before
    public void setUp(){
        driver = Config.getBrowserInstance();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(Config.site);
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
