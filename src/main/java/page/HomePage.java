package page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//div[@id='top-links']/ul/li[2]/a/span")
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

