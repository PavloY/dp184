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

    public static String adminSite;
    public static String selenoidServer;
    public static String site;
 //   public static  String pathForDriver ="";
    public static String driverName ="remote";
    public static final String PATH_PROPERTY_FILE = "src\\main\\resources\\dev.properties";

  //  static {
  //      getConfig();
  //  }



    public static WebDriver getBrowserInstance() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", false);

        if(driverName.contains("gecko")){
            return new FirefoxDriver();
        }else if(driverName.contains("chrome")){
            return new ChromeDriver();
        }else if(driverName.contains("edge")){
            return new EdgeDriver();
        }else if(driverName.contains(".ie.")){
            return new InternetExplorerDriver();
        }else if(driverName.contains("opera")){
            return new OperaDriver();
        }else if(driverName.contains("safari")){
            return new SafariDriver();
        }else if(driverName.contains("remote")){
            return new RemoteWebDriver(URI.create("http://144.76.5.68:4444/wd/hub").toURL(),capabilities);
        }
        return null;//Exception
    }

    private static void getConfig(){
        Properties properties = new Properties();
    //    try(FileInputStream in = new FileInputStream(PATH_PROPERTY_FILE)){
    //        properties.load(in);
    //    }catch (IOException e){
    //        System.out.println("Sorry, unable to find config.properties");
    //    }
        Config.site = properties.getProperty("Site");
        adminSite = properties.getProperty("AdminSite");
      String pathForDriver = properties.getProperty("PathForDriver");
        Config.driverName = properties.getProperty("DriverName");
        selenoidServer = properties.getProperty("Selenoid");
    }





}
