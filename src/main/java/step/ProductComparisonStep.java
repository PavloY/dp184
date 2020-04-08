package step;

import core.BaseStep;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import page.ProductComparisonPage;


public class ProductComparisonStep extends BaseStep<ProductComparisonPage> {

    public ProductComparisonStep(WebDriver driver) {
        super(driver, new ProductComparisonPage(driver));
    }

    public String getProductLink(){
        return page.getProductLink();
    }

    public CartStep addProductFromProductComparisonToCart(){
        page.addToCart();
        page.goToShoppingCartPage();
        return new CartStep(driver);
    }

    public ProductComparisonStep removeProductFromProductComparison() {
        page.removeFromProductComparisonPage();
        String expected = "You have not chosen any products to compare.";
        String actual = page.getMessageEmptyProductComparison();
        Assert.assertEquals(expected, actual);
        return this;
    }
}
