package test;

import core.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import step.SearchPageStep;

import java.util.List;

public class SearchStepTest extends BaseTest {
    private static SearchPageStep searchPageStep;

    @Before
    public void goToSearchPage(){
        this.searchPageStep = new SearchPageStep(driver);
        searchPageStep.quickSearch("");
    }

    @Test
    public void quickSearchTest() {
        searchPageStep.quickSearch("iphone");

        String expected = "iPhone";

        List<String> actual = searchPageStep.getPage().getSearchResult();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void searchOfITemTest() {
        searchPageStep.searchOfItem("mac");

        String expected = "iMac" +
                "MacBook" +
                "MacBook Air" +
                "MacBook Pro" +
                "Apple MacBook Air" +
                "Apple MacBook Pro";

        List<String> actual = searchPageStep.getPage().getSearchResult();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void searchOfITemInCategoriesTest() {
        searchPageStep.searchOfITemInCategories("mac", "Laptops & Notebooks");

        String expected = "MacBook" +
                "MacBook Air" +
                "MacBook Pro";

        List<String> actual = searchPageStep.getPage().getSearchResult();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void selectSearchInSubCategoriesTest() {
        searchPageStep.searchOfItemInSubCategories("mac", "Laptops & Notebooks");

        String expected = "MacBook" +
                "MacBook Air" +
                "MacBook Pro"+
                "Apple MacBook Air" +
                "Apple MacBook Pro";

        List<String> actual = searchPageStep.getPage().getSearchResult();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void selectSearchInDescriptionTest() {
        searchPageStep.searchOfItemInDescriptions("mac");

        String expected = "MacBook" +
                "MacBook Air" +
                "MacBook Pro"+
                "Apple MacBook Air" +
                "Apple MacBook Pro";

        List<String> actual = searchPageStep.getPage().getSearchResult();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void searchOfItemInSubCategoriesAndDescriptions() {
        searchPageStep.searchOfItemInSubCategoriesAndDescriptions("mac", "Laptops & Notebooks");

        String expected = "MacBook" +
                "MacBook Air" +
                "MacBook Pro"+
                "Apple MacBook Air" +
                "Apple MacBook Pro";

        List<String> actual = searchPageStep.getPage().getSearchResult();

        Assert.assertEquals(expected, actual);
    }
}
