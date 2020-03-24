import core.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import page.HomePage;
import page.RegisterPage;
import page.SuccessPage;

public class Main {
    public static void main(String[] args) {

        System.setProperty(Config.driver, Config.pathForDriver);
        WebDriver driver = Config.getBrowserInstance();
        driver.get(Config.site);
        HomePage homePage = new HomePage(driver);
//      RegisterPage registerPage = homePage.goToRegisterPage();
//      registerPage.chooseSubscribe("Yes");
        homePage.chooseCurrency();
        homePage.goToContactUsPage();
    }
}
