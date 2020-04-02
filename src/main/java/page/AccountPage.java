package page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage {

    @FindBy(xpath = "//*[contains(text(), 'My Account')]")
    private WebElement myAccount;

    @FindBy(xpath = "//*[contains(text(), 'Edit Account')]")
    private WebElement editAccount;

    @FindBy(xpath = "//*[contains(text(), 'Password')]")
    private WebElement password;

    @FindBy(xpath = "//*[contains(text(), 'Address Book')]")
    private WebElement addressBook;

    @FindBy(xpath = "//*[contains(text(), 'Returns')]")
    private WebElement returns;

    @FindBy(xpath = "//*[contains(text(), 'Newsletter')]")
    private WebElement newsletter;

    @FindBy(xpath = "//*[contains(text(), 'Logout')]")
    private WebElement logout;


    public AccountPage(WebDriver driver) {
        super(driver);
    }

    public AccountPage clickOnAccountPageLink() {
        myAccount.click();
        return this;
    }

    public EditAddressPage clickOnEditAddressPageLink() {
        editAccount.click();
        return new EditAddressPage(driver);
    }

    public ChangePasswordPage clickOnChangePasswordPageLink() {
        password.click();
        return new ChangePasswordPage(driver);
    }

    public void clickOnAddressBookPageLink() {
        addressBook.click();
    }

    public ProductReturnsPage clickOnProductReturnsPageLink() {
        returns.click();
        return new ProductReturnsPage(driver);
    }

    public NewsletterSubscriptionPage clickOnNewsletterSubscriptionPageLink() {
        newsletter.click();
        return new NewsletterSubscriptionPage(driver);
    }

    public LogoutPage clickOnLogoutPageLink() {
        logout.click();
        return new LogoutPage(driver);
    }

}
