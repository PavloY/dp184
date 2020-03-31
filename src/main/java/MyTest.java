import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import io.qameta.allure.Issue;
import io.qameta.allure.junit4.DisplayName;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import test.FTC_Main_Login_SignInRegisteredUserWithInvalidData;

@RunWith(Categories.class)
@Suite.SuiteClasses({FTC_Main_Login_SignInRegisteredUserWithInvalidData.class,
                      FTC_Main_Login_SignInRegisteredUserWithInvalidData.class})
public class MyTest {

}
