package step;

import core.BaseStep;
import org.openqa.selenium.WebDriver;
import page.ProductReturnsPage;
import page.SuccessPage;

public class ProductReturnsStep extends BaseStep<ProductReturnsPage> {

    public ProductReturnsStep(WebDriver driver) {
        super(driver, new ProductReturnsPage(driver));
    }

    public String fillValidData(String userFirstName, String userLastName,
                                String userEmail, String userTelephone,
                                String userOrderId, String userOrderDate,
                                String userProductName, String userProductCode,
                                String userQuantity, String userFaultyOrOtherDetails) {
        page.fillFirstName(userFirstName);
        page.fillLastName(userLastName);
        page.fillEmail(userEmail);
        page.fillTelephone(userTelephone);
        page.fillOrderId(userOrderId);
        page.fillOrderDate(userOrderDate);
        page.fillProductName(userProductName);
        page.fillProductCode(userProductCode);
        page.fillQuantity(userQuantity);
        page.chooseRadioButtonDeadOnArrival();
        page.fillFaultyOrOtherDetails(userFaultyOrOtherDetails);
        page.clickOnSubmitButton();
        return new SuccessPage(driver).getThankYouSuccessMessage();
    }

    public ProductReturnsStep fillWithInValidData(String userFirstName, String userLastName,
                                                  String userEmail, String userTelephone,
                                                  String userOrderId, String userOrderDate,
                                                  String userProductName, String userProductCode,
                                                  String userQuantity, String userFaultyOrOtherDetails) {
        page.fillFirstName(userFirstName);
        page.fillLastName(userLastName);
        page.fillEmail(userEmail);
        page.fillTelephone(userTelephone);
        page.fillOrderId(userOrderId);
        page.fillOrderDate(userOrderDate);
        page.fillProductName(userProductName);
        page.fillProductCode(userProductCode);
        page.fillQuantity(userQuantity);
        page.chooseRadioButtonDeadOnArrival();
        page.fillFaultyOrOtherDetails(userFaultyOrOtherDetails);
        page.clickOnSubmitButton();
        return this;
    }
}