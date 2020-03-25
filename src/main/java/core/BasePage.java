package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import page.BrandsPage;
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

    @FindBy(xpath = "/html/body/footer/div/div/div[2]/ul/li[1]/a")
    protected  WebElement contactUs;

    @FindBy(xpath = "/html/body/footer/div/div/div[3]/ul/li[1]/a")
    protected  WebElement Brands;

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

    public BrandsPage goToBrandsPage(){
        Brands.click();
        return new BrandsPage(driver);
    }

    public void fillField(WebElement webElement, String userData){
        webElement.clear();
        webElement.sendKeys(userData);

    }

    public void chooseDataFromDropDownMenu(WebElement webElement, String userData){
        webElement.click();
        driver.findElement(By.xpath("//option[text()='" + userData + "']")).click();

    }

    public BasePage checkRadioButtonByName(String className, int numberOfRadioButton){
        driver.findElement(By.xpath("//*[@class='"+ className +"']//label[" + numberOfRadioButton + "]/input")).click();
        return this;
    }

    public BasePage chooseCheckBox(WebElement webElement){
        if(!webElement.isSelected()) webElement.click();
        return this;
    }

    public BasePage chooseUncheckBox(WebElement webElement){
        if(webElement.isSelected()) webElement.click();
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
