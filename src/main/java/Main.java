import core.Config;
import data.ContactUsUser;
import data.EditAddressUser;
import data.User;
import org.openqa.selenium.By;
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
        ContactUsUser user = new ContactUsUser("Alex","alemail.com","fefjengjengjffg");
        EditAddressUser userEditAddress = new EditAddressUser("Nataliya", "Kryuchkova", "Year",
                "78 McCullough Dr.", "UA20143", "New Castle", "19726",
                "United States", "Delaware", true);
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
