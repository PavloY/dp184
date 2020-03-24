import core.Config;
import org.openqa.selenium.WebDriver;

import page.*;

public class Main {

    public static void main(String []args){

        //System.setProperty("webdriver.gecko.driver", "C:\\Users\\alexv\\Downloads\\Java\\drivers\\geckodriver.exe");
        System.setProperty(Config.driver, Config.pathForDriver);

        WebDriver driver = Config.getBrowserInstance();

        //driver.get("http://184-dp.tk/");
        driver.get(Config.site);
        driver.manage().window().maximize();
        // RegisterPage registerPage = homePage.goToRegisterPage();
        // registerPage.chooseSubscribe("Yes");
        HomePage homePage = new HomePage(driver);
        homePage.scrollDownPage();
        homePage.addToComparison();
        homePage.addIphoneToComparison();
       // ProductPage productPage = new ProductPage(driver);
        //productPage.goToProductPage();
       // productPage.fillProductQuantity("10");
        //productPage.zoomPhoto().turnPhoto().closePhoto();
        //productPage.addReviewOfProduct("Ivan","great product for all users. I like this brand so much", 4);
        //LoginPage loginPage = new LoginPage(driver);
        //loginPage.goToWishListPage();
        //loginPage.fillLoginEmail(emailValue).fillLoginPassword(passwordValue).clickLoginButton();
        //WishListPage wishListPage = new WishListPage(driver);
        //wishListPage.removeProductFromWishList();

        driver.get("http://184-dp.tk/index.php?route=product/compare");
     //   ProductComparisonPage productComparisonPage = new ProductComparisonPage(driver);
       // productComparisonPage.goToHomePageFromProductComparison();

    }
}
