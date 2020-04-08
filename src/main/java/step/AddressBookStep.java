package step;

import core.BasePage;
import core.BaseStep;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import page.AddressBookPage;

public class AddressBookStep extends BaseStep<AddressBookPage> {
    public AddressBookStep(WebDriver driver) {
        super(driver, new AddressBookPage(driver));
    }

    public MyAccountStep clickOnBackButton(){
        page.clickOnBackButton();
        String expected = "My Account";
        String actual = driver.getTitle();
        Assert.assertEquals(expected, actual);
        return new MyAccountStep(driver);
    }

    public EditAddressStep clickOnNewAddressButton(){
        page.clickOnNewAddressButton();
        Assert.assertFalse(driver.findElement(By.id("input-firstname")).getAttribute("value").isEmpty());
        return new EditAddressStep(driver);
    }

    public EditAddressStep clickOnEditButton(){
        page.clickOnEditButton();
        System.out.println(driver.findElement(By.id("input-firstname")).getAttribute("value"));
        Assert.assertTrue(!driver.findElement(By.id("input-firstname")).getAttribute("value").isEmpty());
        System.out.println("11111");
        return new EditAddressStep(driver);
    }

    public AddressBookStep clickOnDeleteButton(){
        page.clickOnDeleteButton();
        String expected = "Warning: You can not delete your default address!";
        String actual = page.getContentWarningMessage();
        Assert.assertEquals(expected, actual);
        return this;
    }

    public String getSuccessfullyUpdatedMessage(){
        return page.getContentSuccessfullyUpdatedMessage();
    }
}
