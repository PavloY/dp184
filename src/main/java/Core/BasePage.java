package Core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import page.HomePage;
import page.RegisterPage;

public abstract class BasePage {

    @FindBy(className = "dropdown")
    protected WebElement myAccount;

    @FindBy(xpath = "//div[@id='logo']/a/img")
    protected WebElement homeRedirect;


    protected WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public RegisterPage goToRegisterPage(){
        myAccount.click();
        driver.findElement(By.linkText("Register")).click();
        return new RegisterPage(driver);
    }

    public HomePage goToHomePage(){
        homeRedirect.click();
        return new HomePage(driver);
    }

    public BasePage fillField(WebElement webElement, String userData){
        webElement.clear();
        webElement.sendKeys(userData);
        return this;
    }

    public BasePage chooseDataInField(WebElement webElement, String userData){
        webElement.click();
        driver.findElement(By.xpath("//option[text()='" + userData + "']")).click();
        return this;
    }

    public BasePage checkRadioButtonByName(String className, int numberOfRadioButton){
        driver.findElement(By.xpath("//*[@class='"+ className +"']//label[" + numberOfRadioButton + "]/input")).click();
        return this;
    }

    public BasePage checkAgree(WebElement webElement){
        webElement.click();
        return this;
    }

    public String getTextContent(WebElement webElement){
        return webElement.getText();
    }

}
