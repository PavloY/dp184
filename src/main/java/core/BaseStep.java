package core;

import org.openqa.selenium.WebDriver;
import step.SearchPageStep;

public abstract class BaseStep <T extends BasePage> {
    protected WebDriver driver;
    protected T page;

    public BaseStep(WebDriver driver, T page) {
        this.driver = driver;
        this.page = page;
    }

    public SearchPageStep quickSearch(String item){
        page.fillQuickSearchField(item);
        page.quickSearch();
        return new SearchPageStep(driver);
    }
}
