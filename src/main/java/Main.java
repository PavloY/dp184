import core.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import page.*;

public class Main {
    public static void main(String []args){

        //System.setProperty("webdriver.gecko.driver", "C:\\Users\\alexv\\Downloads\\Java\\drivers\\geckodriver.exe");
        System.setProperty(Config.driver, Config.pathForDriver);

        WebDriver driver = Config.getBrowserInstance();

        //driver.get("http://184-dp.tk/");
       driver.get("http://184-dp.tk/index.php?route=account/wishlist");
       // HomePage homePage = new HomePage(driver);
//      RegisterPage registerPage = homePage.goToRegisterPage();
//      registerPage.chooseSubscribe("Yes");
        //homePage.chooseCurrency();
        //homePage.goToContactUsPage();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.fillLoginEmail("ira@i.ua");
        loginPage.fillLoginPassword("Ira007");
        loginPage.clickLoginButton();
        WishListPage wishListPage = new WishListPage(driver);
        wishListPage.removeProductFromWishList();



    }
}
