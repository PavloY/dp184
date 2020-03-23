import core.Config;
import org.openqa.selenium.WebDriver;

import page.ContactUsPage;
import page.SearchPage;

public class Main {
    public static void main(String []args){

        System.setProperty(Config.driver, Config.pathForDriver);
        WebDriver browser = Config.getBrowserInstance();
//        browserInstance.get(Config.site);
//        browserInstance.get(Config.site + "index.php?route=product/search");
        SearchPage searchPage = new SearchPage(browser);
        searchPage.fillSearchField("iPhone");
        searchPage.sellectKategory("Phones & PDAs");
        searchPage.selectSearchInSubkategories();
        searchPage.selectSearchInDescription();

        searchPage.clickToSearchButton();

//        ContactUsPage contactUsPage = new ContactUsPage(browser);




//        RegisterPage registerPage = new RegisterPage(browser);


//        SearchPage searchPage = new SearchPage(driver);
//        searchPage.fillSearchField("iPhone");


//        browser.quit();


    }
}
