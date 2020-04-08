package test.ftcTest.FTS_Search;

import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;

public class FTC_Main_SearchPage_SearchFunctionInProductDescriptions extends BaseTestSearch{

    public static Collection<Object[]> searchTargets(){
        return Arrays.asList(new Object[][]{
                {"ultrathin"},
                {"Intel Core"},
                {"sony"},
        });
    }

    @Test
    @Parameters(method = "searchTargets")
    public void selectSearchInDescriptionTest(String target) {
        searchPageStep.searchOfItemInDescriptions(target);
        boolean searchResult = searchResultContainsTarget(target, searchPageStep.getPage().getSearchResult());
        boolean resultOfSearchInDescription = searchResultContainsTarget(target, searchPageStep.getPage().getSearchResultInDescriptions());
        Assert.assertTrue(searchResult || resultOfSearchInDescription);
    }

    @Test
    @Parameters(method = "searchTargets")
    public void searchOfItemInSubCategoriesAndDescriptions(String target) {
        searchPageStep.searchOfItemInSubCategoriesAndDescriptions(target, "Laptops & Notebooks");
        boolean searchResult = searchResultContainsTarget(target, searchPageStep.getPage().getSearchResult());
        boolean resultOfSearchInDescription = searchResultContainsTarget(target, searchPageStep.getPage().getSearchResultInDescriptions());
        Assert.assertTrue(searchResult || resultOfSearchInDescription);
    }
}
