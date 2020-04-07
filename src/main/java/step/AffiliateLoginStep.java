package step;

import core.BaseStep;
import org.openqa.selenium.WebDriver;
import page.AffiliateLoginPage;

public class AffiliateLoginStep extends BaseStep<AffiliateLoginPage> {

    public AffiliateLoginStep(WebDriver driver) {
        super(driver, new AffiliateLoginPage(driver));
    }

    public String fillAffiliateLoginValid(String userAffiliateEmail, String userAffiliatePassword) {
        page.fillAffiliateEmail(userAffiliateEmail);
        page.fillAffiliatePassword(userAffiliatePassword);
        page.clickOnButtonLogin();
        return new AffiliateLoginPage(driver).getSuccessMessage();
    }

    public String fillAffiliateLoginInvalid(String userAffiliateEmail, String userAffiliatePassword) {
        page.fillAffiliateEmail(userAffiliateEmail);
        page.fillAffiliatePassword(userAffiliatePassword);
        page.clickOnButtonLogin();
        return new AffiliateLoginPage(driver).getWarningMessage();
    }
}
