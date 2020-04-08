package test.ftcTest.FTS_Search;

import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;

public class FTC_Auto_Main_SearchPage_SearchFunctionInSubcategories extends BaseTestSearch{

    @Test
    @Parameters(method = "searchTargets")
    public void selectSearchInSubCategoriesTest(String target) {
        searchPageStep.searchOfItemInSubCategories(target, "Laptops & Notebooks");
        boolean searchResult = searchResultContainsTarget(target, searchPageStep.getPage().getSearchResult());
        Assert.assertTrue(searchResult);
    }
}
