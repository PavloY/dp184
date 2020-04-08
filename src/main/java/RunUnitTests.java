import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import test.unitTest.*;

@RunWith(Categories.class)
@Suite.SuiteClasses({
        AddressBookPageTest.class,
        AffiliateLoginPageTest.class,
        AffiliateRegisterPageTest.class,
        NewsletterSubscriptionPageTest.class,
        ProductComparisonPageTest.class,
        ProductPageTest.class,
        ProductReturnsPageTest.class,
        WishListPageTest.class})
public class RunUnitTests {
}
