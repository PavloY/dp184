package page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(id = "input-email")
    protected WebElement email;

    @FindBy(id = "input-password")
    protected WebElement password;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div/form/input")
    protected WebElement loginButton;

    public LoginPage (WebDriver driver){
        super(driver);
    }
    public LoginPage fillLoginEmail(String userEmail){
        fillField(email,userEmail);
        return this;
    }
    public LoginPage fillLoginPassword(String userPassword){
        fillField(password,userPassword);
        return this;
    }
    public WishListPage clickLoginButton(){
        loginButton.click();
        return new WishListPage(driver);
    }


}
