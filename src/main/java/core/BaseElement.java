package core;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public abstract class BaseElement {
    protected WebDriver driver;

    public void fillField(WebElement webElement, String userData){
        webElement.clear();
        webElement.sendKeys(userData);
    }

    public void chooseDataFromDropDownMenu(WebElement webElement, String userData){
        webElement.click();
        driver.findElement(By.xpath("//option[text()='" + userData + "']")).click();
    }

    public BaseElement checkRadioButtonByName(String className, int numberOfRadioButton){
        driver.findElement(By.xpath("//*[@class='"+ className +"']//label[" + numberOfRadioButton + "]/input")).click();
        return this;
    }

    public BaseElement chooseCheckBox(WebElement webElement){
        if(!webElement.isSelected()) webElement.click();
        return this;
    }

    public BaseElement chooseUncheckBox(WebElement webElement){
        if(webElement.isSelected()) webElement.click();
        return this;
    }

    private boolean isWarningMessageDisplay(WebElement webElement){
        return webElement.isDisplayed();
    }

    public String getWarningMessage(WebElement webElement){
        try{
            return webElement.getText();
        }catch (NoSuchElementException e){
            return null;
        }
    }



    public String getTextContent(WebElement webElement){
        return webElement.getText();
    }

    public String getTitlePage(){
        return driver.getTitle();
    }



    //is Element avileable


}
