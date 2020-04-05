import core.Config;
import org.openqa.selenium.WebDriver;


import page.HomePage;
import page.RegisterPage;
import page.ShoppingCartPage;
import step.BrandsStep;
import step.ContactUsStep;
import step.HomePageStep;
import step.RegisterStep;

import java.util.concurrent.TimeUnit;

import java.net.MalformedURLException;


public class Main {

    public static void main(String []args) throws MalformedURLException {


        System.setProperty(Config.driver, Config.pathForDriver);
        WebDriver driver = Config.getBrowserInstance();
        driver.get(Config.site);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //ContactUsUser user = new ContactUsUser("Alex","alemail.com","fefjengjengjffg");
        //HomePage homePage = new HomePage(driver);
        //homePage.goToRegisterPage();
        //RegisterStep registerStep = new RegisterStep(driver);
        //registerStep.fillOnlyNecessaryFieldWithValidData(user);
        HomePageStep homePageStep = new HomePageStep(driver);
        //homePageStep.clickContactUs();
        //ContactUsStep contactUsStep = new ContactUsStep(driver);
        //contactUsStep.fillAllFieldsWithInvalidData(user);
        //homePageStep.clickBrands();
        //BrandsStep brandsStep = new BrandsStep(driver);
        //brandsStep.goToTheSpecificBrandProductsPage();



    }
}
