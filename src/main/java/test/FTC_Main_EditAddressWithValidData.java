package test;

import core.BaseTest;
import data.EditAddressUser;
import org.junit.Test;
import page.HomePage;
import step.HomePageStep;

public class FTC_Main_EditAddressWithValidData extends BaseTest {
    HomePageStep homePageStep;
    EditAddressUser editAddressUser;

    @Test

    public void editAddressWithValidData (){
        homePageStep = new HomePageStep(driver);
        editAddressUser = new EditAddressUser("Nataliya", "Kryuchkova", "Year",
                "78 McCullough Dr.", "UA20143", "New Castle", "19726",
                "United States", "Delaware", true);
        homePageStep.clickMyAccount().clickloginDropDown();
        //login
  //      my
    }
}
