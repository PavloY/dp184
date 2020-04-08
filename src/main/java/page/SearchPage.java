package page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class SearchPage extends BasePage {

    @FindBy(id = "input-search")
    private WebElement searchField;

    @FindBy(name = "category_id")
    private WebElement category;

    @FindBy(name = "sub_category")
    private WebElement searchInSubcategories;

    @FindBy(name = "description")
    private WebElement searchInProductDescriptions;

    @FindBy(id = "button-search")
    private WebElement searchButton;

    @FindBy(xpath = "//div[@class = 'product-thumb']/div[2]//a")
    public List<WebElement> itemsName;

    @FindBy(xpath = "//div[@class = 'caption']//p[1]")
    public List<WebElement> itemsDescriptions;

    @FindBy(xpath = "//*[contains(text(), 'There is no product')]")
    private WebElement invalidSearchMessage;

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public void fillSearchField(String desireItem) {
        fillField(searchField, desireItem);
    }

    public void selectCategory(String categoryOfItem) {
        chooseDataFromDropDownMenu(category, categoryOfItem);
    }

    public void selectSearchInSubCategories() {
        chooseCheckBox(searchInSubcategories);
    }

    public void selectSearchInDescription() {
        chooseCheckBox(searchInProductDescriptions);
    }

    public void clickToSearchButton() {
        searchButton.click();
    }

    public boolean invalidSearchMessageIsVisible(){
        return invalidSearchMessage.isDisplayed();
    }

    public List<String> getSearchResult(){
        List<String> result = new ArrayList<>();
        for (WebElement w : itemsName){
            result.add(w.getText());
        }
        return result;
    }

    public List<String> getSearchResultInDescriptions(){
        List<String> result = new ArrayList<>();
        for (WebElement w : itemsDescriptions){
            result.add(w.getText());
        }
        return result;
    }

}
