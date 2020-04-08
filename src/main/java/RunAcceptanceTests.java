import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import test.*;
import test.ftcTest.*;
import test.ftcTest.FTC_ProductComparison.FTC_Auto_Main_ProductComparison_AddProductFromProductComparisonToShoppingCart;
import test.ftcTest.FTC_ProductComparison.FTC_Auto_Main_ProductComparison_DeleteProductFromProductComparison;
import test.ftcTest.FTS_Cart.FTC_Auto_Main_Cart_CheckPossibilityOfDeletingProductFromCartNewUser;
import test.ftcTest.FTS_Cart.FTC_Auto_Main_Cart_CheckPossibilityOfDeletingProductFromCartRegisteredUser;
import test.ftcTest.FTS_Checkout.FTC_Auto_Main_Checkout_CheckoutRegisteredUser;
import test.ftcTest.FTS_Product.*;
import test.ftcTest.FTS_Comments.FTC_Main_Auto_Comment_CheckTheAbilityToWriteAComment;
import test.ftcTest.FTS_Comments.FTC_Main_Auto_Comment_ValidationNameFieldWithInvalidData;
import test.ftcTest.FTS_Comments.FTC_Main_Auto_Comment_ValidationRatingFieldWithInvalidData;
import test.ftcTest.FTS_Comments.FTC_Main_Auto_Comment_ValidationReviewFieldWithInvalidData;
import test.ftcTest.FTS_ContactUs.FTC_ContactUs_SendMessageWithInvalidData;
import test.ftcTest.FTS_ContactUs.FTC_ContactUs_SendingMessageThroughContactUsTab;
import test.ftcTest.FTS_Registration.FTC_Auto_Main_Registration_RegisterUserWithInvalidDataUsingOnlyNecessaryFields;
import test.ftcTest.FTS_Registration.FTC_Auto_Main_Registration_RegisterUserWithValidDataUsingAllFields;
import test.ftcTest.FTS_Registration.FTC_Auto_Main_Registration_RegisterUserWithValidDataUsingOnlyNecessaryFields;
import test.ftcTest.FTS_WishList.FTC_Auto_Main_WishList_AddProductFromWishListToShoppingCart;
import test.ftcTest.FTS_WishList.FTC_Auto_Main_WishList_DeleteProductFromWishList;

@RunWith(Categories.class)
@Suite.SuiteClasses({
        FTC_Auto_Main_Checkout_CheckoutRegisteredUser.class,
        FTC_Auto_Main_Registration_RegisterUserWithInvalidDataUsingOnlyNecessaryFields.class,
        FTC_Auto_Main_Registration_RegisterUserWithValidDataUsingAllFields.class,
        FTC_Auto_Main_Registration_RegisterUserWithValidDataUsingOnlyNecessaryFields.class,
        FTC__Auto_Main_AffiliateLogin_AffiliateLoginWithInvalidData.class,
        FTC__Auto_Main_AffiliateLogin_AffiliateLoginWithValidData.class,
        FTC__Auto_Main_AffiliateRegister_AffiliateRegisterWithInvalidData.class,
        FTC__Auto_Main_AffiliateRegister_AffiliateRegisterWithValidData.class,
        FTC__Auto_Main_Currency_ThePriceConvertation.class,
        FTC__Auto_Main_Logo_LogoRedirectingLink.class,
        FTC__Auto_Main_NewsletterSubscription_UpdateTheSubscriptionStatus.class,
        FTC__Auto_Main_ProductReturns_ReturnTheProductUsingInvalidData.class,
        FTC__Auto_Main_ProductReturns_ReturnTheProductUsingValidData.class,
        FTC__Auto_Main_Share_SharingTheProduct.class,
        FTC_Auto_Main_Product_AddProductToShoppingCartByNewUser.class,
        FTC_Auto_Main_Product_AddProductToShoppingCartByRegisteredUser.class,
        FTC_Auto_Main_Product_AddProductToProductComparisonByNewUser.class,
        FTC_Auto_Main_Product_AddProductToProductComparisonByRegisteredUser.class,
        FTC_Auto_Main_Product_AddProductToWishListByRegisteredUser.class,
        FTC_Auto_Main_WishList_AddProductFromWishListToShoppingCart.class,
        FTC_Auto_Main_WishList_DeleteProductFromWishList.class,
        FTC_Auto_Main_Cart_CheckPossibilityOfDeletingProductFromCartNewUser.class,
        FTC_Auto_Main_Cart_CheckPossibilityOfDeletingProductFromCartRegisteredUser.class,
        FTC_Auto_Main_ProductComparison_AddProductFromProductComparisonToShoppingCart.class,
        FTC_Auto_Main_ProductComparison_DeleteProductFromProductComparison.class,
        FTC_ContactUs_SendingMessageThroughContactUsTab.class,
        FTC_ContactUs_SendMessageWithInvalidData.class,
        FTC_Main_Auto_Comment_CheckTheAbilityToWriteAComment.class,
        FTC_Main_Auto_Comment_ValidationNameFieldWithInvalidData.class,
        FTC_Main_Auto_Comment_ValidationRatingFieldWithInvalidData.class,
        FTC_Main_Auto_Comment_ValidationReviewFieldWithInvalidData.class,
        FTC_Main_Brand_BrandLinkVerification.class,
        FTC_Main_EditAddressWithValidData.class,
        FTC_Main_Login_SignInRegisteredUserWithInvalidData.class,
        FTC_Main_Registration_RegisterUserWithValidData.class,
        SearchStepTest.class})
public class RunAcceptanceTests {
}
