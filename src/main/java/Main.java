import core.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import page.HomePage;
import page.ProductPage;
import page.RegisterPage;
import page.SuccessPage;

public class Main {
    public static void main(String []args){

        //System.setProperty("webdriver.gecko.driver", "C:\\Users\\alexv\\Downloads\\Java\\drivers\\geckodriver.exe");
        System.setProperty(Config.driver, Config.pathForDriver);

        WebDriver driver = Config.getBrowserInstance();

        //driver.get("http://184-dp.tk/");
       driver.get(Config.site);
       // HomePage homePage = new HomePage(driver);
//      RegisterPage registerPage = homePage.goToRegisterPage();
//      registerPage.chooseSubscribe("Yes");
        //homePage.chooseCurrency();
        //homePage.goToContactUsPage();

        ProductPage productPage = new ProductPage(driver);



    }
}
