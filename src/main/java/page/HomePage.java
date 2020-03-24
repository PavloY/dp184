package page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[1]/div/div[3]/button[3]")
    protected WebElement addMacBookToComparisonButton;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/div/div[3]/button[3]")
    protected WebElement addIphoneToComparisonButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage addToComparison(){
        addMacBookToComparisonButton.click();
        return this;
    }
    public HomePage addIphoneToComparison(){
        addIphoneToComparisonButton.click();
        return this;
    }


}
