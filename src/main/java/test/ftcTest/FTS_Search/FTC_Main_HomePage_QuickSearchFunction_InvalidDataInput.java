package test.ftcTest.FTS_Search;

import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;

public class FTC_Main_HomePage_QuickSearchFunction_InvalidDataInput extends BaseTestSearch{

    public static Collection<Object[]> searchTargets(){
        return Arrays.asList(new Object[][]{
                {"iphon@"},
                {"%$gsg"},
                {""},
        });
    }

    @Test
    @Parameters(method = "searchTargets")
    public void searchOfITemTest(String target) {
        searchPageStep.searchOfItem(target);
        boolean searchResult = searchPageStep.invalidSearch();
        Assert.assertTrue(searchResult);
    }
}
