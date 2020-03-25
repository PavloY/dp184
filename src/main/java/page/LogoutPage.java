package page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage extends BasePage {


    @FindBy(xpath = "/html/body/div[2]/div/div/div/div/a")
    private  WebElement continueButton;

    public LogoutPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public HomePage goToHomePage() {
        continueButton.click();
        return super.goToHomePage();
    }
}
