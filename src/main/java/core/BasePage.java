package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import page.*;

public abstract class BasePage extends BaseElement {

    @FindBy(className = "dropdown-toggle")
    protected WebElement currency;

    @FindBy(className = "dropdown")
    protected WebElement myAccount;

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

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
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

    public void goToSearchPage() {
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


}
