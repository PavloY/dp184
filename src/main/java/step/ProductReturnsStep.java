package step;

import core.BaseStep;
import data.ReturnsUser;
import org.openqa.selenium.WebDriver;
import page.ProductReturnsPage;
import page.SuccessPage;

public class ProductReturnsStep extends BaseStep<ProductReturnsPage> {

    public ProductReturnsStep(WebDriver driver) {
        super(driver, new ProductReturnsPage(driver));
    }

    public String fillValidData(ReturnsUser returnsUser) {
        page.fillFirstName(returnsUser.getFirstName());
        page.fillLastName(returnsUser.getLastName());
        page.fillEmail(returnsUser.getEmail());
        page.fillTelephone(returnsUser.getTelephone());
        page.fillOrderId(returnsUser.getOrderId());
        page.fillOrderDate(returnsUser.getOrderDate());
        page.fillProductName(returnsUser.getProductName());
        page.fillProductCode(returnsUser.getProductCode());
        page.fillQuantity(returnsUser.getQuantity());
        page.chooseRadioButtonDeadOnArrival();
        page.fillFaultyOrOtherDetails(returnsUser.getFaultyOrOtherDetails());
        page.clickOnSubmitButton();
        return new SuccessPage(driver).getThankYouSuccessMessage();
    }

    public ProductReturnsStep fillWithInValidData(ReturnsUser returnsUser) {
        page.fillFirstName(returnsUser.getFirstName());
        page.fillLastName(returnsUser.getLastName());
        page.fillEmail(returnsUser.getEmail());
        page.fillTelephone(returnsUser.getTelephone());
        page.fillOrderId(returnsUser.getOrderId());
        page.fillOrderDate(returnsUser.getOrderDate());
        page.fillProductName(returnsUser.getProductName());
        page.fillProductCode(returnsUser.getProductCode());
        page.fillQuantity(returnsUser.getQuantity());
        page.chooseRadioButtonDeadOnArrival();
        page.fillFaultyOrOtherDetails(returnsUser.getFaultyOrOtherDetails());
        page.clickOnSubmitButton();
        return this;
    }
}