import core.Config;
import org.openqa.selenium.WebDriver;



import page.HomePage;


public class Main {
    public static void main(String []args){


        System.setProperty(Config.driver, Config.pathForDriver);
        WebDriver driver = Config.getBrowserInstance();
        driver.get(Config.site);
        HomePage homePage = new HomePage(driver);
//      RegisterPage registerPage = homePage.goToRegisterPage();
//      registerPage.chooseSubscribe("Yes");
        



    }
}
