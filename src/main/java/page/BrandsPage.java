package page;

import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class BrandsPage extends BasePage {


    @FindBy(className = "breadcrumb")
    private WebElement breadCrum;

    public BrandsPage(WebDriver driver) {
        super(driver);
    }

    public void clickBrand(String brendName){

        breadCrum.findElement(By.xpath("//a[contains(text(), '" + brendName + "')]")).click();
    }


}
