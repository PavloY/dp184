package page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewsletterSubscriptionPage extends BasePage/*extends LoginPage*/ {

    public NewsletterSubscriptionPage(WebDriver driver) {
        super(driver);
    }

    //E-Mail Address from LoginPage & method
    //Password from LoginPage & method
    //LoginButton from LoginPage & method
//    driver.get("http://184-dp.tk/index.php?route=account/login");
//    driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("opencard@mailforspam.com");
//    driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("Qwerty");
//    driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input[1]")).click();

    @FindBy(xpath = "//input[@value='0']")
    private WebElement no;
    @FindBy(xpath = "//input[@value='1']")
    private WebElement yes;

    @FindBy(xpath = "//input[@value='Continue']")
    private WebElement continueButton;

    public NewsletterSubscriptionPage chooseCheckBoxNo() {
        chooseCheckBox(no);
        return this;
    }

    public NewsletterSubscriptionPage chooseCheckBoxYes() {
        chooseCheckBox(yes);
        return this;
    }

    public SuccessPage clickOnContinueButton() {
        continueButton.click();
        return new SuccessPage(driver);
    }
}