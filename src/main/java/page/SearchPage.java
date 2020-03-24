package page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {

    private static final String PATH_TO_SEARCH_PAGE = "index.php?route=product/search";

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

    public SearchPage sellectKategory(String categotiOfItem){
        chooseDataFromDropDownMenu(category,categotiOfItem);
        return this;
    }

    public SearchPage selectSearchInSubkategories(){
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
