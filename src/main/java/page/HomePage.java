package page;

import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    @FindBy(className = "dropdown")
    protected WebElement myAccountDropDown;

    @FindBy(linkText = "Login")
    protected WebElement loginDropDown;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickMyAccount() {
        myAccountDropDown.click();
    }

    public void clickloginDropDown() {
        loginDropDown.click();
    }
}
