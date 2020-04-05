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
        fillAllNecessaryFields(user);
        page.fillFax(user.getFax());
        page.fillCompany(user.getCompany());
        page.fillAddress2(user.getAddress2());
        page.fillPostCode(user.getPostCode());
        if(user.isSubscribe()){
            page.subscribe();
        }
        String unexpected = driver.getTitle();
        page.clickOnButtonContinue();
        String actual = driver.getTitle();
        Assert.assertNotEquals(unexpected, actual);
        return new SuccessStep(driver);
    }

    public SuccessStep fillOnlyNecessaryFieldWithValidData(User user){
        fillAllNecessaryFields(user);
        String unexpected = driver.getTitle();
        page.clickOnButtonContinue();
        String actual = driver.getTitle();
        Assert.assertNotEquals(unexpected, actual);
        return new SuccessStep(driver);
    }


    public HashMap<String, String> fillOnlyNecessaryFieldWithInvalidData(User user){
        fillAllNecessaryFields(user);
        page.fillPostCode(user.getPostCode());
        String expected = driver.getTitle();
        page.clickOnButtonContinue();
        String actual = driver.getTitle();
        Assert.assertEquals(expected, actual);
        return page.getAllWarningMessages();
    }

    private void fillAllNecessaryFields(User user){
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
    }


}
