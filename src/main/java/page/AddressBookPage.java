package page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressBookPage extends BasePage {

    @FindBy(xpath = "//*[contains(text(), 'Back')]")
    private WebElement backButton;

    @FindBy(className = "btn-primary")
    private WebElement newAddressButton;

    @FindBy(className = "btn-info")
    private WebElement editButton;

    @FindBy(xpath = "//*[contains(text(), 'Delete')]")
    private WebElement deleteButton;

    @FindBy(className = "alert-warning")
    private WebElement warningMessage;


    public AddressBookPage(WebDriver driver) {
        super(driver);
    }


    public AccountPage clickOnBackButton (){
        backButton.click();
        return new AccountPage(driver);
    }

    public void clickOnNewAddressButton (){
        newAddressButton.click();
    }

    public EditAddressPage clickOnEditButton (){
        editButton.click();
        return new EditAddressPage(driver);
    }

    public  AddressBookPage clickOnDeleteButton (){
        deleteButton.click();
        return this;
    }

     private boolean isWarningMessageDisplay (){
        return warningMessage.isDisplayed();
     }

     public String getContentWarningMessage () {
        if(isWarningMessageDisplay()) {
            return warningMessage.getText();
        }
        return null;
     }


}
