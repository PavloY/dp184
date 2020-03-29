package page;

import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;


public class HomePage extends BasePage {
    @FindBy(xpath ="//h4//a")
    private List<WebElement> productsOnShowCase; // List

//    WebElement productOnShowCase;
//    findElement(By.xpath("//a[contains(text(), '" + productName + "')]")

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public List<String> getNameProductsList() {
        //create an empty list in which the label texts will be stored
        List<String> nameProductsList = new ArrayList<>();
        //iterate through all the webElements
        for (WebElement webElement : productsOnShowCase) {
            nameProductsList.add(webElement.getText());
        }
        return nameProductsList;
    }

    public void clickOnProductShowCase(int number){
        productsOnShowCase.get(number).click();
    }

}
