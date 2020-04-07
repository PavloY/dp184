package core;

import core.BasePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import step.CartStep;
import step.HomePageStep;
import step.MyAccountStep;
import step.SearchPageStep;

public abstract class BaseStep <T extends BasePage> {
    protected WebDriver driver;
    protected T page;

    public BaseStep(WebDriver driver, T page) {
        this.driver = driver;
        this.page = page;
    }

    public MyAccountStep logout() {
        page.goToLogoutPage();
        String expected = "Account Logout";
        String actual = page.getTitlePage();
        Assert.assertEquals(expected, actual);
        return new MyAccountStep(driver);
    }

    public CartStep goToCart(){
        page.goToShoppingCartPage();
        String expected = "Shopping Cart";
        String actual = page.getTitlePage();
        Assert.assertEquals(expected, actual);
        return new CartStep(driver);
    }

    public HomePageStep clickOnLogoLink(){
        Assert.assertTrue(page.goToHomePage().isCarouselOnHomePage());
        return new HomePageStep(driver);
    }



    public SearchPageStep quickSearch(String item){
        page.fillQuickSearchField(item);
        page.quickSearch();
        return new SearchPageStep(driver);
    }
}
