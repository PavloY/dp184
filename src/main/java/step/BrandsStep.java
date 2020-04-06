package step;

import core.BaseStep;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import page.BrandsPage;


public class BrandsStep extends BaseStep<BrandsPage> {


    public BrandsStep(WebDriver driver) {
        super(driver, new BrandsPage(driver));
    }


    public BaseStep goToTheSpecificBrandProductsPage(String brand){
        page.clickBrand(brand);
        //String expected = brand;
        //String actual = driver.getTitle();
        //Assert.assertEquals(expected,actual);
        return this;
    }

}
