package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import page.*;

public abstract class BasePage extends BaseElement {

    @FindBy(className = "dropdown-toggle")
    private WebElement currency;
    @FindBy(xpath = "//button[text()='€ Euro']")
    private WebElement euro;
    @FindBy(xpath = "//button[text()='$ US Dollar']")
    private WebElement dollar;
    @FindBy(xpath = "//button[text()='£ Pound Sterling']")
    private WebElement sterling;

    @FindBy(className = "dropdown")
    protected WebElement myAccount;

    @FindBy(linkText = "Logout")
    protected WebElement logoutDropDown;

    @FindBy(xpath = "//*[@id=\"logo\"]/a/img")
    protected WebElement homeRedirect;

    @FindBy(xpath = "//a[contains(text(), 'Contact Us')]")
    private WebElement contactUs;

    @FindBy(xpath = "//a[contains(text(), 'Brands')]")
    private WebElement brands;

    @FindBy(name = "search")
    private WebElement quickSearchField;

    @FindBy(className = "input-group-btn")
    private WebElement searchButton;

    @FindBy(id = "wishlist-total")
    private WebElement wishList;

    @FindBy(xpath = "//a[@title = 'Shopping Cart']")
    private WebElement shoppingCart;

    @FindBy(xpath = "//a[contains(text(), 'product comparison')]")
    private WebElement productComparison;

    @FindBy(xpath = "//a[@href='http://184-dp.tk/index.php?route=account/return/add']")
    private WebElement returnsButton;

    @FindBy(xpath = "//a[@href='http://184-dp.tk/index.php?route=account/newsletter']")
    private WebElement newsletterButton;

    @FindBy(xpath = "//a[@href='http://184-dp.tk/index.php?route=affiliate/account']")
    private WebElement affiliateButton;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getEuro() {
        return euro;
    }

    public WebElement getDollar() {
        return dollar;
    }

    public WebElement getSterling() {
        return sterling;
    }

    public void clickAffiliateButton() {
        affiliateButton.click();
    }

    public void clickReturnsButton() {
        returnsButton.click();
    }

    public void clickNewsletterButton() {
        newsletterButton.click();
    }

    public void chooseCurrency() {
        currency.click();
    }

    public RegisterPage goToRegisterPage() {
        myAccount.click();
        driver.findElement(By.linkText("Register")).click();
        return new RegisterPage(driver);
    }

    public HomePage goToHomePage() {
        homeRedirect.click();
        return new HomePage(driver);
    }

    public void goToContactUsPage() {
        contactUs.click();
    }

    public void goToBrandsPage() {
        brands.click();
    }

    public BasePage fillQuickSearchField(String desireItem) {
        fillField(quickSearchField, desireItem);
        return this;
    }

    public void quickSearch() {
        searchButton.click();
    }

    public ShoppingCartPage goToShoppingCartPage() {
        shoppingCart.click();
        return new ShoppingCartPage(driver);
    }

    public LoginPage goToWishList() {
        wishList.click();
        return new LoginPage(driver);
    }

    public ProductComparisonPage goToProductComparison() {
        productComparison.click();
        return new ProductComparisonPage(driver);
    }

    public WebElement getProductComparisonLink(){
        return productComparison;
    }

    public LogoutPage goToLogoutPage() {
        logoutDropDown.click();
        return new LogoutPage(driver);
    }
}
