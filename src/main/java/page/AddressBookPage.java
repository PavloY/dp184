package page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressBookPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[1]/a")
    private WebElement backButton;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/a")
    private WebElement newAddressButton;

    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/table/tbody/tr/td[2]/a[1]")
    private WebElement editButton;

    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/table/tbody/tr/td[2]/a[2]")
    private WebElement deleteButton;

    public AddressBookPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnBackButton (){
        backButton.click();//убрать когда появится AccountPage
    }
    /*public AccountPage clickOnBackButton (){
        backButton.click();
        return new AccountPage(driver);
    }*/
    public void clickOnNewAddressButton (){
        newAddressButton.click();//убрать когда появится NewAddressPage
    }
    /*public NewAddressPage clickOnNewAddressButton (){
        newAddressButton.click();
        return new NewAddressPage(driver);
    }*/

    public void clickOnEditButton (){
        editButton.click();//убрать когда появится EditAddressPage
    }
    /*public EditAddressPage clickOnEditButton (){
        editButton.click();
        return new EditAddressPage(driver);
    }*/

    public  AddressBookPage clickOnDeleteButton (){
        deleteButton.click();
        return this;
    }
    /*@FindBy(xpath = "//*[@id="column-right"]/div/a[4]")//добавить на страницу MyAccount
    protected  WebElement addressBook;
    */

    /*public AddressBookPage goAddressBookPage(){//добавить на страницу MyAccount
        addressBook.click();
        return new AddressBookPage(driver);
    }*/
}
