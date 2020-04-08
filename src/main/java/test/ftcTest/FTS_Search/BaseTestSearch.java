package test.ftcTest.FTS_Search;

import core.BaseTest;
import junitparams.JUnitParamsRunner;
import org.junit.Before;
import org.junit.runner.RunWith;
import step.HomePageStep;
import step.SearchPageStep;

import java.net.MalformedURLException;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@RunWith(JUnitParamsRunner.class)
public class BaseTestSearch extends BaseTest {
    protected static SearchPageStep searchPageStep;

    @Before
    @Override
    public void setUp() throws MalformedURLException {
        super.setUp();
        this.searchPageStep = new SearchPageStep(driver);
        searchPageStep.quickSearch("");
    }

    public static Collection<Object[]> searchTargets(){
        return Arrays.asList(new Object[][]{
                {"iphone"},
                {"mac"},
                {"htc"},
        });
    }

    protected boolean searchResultContainsTarget(String target, List<String> searchResult){
        if (searchResult.size() == 0) return false;
        for (String s: searchResult){
               if (!s.toLowerCase().contains(target.toLowerCase())) return false;
        }
        return true;
    }
}
