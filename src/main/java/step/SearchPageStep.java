package step;


import core.BaseStep;
import org.openqa.selenium.WebDriver;
import page.SearchPage;

public class SearchPageStep extends BaseStep<SearchPage> {

    public SearchPageStep(WebDriver driver) {
        super(driver, new SearchPage(driver));
//        page.quickSearch();
    }

    public SearchPage getPage(){
        return page;
    }

    public SearchPageStep searchOfItem(String item){
        page.fillSearchField(item);
        page.clickToSearchButton();
        return this;
    }

    public SearchPageStep searchOfITemInCategories(String item, String category){
        page.fillSearchField(item);
        page.selectCategory(category);
        page.clickToSearchButton();
        return this;
    }

    public SearchPageStep searchOfItemInSubCategories(String item, String category){
        page.fillSearchField(item);
        page.selectCategory(category);
        page.selectSearchInSubCategories();
        page.clickToSearchButton();
        return this;
    }

    public SearchPageStep searchOfItemInDescriptions(String item){
        page.fillSearchField(item);
        page.selectSearchInDescription();
        page.clickToSearchButton();
        return this;
    }

    public SearchPageStep searchOfItemInSubCategoriesAndDescriptions(String item, String category){
        page.fillSearchField(item);
        page.selectCategory(category);
        page.selectSearchInSubCategories();
        page.selectSearchInDescription();
        page.clickToSearchButton();
        return this;
    }
}
