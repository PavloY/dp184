package test.ftcTest.FTS_Search;

import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;

public class FTC_Auto_Main_SearchPage_SearchFunction extends BaseTestSearch {

    @Test
    @Parameters(method = "searchTargets")
    public void searchOfITemTest(String target) {
        searchPageStep.searchOfItem(target);
        boolean searchResult = searchResultContainsTarget(target, searchPageStep.getPage().getSearchResult());
        Assert.assertTrue(searchResult);
    }



}
