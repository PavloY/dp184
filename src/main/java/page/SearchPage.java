package page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public SearchPage fillSearchField(String desireItem){
        fillField(searchField,desireItem);
        return this;
    }

    public SearchPage selectCategory(String categoryOfItem){
        chooseDataFromDropDownMenu(category,categoryOfItem);
        return this;
    }

    public SearchPage selectSearchInSubCategories(){
        chooseCheckBox(searchInSubcategories);
        return this;
    }

    public SearchPage selectSearchInDescription(){
        chooseCheckBox(searchInProductDescriptions);
        return this;
    }

    public SearchPage clickToSearchButton(){
        searchButton.click();
        return this;
    }







}
