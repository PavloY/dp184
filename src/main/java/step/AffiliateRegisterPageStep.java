package step;

import core.BaseStep;
import org.openqa.selenium.WebDriver;
import page.AffiliateRegisterPage;
import page.SuccessPage;

public class AffiliateRegisterPageStep extends BaseStep<AffiliateRegisterPage> {

    public AffiliateRegisterPageStep(WebDriver driver) {
        super(driver, new AffiliateRegisterPage(driver));
    }

    public String fillValidData(String userFirstName, String userLastName,
                                String userEmail, String userTelephone,
                                String userAddress1, String userCity,
                                String userPostCode, String userPassword,
                                String userPasswordConfirm) {
        page.fillFirstName(userFirstName);
        page.fillLastName(userLastName);
        page.fillEmail(userEmail);
        page.fillTelephone(userTelephone);
        page.fillAddress1(userAddress1);
        page.fillCity(userCity);
        page.fillPostcode(userPostCode);
        page.fillPassword(userPassword);
        page.fillPasswordConfirm(userPasswordConfirm);
        page.chooseRegionStirling();
        page.chooseAgree();
        page.buttonContinueClick();
        return new SuccessPage(driver).getCongratulationsMessage();
    }

    public AffiliateRegisterPageStep fillInvalidData(String userFirstName, String userLastName,
                                                     String userEmail, String userTelephone,
                                                     String userAddress1, String userCity,
                                                     String userPostCode, String userPassword,
                                                     String userPasswordConfirm) {
        page.fillFirstName(userFirstName);
        page.fillLastName(userLastName);
        page.fillEmail(userEmail);
        page.fillTelephone(userTelephone);
        page.fillAddress1(userAddress1);
        page.fillCity(userCity);
        page.fillPostcode(userPostCode);
        page.fillPassword(userPassword);
        page.fillPasswordConfirm(userPasswordConfirm);
        page.chooseRegionStirling();
        page.chooseAgree();
        page.buttonContinueClick();
        return this;
    }
}