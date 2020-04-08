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

    @FindBy(xpath = "//a[@class='btn btn-info']")
    private WebElement editButton;

    @FindBy(xpath = "//*[contains(text(), 'Delete')]")
    private WebElement deleteButton;

    @FindBy(className = "alert-warning")
    private WebElement warningMessage;

    @FindBy(xpath = "//div[@class = 'alert alert-success']")
    private WebElement successfullyUpdatedMessage;


    public AddressBookPage(WebDriver driver) {
        super(driver);
    }


    public void clickOnBackButton (){
        backButton.click();
    }

    public void clickOnNewAddressButton (){
        newAddressButton.click();
    }

    public void  clickOnEditButton(){
        editButton.click();
    }

    public  void clickOnDeleteButton(){
        deleteButton.click();
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

     private boolean isSuccessfullyUpdatedMessageDisplay (){
        return successfullyUpdatedMessage.isDisplayed();
     }

     public String getContentSuccessfullyUpdatedMessage (){
        if(isSuccessfullyUpdatedMessageDisplay()){
            return successfullyUpdatedMessage.getText();
        }
         System.out.println("111111");
        return null;
     }

//     public String onAddressBook(){
//        return entriesMessage.getText();
//     }

}
