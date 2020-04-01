import core.Config;
import data.ContactUsUser;
import data.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import page.HomePage;
import page.RegisterPage;
import page.ShoppingCartPage;
import step.ContactUsStep;
import step.HomePageStep;
import step.RegisterStep;

import java.util.concurrent.TimeUnit;

import java.net.MalformedURLException;


public class Main {
    public static void main(String []args) throws MalformedURLException {


        System.setProperty(Config.driver, Config.pathForDriver);
        WebDriver driver = Config.getBrowserInstance();
        ContactUsUser user = new ContactUsUser("Alex","alemail.com","fefjengjengjffg");
        driver.get(Config.site);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //HomePage homePage = new HomePage(driver);
        //homePage.goToRegisterPage();
        //RegisterStep registerStep = new RegisterStep(driver);
        //registerStep.fillOnlyNecessaryFieldWithValidData(user);
        HomePageStep homePageStep = new HomePageStep(driver);
        homePageStep.clickContactUs();
        ContactUsStep contactUsStep = new ContactUsStep(driver);
        contactUsStep.fillAllFieldsWithInvalidData(user);



//        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
//        shoppingCartPage.useCouponCode.click();
//        shoppingCartPage.estimateShipping.click();
//        shoppingCartPage.useGiftCertificate.click();


//      RegisterPage registerPage = homePage.goToRegisterPage();
//      registerPage.chooseSubscribe("Yes");


        //driver.quit();





    }
}
