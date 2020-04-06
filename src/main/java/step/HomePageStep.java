package step;

import core.BaseStep;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import page.ContactUsPage;
import page.HomePage;
import page.LoginPage;

public class HomePageStep extends BaseStep<HomePage> {
  public HomePageStep(WebDriver driver) {
    super(driver, new HomePage(driver));
  }

  public HomePageStep clickMyAccount(){
    page.clickMyAccount();
    return this;
  }

  public LoginPage clickloginDropDown(){
    page.clickloginDropDown();
    return new LoginPage(driver);
  }

  public ContactUsStep clickContactUs(){
    page.goToContactUsPage();
    return new ContactUsStep(driver);
  }

  public BrandsStep clickBrands(){
    page.goToBrandsPage();
    return new BrandsStep(driver);
  }

  public ProductStep clickOnProduct(String nameOfProduct) {
    page.getNameProductsList();
    page.clickOnNameOfProduct(nameOfProduct);
    String expected = "iPhone";
    String actual = page.getTitlePage();
    Assert.assertEquals(expected, actual);
    return new ProductStep(driver);
    }

    public RegisterStep goToRegisterPage(){
      page.goToRegisterPage();
      return new RegisterStep(driver);
    }
}