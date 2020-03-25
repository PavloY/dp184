package test;

import core.Config;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.HomePage;
import page.RegisterPage;
import page.SuccessPage;

import java.util.concurrent.TimeUnit;


public class FTC_Main_Registration_RegisterUserWithValidData {
    WebDriver driver;
    HomePage homePage;
    RegisterPage regPage;

   /* @BeforeClass
    public static void start(){
        System.setProperty(Config.driver, Config.pathForDriver);
    }

    @Before
    public void setUp(){
        driver = Config.getBrowserInstance();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(Config.site);
        homePage = new HomePage(driver);
        regPage = homePage.goToRegisterPage();
    }


//    @Test
//    public void registerUserWithValidDataUsingAllFields() {
//
//        String expected = "Your Account Has Been Created!";
//
//        regPage.fillFirstName("Boris")
//                .fillLastName("Borisov")
//                .fillEmail("Borisov@gmail.com")
//                .fillTelephone("380506526595")
//                .fillFax("8-812-1234567")
//                .fillCompany("SoftServe")
//                .fillAddress1("Kyiv")
//                .fillAddress2("Peremohy Avenue, 32")
//                .fillCity("Kyiv")
//                .fillPostCode("0411687541")
//                .chooseCountry("Ukraine")
//                .chooseRegion("Kyiv")
//                .fillPassword("12345")
//                .fillConfirmPassword("12345")
//                .checkRadioButtonByName("form-group", 1)
//                .chooseCheckBox(regPage.getAgree());
//
//        SuccessPage successPage = regPage.clickOnButtonWithValidData();
//                String actual = successPage.getContent();
//
//        Assert.assertEquals(expected, actual);
//    }
//
//
//    @Test
//    public void registerUserWithValidDataUsingOnlyNecessaryFields(){
//
//        String expected = "Your Account Has Been Created!";
//
//        regPage.fillFirstName("Boris")
//                .fillLastName("Borisov")
//                .fillEmail("Borisov@gmail.com")
//                .fillTelephone("79055625489")
//                .fillAddress1("Moscow")
//                .fillCity("Moscow")
//                .chooseCountry("Russian Federation")
//                .chooseRegion("Moscow")
//                .fillPassword("QWERTY")
//                .fillConfirmPassword("QWERTY")
//                .chooseCheckBox(regPage.getAgree());
//
//        SuccessPage successPage = regPage.clickOnButtonWithValidData();
//        String actual = successPage.getContent();
//        Assert.assertEquals(expected, actual);
//
//    }

    @After
    public void tearDown(){
        driver.get(Config.adminSite);
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        driver.findElement(By.id("input-username")).sendKeys("admin");
        driver.findElement(By.id("input-password")).sendKeys("1234566aZ$");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.id("button-menu")).click();
        driver.findElement(By.xpath("//li[@id='menu-customer']/a")).click();
        driver.findElement(By.xpath("//li[@id='menu-customer']//a[text()='Customers']")).click();
        driver.findElement(By.xpath("//tr/td[text()='Boris Borisov']/..//input[@name='selected[]']")).click();
        driver.findElement(By.xpath("//div[@class='pull-right']//button[@class='btn btn-danger']")).click();
        driver.switchTo().alert().accept();
        driver.quit();
    }*/
}
