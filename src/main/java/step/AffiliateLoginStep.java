package step;

import core.BaseStep;
import data.AffiliateLoginUser;
import org.openqa.selenium.WebDriver;
import page.AffiliateLoginPage;

public class AffiliateLoginStep extends BaseStep<AffiliateLoginPage> {

    public AffiliateLoginStep(WebDriver driver) {
        super(driver, new AffiliateLoginPage(driver));
    }

    public String fillAffiliateLoginValid(AffiliateLoginUser affiliateLoginUser) {
        page.fillAffiliateEmail(affiliateLoginUser.getEmail());
        page.fillAffiliatePassword(affiliateLoginUser.getPassword());
        page.clickOnButtonLogin();
        return new AffiliateLoginPage(driver).getSuccessMessage();
    }

    public String fillAffiliateLoginInvalid(AffiliateLoginUser affiliateLoginUser) {
        page.fillAffiliateEmail(affiliateLoginUser.getEmail());
        page.fillAffiliatePassword(affiliateLoginUser.getPassword());
        page.clickOnButtonLogin();
        return new AffiliateLoginPage(driver).getWarningMessage();
    }
}
