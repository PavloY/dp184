package data;

import java.util.HashMap;

public final class Constants {

    public static final String EMPTY_STRING = "";

    public static final double EURO_TO_STERLING_COURSE = 0.7806663301362948;
    public static final double DOLLAR_TO_STERLING_COURSE = 0.6124752475247525;
    public static final double EURO_TO_DOLLAR_COURSE = 1.274608783442706;

    public static final User VALID_USER_ALL_FIELDS = new User("Boris", "Borisov", "Borisov@gmail.com", "380506526595",
            "8-812-1234567", "SoftServe", "Kyev", "Peremohy Avenue, 32", "Kyiv",
            "0411687541", "Ukraine", "Kyiv", "12345", "12345",
            true, true, true);

    public static final User VALID_USER_ONLY_NECESSARY_FIELDS = new User("Boris", "Borisov", "Borisov@gmail.com", "379055625489", "Minsk", "Minsk", "Belarus", "Minskaya",
            "QWERTY", "QWERTY", true, true);

    public static final User INVALID_USER_DATA_1 = new User(EMPTY_STRING, "A", ".test@gmail.com",
            "12355685947", "LA", "LA", "12345678998", "United Kingdom",
            EMPTY_STRING, "123", "123", true, true);


    public static final User INVALID_USER_DATA_2 = new User("A", EMPTY_STRING, "test@com.ua",
            "one Two three", "FWD", "W", "12", " --- Please Select --- ",
            EMPTY_STRING, "asdf", "asd", false, true);

    public static final User INVALID_USER_DATA_3 = new User("Loremipsumdolorsitametconsectetu",
            "ALoremipsumdolorsitametconsectetu", "test..a@gmail.com",
            "12355659",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod" +
                    " tempor incididunt ut labore et dolore magna aliqua. Ut e",
            "ALorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore" +
                    " et dolore magna aliqua. Ut e",
            "1", "United Kingdom", "Bristol", "qwertyuioplkjhgfdsaz",
            "Aqwertyuioplkjhgfdsaz", true, true);

    public static final User INVALID_USER_DATA_4 = new User("ALoremipsumdolorsitametconsectetu",
            "Loremipsumdolorsitametconsectetu", "opencard@mailforspam.com",
            "441239875462",
            "ALorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut " +
                    "labore et dolore magna aliqua. Ut e",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore" +
                    " et dolore magna aliqua. Ut e",
            "568o54", Constants.EMPTY_STRING, "Angus", "Aqwertyuioplkjhgfdsaz",
            "Aqwertyuioplkjhgfdsaz", true, false);

    public static final ReturnsUser RETURNS_USER_VALID_DATA = new ReturnsUser("Inokentiy", "Best", "someuser@example.com",
            "1111111111", "11111", "2020-02-01",
            "iphone", "product 11", "5",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit.");

    public static final ReturnsUser RETURNS_USER_INVALID_DATA_SHORT = new ReturnsUser(" ", " ", " ", " ", " ", " ", " ", " ", " ", " ");

    public static final ReturnsUser RETURNS_USER_INVALID_DATA_LONG = new ReturnsUser("333333333333333333333333333333333", "333333333333333333333333333333333", "example",
            "333333333333333333333333333333333", "$", "$",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. A diam sollicitudin tempor id eu nisl nunc. Ac tortor dignissim convallis aenean et tortor at risus viverra. Feugiat vivamus at augue",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed does",
            "$", "$");

    public static final AffiliateLoginUser AFFILIATE_LOGIN_USER_INVALID_DATA_1 = new AffiliateLoginUser(" ", " ");

    public static final AffiliateLoginUser AFFILIATE_LOGIN_USER_INVALID_DATA_2 = new AffiliateLoginUser("12#$234", "12#$234");

    public static final AffiliateLoginUser AFFILIATE_LOGIN_USER_INVALID_DATA_3 = new AffiliateLoginUser("opencard@mailforspam.com", "11111");

    public static final AffiliateLoginUser AFFILIATE_LOGIN_USER_INVALID_DATA_4 = new AffiliateLoginUser("opencard", "Qwerty");

    public static final AffiliateLoginUser AFFILIATE_LOGIN_USER_VALID_DATA = new AffiliateLoginUser(
            "opencard@mailforspam.com", "Qwerty");

    public static final AffiliateRegisterUser AFFILIATE_REGISTER_USER_VALID_DATA = new AffiliateRegisterUser(
            "Inokentiy", "Best", "someuser@example.com",
            "1111111111", "SomeAddress", "SomeCity",
            "10000", "11111", "11111", true);

    public static final AffiliateRegisterUser AFFILIATE_REGISTER_USER_INVALID_DATA_1 = new AffiliateRegisterUser(
            " ", " ", " ",
            " ", " ", " ",
            " ", " ", " ", true);

    public static final AffiliateRegisterUser AFFILIATE_REGISTER_USER_INVALID_DATA_2 = new AffiliateRegisterUser(
            "Lorem ipsum dolor sit amet, conse", "Lorem ipsum dolor sit amet, conse", "someuserexample.com",
            "Lorem ipsum dolor sit amet, conse", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut en", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut en",
            "Lorem ipsum d", "Lorem ipsum dolor sit", "Lorem ipsum dolor sit", true);

    public static final HashMap<String, String> INVALID_RESULT_1 = new HashMap<String, String>() {{
        put("fName", "First Name must be between 1 and 32 characters!");
        put("email", "E-Mail Address does not appear to be valid!");
        put("address1", "Address 1 must be between 3 and 128 characters!");
        put("postCode", "Postcode must be between 2 and 10 characters!");
        put("region", "Please select a region / state!");
        put("password", "Password must be between 4 and 20 characters!");
    }};

    public static final HashMap<String, String> INVALID_RESULT_2 = new HashMap<String, String>() {{
        put("warning", "Warning: You must agree to the Privacy Policy!");
        put("lName", "Last Name must be between 1 and 32 characters!");
        put("telephone", "Telephone does not appear to be valid!");
        put("city", "City must be between 2 and 128 characters!");
        put("country", "Please select a country!");
        put("confirmPass", "Password confirmation does not match password!");
    }};

    public static final HashMap<String, String> INVALID_RESULT_3 = new HashMap<String, String>() {{
        put("lName", "Last Name must be between 1 and 32 characters!");
        put("email", "E-Mail Address does not appear to be valid!");
        put("city", "City must be between 2 and 128 characters!");
        put("postCode", "Postcode must be between 2 and 10 characters!");
        put("confirmPass", "Password confirmation does not match password!");
    }};

    public static final HashMap<String, String> INVALID_RESULT_4 = new HashMap<String, String>() {{
        put("warning", "Warning: E-Mail Address is already registered!");
        put("fName", "First Name must be between 1 and 32 characters!");
        put("address1", "Address 1 must be between 3 and 128 characters!");
        put("postCode", "Postcode must be between 2 and 10 characters and contains only digits");
        put("password", "Password must be between 4 and 20 characters!");
    }};
}