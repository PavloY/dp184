package step;

import core.BaseStep;
import data.User;
import page.RegisterPage;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import java.util.HashMap;

public class RegisterStep extends BaseStep<RegisterPage> {

    public RegisterStep(WebDriver driver) {
        super(driver, new RegisterPage(driver));
    }


    public SuccessStep fillAllFieldWithValidData(User user){
        page.fillFirstName(user.getFirstName());
        page.fillLastName(user.getLastName());
        page.fillEmail(user.getEmail());
        page.fillTelephone(user.getTelephone());
        page.fillFax(user.getFax());
        page.fillCompany(user.getCompany());
        page.fillAddress1(user.getAddress1());
        page.fillAddress2(user.getAddress2());
        page.fillCity(user.getCity());
        page.fillPostCode(user.getPostCode());
        page.chooseCountry(user.getCountry());
        page.chooseRegion(user.getRegion());
        page.fillPassword(user.getPassword());
        page.fillConfirmPassword(user.getConfirmPassword());
        if(user.isSubscribe()){
            page.subscribe();
        }
        if(user.isPolicy()){
            page.chooseCheckBox(page.getAgree());
        }
        String unexpected = driver.getTitle();
        page.clickOnButtonContinue();
        String actual = driver.getTitle();
        Assert.assertNotEquals(unexpected, actual);
        return new SuccessStep(driver);
    }

    public SuccessStep fillOnlyNecessaryFieldWithValidData(User user){
        page.fillFirstName(user.getFirstName());
        page.fillLastName(user.getLastName());
        page.fillEmail(user.getEmail());
        page.fillTelephone(user.getTelephone());
        page.fillAddress1(user.getAddress1());
        page.fillCity(user.getCity());
        page.chooseCountry(user.getCountry());
        page.chooseRegion(user.getRegion());
        page.fillPassword(user.getPassword());
        page.fillConfirmPassword(user.getConfirmPassword());
        if(user.isPolicy()){
            page.chooseCheckBox(page.getAgree());
        }
        String unexpected = driver.getTitle();
        page.clickOnButtonContinue();
        String actual = driver.getTitle();
        Assert.assertNotEquals(unexpected, actual);
        return new SuccessStep(driver);
    }


    public HashMap<String, String> fillOnlyNecessaryFieldWithInvalidData(User user){
        page.fillFirstName(user.getFirstName());
        page.fillLastName(user.getLastName());
        page.fillEmail(user.getEmail());
        page.fillTelephone(user.getTelephone());
        page.fillAddress1(user.getAddress1());
        page.fillCity(user.getCity());
        if(!user.getCountry().isEmpty()) page.chooseCountry(user.getCountry());
        if(!user.getRegion().isEmpty()) page.chooseRegion(user.getRegion());
        page.fillPassword(user.getPassword());
        page.fillConfirmPassword(user.getConfirmPassword());
        if(user.isPolicy()){
            page.chooseCheckBox(page.getAgree());
        }
        String expected = driver.getTitle();
        page.clickOnButtonContinue();
        String actual = driver.getTitle();
        Assert.assertEquals(expected, actual);
        return page.getAllWarningMessages();
    }


}
