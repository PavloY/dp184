package step;


import core.BaseStep;
import org.openqa.selenium.WebDriver;
import page.SearchPage;

public class SearchPageStep extends BaseStep<SearchPage> {

    public SearchPageStep(WebDriver driver) {
        super(driver, new SearchPage(driver));
        page.goToSearchPage();
    }

    public SearchPage quickSearchFromAnyPage(String item){
        page.fillQuickSearchField(item)
                .goToSearchPage();
        return this.page;
    }

    public SearchPage searchOfItem(String item){
        page.fillSearchField(item)
                .clickToSearchButton();
        return this.page;
    }

    public SearchPage searchOfITemInCategories(String item, String category){
        page.fillSearchField(item)
                .selectCategory(category)
                .clickToSearchButton();
        return this.page;
    }

    public SearchPage searchOfItemInSubCategories(String item, String category){
        page.fillSearchField(item)
                .selectCategory(category)
                .selectSearchInSubCategories()
                .clickToSearchButton();
        return this.page;
    }

    public SearchPage searchOfItemInDescriptions(String item){
        page.fillSearchField(item)
                .selectSearchInDescription()
                .clickToSearchButton();
        return this.page;
    }
}
