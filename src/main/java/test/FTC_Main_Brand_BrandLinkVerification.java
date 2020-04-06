package test;

import core.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import page.BrandPage;
import step.BrandsStep;
import step.HomePageStep;

import java.net.MalformedURLException;

public class FTC_Main_Brand_BrandLinkVerification extends BaseTest {

    HomePageStep homePageStep;
    BrandsStep brandsStep;

    @Before
    @Override
    public void setUp() throws MalformedURLException {
        super.setUp();
        homePageStep = new HomePageStep(driver);
        brandsStep = new BrandsStep(driver);
        homePageStep.clickBrands();
    }

    @Test
    public void goToTheSpecificBrandPage(){
        String data = "iBasso";
        brandsStep.goToTheSpecificBrandProductsPage(data);
        BrandPage brandPage = new BrandPage(driver);
        String expected = data;
        String actual = brandPage.getTitlePage();
        Assert.assertEquals(expected, actual);
    }

}
