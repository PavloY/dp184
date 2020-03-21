import core.Config;
import org.openqa.selenium.WebDriver;

import page.HomePage;
import page.ProductPage;

public class Main {
    public static void main(String args[]){
        System.setProperty(Config.driver, Config.pathForDriver);
        WebDriver driver = Config.getBrowserInstance();
        driver.get(Config.site);
        HomePage homePage = new HomePage(driver);
        homePage.chooseCurrency();
        //ProductPage productPage = new ProductPage(driver);
        //productPage.addProductToWishlist();
    }
}
