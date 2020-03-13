package test;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import page.HomePage;
import page.RegisterPage;
import page.SuccessPage;

import java.util.concurrent.TimeUnit;

public class FirstTest {
    WebDriver driver;

    @BeforeClass
    public static void start(){
        System.setProperty("webdriver.gecko.driver", "D:\\Java\\drivers\\geckodriver.exe");
    }

    @Before
    public void setUp(){
        driver = new FirefoxDriver();
    }

    @Test
    public void firstTest(){
        driver.get("http://184-dp.tk/");
        HomePage homePage = new HomePage(driver);
        RegisterPage regPage = homePage.goToRegisterPage();
        SuccessPage successPage = regPage.registerOnlyWithOnlyNecessaryFields();
        String actual = successPage.getContent();
        String expected = "Your Account Has Been Created!";
        Assert.assertEquals(expected, actual);
    }

    @After
    public void tearDown(){
        driver.get("http://184-dp.tk/admin");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("input-username")).sendKeys("admin");
        driver.findElement(By.id("input-password")).sendKeys("1234566aZ$");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        WebElement link = driver.findElement(By.xpath("/html/body/div[1]/nav/ul/li[6]/a/i"));
        Actions actions = new Actions(driver);
        actions.moveToElement(link).build().perform();
        driver.findElement(By.xpath("//li[@id='menu-customer']//ul/li/a[text()='Customers']")).click();
        driver.findElement(By.xpath("//tr/td[2][text()='Boris Borisov']/..//input[@name='selected[]']")).click();
        driver.findElement(By.xpath("//div[@class='pull-right']//button[@class='btn btn-danger']")).click();
        driver.switchTo().alert().accept();
        driver.quit();
    }


}
