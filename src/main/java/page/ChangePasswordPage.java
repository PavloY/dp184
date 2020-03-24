package page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChangePasswordPage extends BasePage {

    @FindBy(id = "input-password")
    private WebElement password;

    @FindBy(id = "input-confirm")
    private WebElement confirm;

    @FindBy(xpath = "//div[@class='pull-left']/a")
    private WebElement buttonBack;

    @FindBy(xpath = "//div[@class='pull-right']/input")
    private WebElement buttonContinue;

    public ChangePasswordPage(WebDriver driver) {
        super(driver);
    }

    public ChangePasswordPage fillPassword(String userPassword){
        fillField(password, userPassword);
        return this;
    }

    public ChangePasswordPage fillConfirmPassword(String userConfirmPassword){
        fillField(confirm, userConfirmPassword);
        return this;
    }

    public void clickOnBackButton(){
        buttonBack.click();
    }

    public void clickOnContinueButton(){
        buttonContinue.click();
    }



}
