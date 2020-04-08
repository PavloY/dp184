package test.ftcTest.FTS_Search;

import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;

public class FTC_Auto_Main_HomePage_QuickSearchFunction extends BaseTestSearch {

    @Test
    @Parameters(method = "searchTargets")
    public void quickSearchTest(String target) {
        searchPageStep.quickSearch(target);
        boolean searchResult = searchResultContainsTarget(target, searchPageStep.getPage().getSearchResult());
        Assert.assertTrue(searchResult);
    }
}
