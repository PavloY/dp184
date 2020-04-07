package page;

import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;


public class HomePage extends BasePage {

    @FindBy(className = "dropdown")
    protected WebElement myAccountDropDown;

    @FindBy(linkText = "Login")
    protected WebElement loginDropDown;

    @FindBy(xpath = "//h4//a")
    private List<WebElement> productsOnShowCase;

    @FindBy(id = "slideshow0")
    private WebElement carouselItem;

    List<String> nameProductList = new ArrayList<>();
    List<String> linkProductList = new ArrayList<>();

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickMyAccount() {
        myAccountDropDown.click();
    }

    public void clickloginDropDown() {
        loginDropDown.click();
    }

    public List<String> getNameProductsList() {
        for (WebElement webElement : productsOnShowCase) {
            nameProductList.add(webElement.getText());
        }
        return nameProductList;
    }

    public List<String> getLinkProductsList() {
        for (WebElement webElement : productsOnShowCase) {
            linkProductList.add(webElement.findElement(By.tagName("a")).getAttribute("href"));
        }
        return linkProductList;
    }

    public void clickOnNumberOfProduct(int numberOfProduct) {
        productsOnShowCase.get(numberOfProduct).click();
    }

    public void clickOnNameOfProduct(String nameOfProduct) {
        int indexOfProduct = nameProductList.indexOf(nameOfProduct);
        productsOnShowCase.get(indexOfProduct).click();
    }

    public boolean isCarouselOnHomePage() {
        return carouselItem.isDisplayed();
    }

}

