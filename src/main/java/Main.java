import core.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import page.HomePage;
import page.ShoppingCartPage;

import java.util.concurrent.TimeUnit;


public class Main {
    public static void main(String []args){


        System.setProperty(Config.driver, Config.pathForDriver);
        WebDriver driver = Config.getBrowserInstance();
        driver.get(Config.site);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[3]/button[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[4]/a")).click();

        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        shoppingCartPage.useCouponCode.click();
//        shoppingCartPage.estimateShipping.click();
        shoppingCartPage.useGiftCertificate.click();


//      RegisterPage registerPage = homePage.goToRegisterPage();
//      registerPage.chooseSubscribe("Yes");


        //driver.quit();





    }
}
