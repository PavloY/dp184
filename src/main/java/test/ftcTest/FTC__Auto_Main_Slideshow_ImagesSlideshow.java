//package test.ftcTest;
//
//import core.BaseTest;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import page.HomePage;
//import page.ProductPage;
//
//import java.net.MalformedURLException;
//
//import static org.junit.Assert.assertEquals;
//
//public class FTC__Auto_Main_Slideshow_ImagesSlideshow extends BaseTest {
//
//    HomePage homePage;
//      img[@src[contains(.,'iphone 1')]]
//    //img[contains(@src,'iphone 1)]
//    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div[1]/ul[1]/li[1]/a/img")
//    private WebElement firstImageSrc;
//    //img[contains(@src,'iphone 6)]
//@FindBy(xpath = "//*[@id=\"content\"]/div[1]/div[1]/ul[1]/li[2]/a/img")
//    private WebElement secondImageSrc;
//
//    @Before
//    @Override
//    public void setUp() throws MalformedURLException {
//        super.setUp();
//        homePage = new HomePage(driver);
//        homePage.clickOnNumberOfProduct(1);
//    }
//
//    @After
//    @Override
//    public void tearDown() {
//        super.tearDown();
//        homePage = null;
//    }
//
//    @Test
//    public void productImagesSlideShow() {
////        Thread.sleep(5000);
//        WebElement explicitWait = (WebElement) new WebDriverWait(driver, 10);
//        double expected =
//        double actual =
//        assertEquals(expected, actual);
//    }
//}
