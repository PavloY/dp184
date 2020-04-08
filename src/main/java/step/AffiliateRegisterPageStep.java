package step;

import core.BaseStep;
import data.AffiliateRegisterUser;
import org.openqa.selenium.WebDriver;
import page.AffiliateRegisterPage;
import page.SuccessPage;

public class AffiliateRegisterPageStep extends BaseStep<AffiliateRegisterPage> {

    public AffiliateRegisterPageStep(WebDriver driver) {
        super(driver, new AffiliateRegisterPage(driver));
    }

    public String fillValidData(AffiliateRegisterUser affiliateRegisterUser) {
        page.fillFirstName(affiliateRegisterUser.getFirstName());
        page.fillLastName(affiliateRegisterUser.getLastName());
        page.fillEmail(affiliateRegisterUser.getEmail());
        page.fillTelephone(affiliateRegisterUser.getTelephone());
        page.fillAddress1(affiliateRegisterUser.getAddress1());
        page.fillCity(affiliateRegisterUser.getCity());
        page.fillPostcode(affiliateRegisterUser.getPostCode());
        page.fillPassword(affiliateRegisterUser.getPassword());
        page.fillPasswordConfirm(affiliateRegisterUser.getPasswordConfirm());
        page.chooseRegionStirling();
        page.chooseAgree();
        page.buttonContinueClick();
        return new SuccessPage(driver).getCongratulationsMessage();
    }

    public AffiliateRegisterPageStep fillInvalidData(AffiliateRegisterUser affiliateRegisterUser) {
        page.fillFirstName(affiliateRegisterUser.getFirstName());
        page.fillLastName(affiliateRegisterUser.getLastName());
        page.fillEmail(affiliateRegisterUser.getEmail());
        page.fillTelephone(affiliateRegisterUser.getTelephone());
        page.fillAddress1(affiliateRegisterUser.getAddress1());
        page.fillCity(affiliateRegisterUser.getCity());
        page.fillPostcode(affiliateRegisterUser.getPostCode());
        page.fillPassword(affiliateRegisterUser.getPassword());
        page.fillPasswordConfirm(affiliateRegisterUser.getPasswordConfirm());
        page.chooseRegionStirling();
        page.chooseAgree();
        page.buttonContinueClick();
        return this;
    }
}