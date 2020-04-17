package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.util.Properties;

public final class Config {

    public static String adminSite ="http://184-dp.tk/admin";
    public static String selenoidServer = "http://134.209.252.19:4444/wd/hub";
    public static String site ="http://184-dp.tk";
    public static  String pathForDriver = "\\Tools\\geckodriver.exe";
    public static String driver ="remote";
    public static final String PATH_PROPERTY_FILE = "src\\main\\resources\\dev.properties";

    // static {
    //     getConfig();
    // }


    public static WebDriver getBrowserInstance() throws MalformedURLException {

        if (driver.contains("gecko")) {
            return new FirefoxDriver();
        } else if (driver.contains("chrome")) {
            return new ChromeDriver();
        } else if (driver.contains("edge")) {
            return new EdgeDriver();
        } else if (driver.contains(".ie.")) {
            return new InternetExplorerDriver();
        } else if (driver.contains("opera")) {
            return new OperaDriver();
        } else if (driver.contains("safari")) {
            return new SafariDriver();
        } else if (driver.contains("remote")) {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setBrowserName("chrome");
            capabilities.setCapability("enableVNC", true);
            capabilities.setCapability("enableVideo", false);
            return new RemoteWebDriver(URI.create(selenoidServer).toURL(), capabilities);
        }
        return null;//Exception
    }

    private static void getConfig() {
        Properties properties = new Properties();
        try (FileInputStream in = new FileInputStream(PATH_PROPERTY_FILE)) {
            properties.load(in);
        } catch (IOException e) {
            System.out.println("Sorry, unable to find config.properties");
        }
        Config.site = properties.getProperty("Site");
        adminSite = properties.getProperty("AdminSite");
        pathForDriver = properties.getProperty("PathForDriver");
        Config.driver = properties.getProperty("Driver");
        selenoidServer = properties.getProperty("Selenoid");
    }
}
