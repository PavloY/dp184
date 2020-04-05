package test.ftcTest.FTS_Registration;

import data.User;

import java.util.HashMap;

public final class Constants {
    public static final String EMPTY_STRING = "";

    protected  static final User VALID_USER_ALL_FIELDS = new User("Boris", "Borisov", "Borisov@gmail.com", "380506526595",
            "8-812-1234567", "SoftServe", "Kyev", "Peremohy Avenue, 32", "Kyiv",
            "0411687541", "Ukraine", "Kyiv", "12345", "12345",
            true, true, true);

    protected static final User VALID_USER_ONLY_NECESSARY_FIELDS = new User("Boris", "Borisov", "Borisov@gmail.com", "379055625489", "Minsk", "Minsk", "Belarus", "Minskaya",
            "QWERTY", "QWERTY", true, true);

    protected static final User INVALID_USER_DATA_1 = new User(EMPTY_STRING, "A", ".test@gmail.com",
            "12355685947", "LA", "LA", "12345678998", "United Kingdom",
            EMPTY_STRING, "123", "123", true, true);



    protected static final User INVALID_USER_DATA_2 = new User("A", EMPTY_STRING, "test@com.ua",
            "one Two three", "FWD", "W", "12", " --- Please Select --- ",
            EMPTY_STRING, "asdf", "asd", false, true);

    protected static final User INVALID_USER_DATA_3 = new User("Loremipsumdolorsitametconsectetu",
            "ALoremipsumdolorsitametconsectetu", "test..a@gmail.com",
            "12355659",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod" +
            " tempor incididunt ut labore et dolore magna aliqua. Ut e",
            "ALorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore" +
                    " et dolore magna aliqua. Ut e",
            "1", "United Kingdom", "Bristol", "qwertyuioplkjhgfdsaz",
            "Aqwertyuioplkjhgfdsaz", true, true);

    protected static final User INVALID_USER_DATA_4 = new User("ALoremipsumdolorsitametconsectetu",
            "Loremipsumdolorsitametconsectetu", "opencard@mailforspam.com",
            "441239875462",
            "ALorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut " +
                    "labore et dolore magna aliqua. Ut e",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore" +
                    " et dolore magna aliqua. Ut e",
            "568o54", Constants.EMPTY_STRING, "Angus", "Aqwertyuioplkjhgfdsaz",
            "Aqwertyuioplkjhgfdsaz", true, false);

    protected static final HashMap<String, String> INVALID_RESULT_1 = new HashMap<String, String>(){{
        put("fName", "First Name must be between 1 and 32 characters!");
        put("email", "E-Mail Address does not appear to be valid!");
        put("address1", "Address 1 must be between 3 and 128 characters!");
        put("postCode", "Postcode must be between 2 and 10 characters!");
        put("region", "Please select a region / state!");
        put("password", "Password must be between 4 and 20 characters!");
    }};

    protected static final HashMap<String, String> INVALID_RESULT_2 = new HashMap<String, String>(){{
        put("warning", "Warning: You must agree to the Privacy Policy!");
        put("lName", "Last Name must be between 1 and 32 characters!");
        put("telephone", "Telephone does not appear to be valid!");
        put("city", "City must be between 2 and 128 characters!");
        put("country", "Please select a country!");
        put("confirmPass", "Password confirmation does not match password!");
    }};

    protected static final HashMap<String, String> INVALID_RESULT_3 = new HashMap<String, String>(){{
        put("lName", "Last Name must be between 1 and 32 characters!");
        put("email", "E-Mail Address does not appear to be valid!");
        put("city", "City must be between 2 and 128 characters!");
        put("postCode", "Postcode must be between 2 and 10 characters!");
        put("confirmPass", "Password confirmation does not match password!");
    }};

    protected static final HashMap<String, String> INVALID_RESULT_4 = new HashMap<String, String>(){{
        put("warning", "Warning: E-Mail Address is already registered!");
        put("fName", "First Name must be between 1 and 32 characters!");
        put("address1", "Address 1 must be between 3 and 128 characters!");
        put("postCode", "Postcode must be between 2 and 10 characters and contains only digits");
        put("password", "Password must be between 4 and 20 characters!");
    }};
}
