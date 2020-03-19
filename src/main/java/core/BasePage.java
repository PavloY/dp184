package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import page.HomePage;
import page.RegisterPage;

public abstract class BasePage {

    @FindBy(className = "dropdown-toggle")
    protected WebElement currency;

    @FindBy(className = "dropdown")
    protected WebElement myAccount;

    @FindBy(xpath = "//div[@id='logo']/a/img")
    protected WebElement homeRedirect;


    protected WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public BasePage chooseCurrency(){
        currency.click();
        return this;
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

    public BasePage chooseDataFromDropDownMenu(WebElement webElement, String userData){
        webElement.click();
        driver.findElement(By.xpath("//option[text()='" + userData + "']")).click();
        return this;
    }

    public BasePage checkRadioButtonByName(String className, int numberOfRadioButton){
        driver.findElement(By.xpath("//*[@class='"+ className +"']//label[" + numberOfRadioButton + "]/input")).click();
        return this;
    }

    public BasePage chooseCheckBox(WebElement webElement){
        //check if selected
        webElement.click();
        return this;
    }

    public BasePage chooseUncheckBox(WebElement webElement){
//        //check if selected
//        webElement.click();
        return this;
    }

    public String getTextContent(WebElement webElement){
        return webElement.getText();
    }

    public String getTitlePage(){
        return driver.getTitle();
    }

    //scrollPage

    //is Element avileable

}
