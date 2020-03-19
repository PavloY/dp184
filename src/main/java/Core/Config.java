package Core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public final class Config {

    public static String adminSite;
    public static String site;
    public static  String pathForDriver;
    public static String driver;
    public static final String PATH_PROPERTY_FILE = "src\\main\\resources\\dev.properties";

    static {
        getConfig();
    }

    public static WebDriver getBrowserInstance(){
        if(driver.contains("gecko")){
            return new FirefoxDriver();
        }else if(driver.contains("chrome")){
            return new ChromeDriver();
        }else if(driver.contains("edge")){
            return new EdgeDriver();
        }else if(driver.contains(".ie.")){
            return new InternetExplorerDriver();
        }else if(driver.contains("opera")){
            return new OperaDriver();
        }else if(driver.contains("safari")){
            return new SafariDriver();
        }
        return null;//Exception
    }

    private static void getConfig(){
        Properties properties = new Properties();
        try(FileInputStream in = new FileInputStream(PATH_PROPERTY_FILE)){
            properties.load(in);
        }catch (IOException e){
            System.out.println("Sorry, unable to find config.properties");
        }
        Config.site = properties.getProperty("Site");
        adminSite = properties.getProperty("AdminSite");
        pathForDriver = properties.getProperty("PathForDriver");
        Config.driver = properties.getProperty("Driver");

    }


}
