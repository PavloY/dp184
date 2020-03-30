package page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;


public class HomePage extends BasePage {
    @FindBy(xpath ="//h4//a")
    private List<WebElement> productsOnShowCase;

    List<String> nameProductsList = new ArrayList<>();

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public List<String> getNameProductsList() {
        for (WebElement webElement : productsOnShowCase) {
            nameProductsList.add(webElement.getText());
        }
        return nameProductsList;
    }

    public void clickOnNameOfProduct(String nameOfProduct){
        int indexOfProduct = nameProductsList.indexOf(nameOfProduct);
        productsOnShowCase.get(indexOfProduct).click();
    }
}
