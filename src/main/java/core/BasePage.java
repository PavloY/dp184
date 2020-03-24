package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import page.ContactUsPage;
import page.HomePage;
import page.RegisterPage;

public abstract class BasePage {

    @FindBy(className = "dropdown-toggle")
    protected WebElement currency;

    @FindBy(className = "dropdown")
    protected WebElement myAccount;

    @FindBy(xpath = "//div[@id='logo']/a/img")
    protected WebElement homeRedirect;

    //@FindBy(xpath = "//a[@href='http://184-dp.tk/index.php?route=information/contact']")
    @FindBy(xpath = "/html/body/footer/div/div/div[2]/ul/li[1]/a")
    protected  WebElement contactUs;


    protected WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void chooseCurrency(){
        currency.click();

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

    public ContactUsPage goToContactUsPage(){
        contactUs.click();
        return new ContactUsPage(driver);
    }

    public void fillField(WebElement webElement, String userData){
        webElement.clear();
        webElement.sendKeys(userData);

    }

    public void chooseDataFromDropDownMenu(WebElement webElement, String userData){
        webElement.click();
        driver.findElement(By.xpath("//option[text()='" + userData + "']")).click();

    }

    public void checkRadioButtonByName(String className, int numberOfRadioButton){
        driver.findElement(By.xpath("//*[@class='"+ className +"']//label[" + numberOfRadioButton + "]/input")).click();

    }

    public BasePage chooseCheckBox(WebElement webElement){
        //check if selected
        webElement.click();
        return this;
    }

    public void chooseUncheckBox(WebElement webElement){
//        //check if selected
//        webElement.click();

    }

    public String getTextContent(WebElement webElement){
        return webElement.getText();
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
