package step;

import core.BaseStep;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import page.ProductReturnsPage;

public class ProductReturnsStep extends BaseStep<ProductReturnsPage> {

    public ProductReturnsStep(WebDriver driver) {
        super(driver, new ProductReturnsPage(driver));
    }

    public ProductReturnsStep fillValidFirstName(String userFirstName) {
        page.fillFirstName(userFirstName);
        page.clickOnSubmitButton();
        String expected = null;
        String actual = page.getWarningMessage(page.getWarningForFirstName());
        Assert.assertEquals(expected, actual);
        return this;
    }

    

}
