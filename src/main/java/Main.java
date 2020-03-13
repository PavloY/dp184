import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import page.HomePage;
import page.RegisterPage;
import page.SuccessPage;

public class Main {
    public static void main(String args[]){
        System.setProperty("webdriver.gecko.driver", "D:\\Java\\drivers\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "D:\\Java\\drivers\\chromedriver.exe");
        WebDriver driver = new FirefoxDriver();
//        WebDriver driver = new ChromeDriver();
        driver.get("http://184-dp.tk/");
        HomePage homePage = new HomePage(driver);
        RegisterPage regPage = homePage.goToRegisterPage();
        SuccessPage successPage = regPage.registerOnlyWithOnlyNecessaryFields();
        successPage.getContent();
    }
}
