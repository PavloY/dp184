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
  /*  WebDriver driver;
    HomePage homePage;
    RegisterPage regPage;

    @BeforeClass
    public static void start(){
        System.setProperty(Config.driver, Config.pathForDriver);
    }

    @Before
    public void setUp(){
        driver = Config.getBrowserInstance();
        driver.get(Config.site);
        homePage = new HomePage(driver);
        regPage = homePage.goToRegisterPage();
    }


    @Test
    public void registerUserWithValidDataUsingAllFields() {

        String expected = "Your Account Has Been Created!";

        regPage.fillField(regPage.getFirstName(), "Boris")
                .fillField(regPage.getLastName(), "Borisov")
                .fillField(regPage.getEmail(), "Borisov@gmail.com")
                .fillField(regPage.getTelephone(), "380506526595")
                .fillField(regPage.getFax(), "8-812-1234567")
                .fillField(regPage.getCompany(), "SoftServe")
                .fillField(regPage.getAddress1(), "Kyiv")
                .fillField(regPage.getAddress2(), "Peremohy Avenue, 32")
                .fillField(regPage.getCity(), "Kyiv")
                .fillField(regPage.getPostcode(), "0411687541")
                .chooseDataFromDropDownMenu(regPage.getCountry(), "Ukraine")
                .chooseDataFromDropDownMenu(regPage.getZone(), "Kyiv")
                .fillField(regPage.getPassword(), "12345")
                .fillField(regPage.getConfirm(), "12345")
                .checkRadioButtonByName("form-group", 1)
                .chooseCheckBox(regPage.getAgree());
        SuccessPage successPage = regPage.clickOnButtonWithValidData();
                String actual = successPage.getTextContent(successPage.getContent());

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void registerUserWithValidDataUsingOnlyNecessaryFields(){

        String expected = "Your Account Has Been Created!";

        regPage.fillField(regPage.getFirstName(), "Boris")
                .fillField(regPage.getLastName(), "Borisov")
                .fillField(regPage.getEmail(), "Borisov@gmail.com")
                .fillField(regPage.getTelephone(), "79055625489")
                .fillField(regPage.getAddress1(), "Moscow")
                .fillField(regPage.getCity(), "Moscow")
                .chooseDataFromDropDownMenu(regPage.getCountry(), "Russian Federation")
                .chooseDataFromDropDownMenu(regPage.getZone(), "Moscow")
                .fillField(regPage.getPassword(), "QWERTY")
                .fillField(regPage.getConfirm(), "QWERTY")
                .chooseCheckBox(regPage.getAgree());

        SuccessPage successPage = regPage.clickOnButtonWithValidData();
        String actual = successPage.getTextContent(successPage.getContent());
        Assert.assertEquals(expected, actual);

    }

    @After
    public void tearDown(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(Config.adminSite);
        WebDriverWait wait = new WebDriverWait(driver, 5);
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
    }

   */
}
