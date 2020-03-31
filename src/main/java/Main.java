import core.Config;
import data.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import page.HomePage;
import page.RegisterPage;
import page.ShoppingCartPage;
import step.RegisterStep;

import java.util.concurrent.TimeUnit;

import java.net.MalformedURLException;


public class Main {
    public static void main(String []args) throws MalformedURLException {


        System.setProperty(Config.driver, Config.pathForDriver);
        WebDriver driver = Config.getBrowserInstance();
        User user = new User("Borys", "Borysov", "borysov@gmail.com",
                "380665624585", "8-123-55-66", "SoftServe", "Kyiv",
                "Peremohy Avenue, 32", "Kyiv", "0411687541", "Ukraine", "Kyiv",
                "12345", "12345");
        driver.get(Config.site);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        HomePage homePage = new HomePage(driver);
        homePage.goToRegisterPage();
        RegisterStep registerStep = new RegisterStep(driver);
        registerStep.fillOnlyNecessaryFieldWithValidData(user);



//        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
//        shoppingCartPage.useCouponCode.click();
//        shoppingCartPage.estimateShipping.click();
//        shoppingCartPage.useGiftCertificate.click();


//      RegisterPage registerPage = homePage.goToRegisterPage();
//      registerPage.chooseSubscribe("Yes");


        //driver.quit();





    }
}
