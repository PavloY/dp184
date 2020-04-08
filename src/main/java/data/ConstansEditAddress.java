package data;

import java.util.HashMap;

public final class ConstansEditAddress {
    public static final String EMPTY_STRING = "";

    public static final EditAddressUser VALID_EDITADDRESSUSER_ALL_FIELDS = new EditAddressUser("Nataliia",
            "Kriuchkova", "Year", "78 McCullough Dr.", "UA20140",
            "New Castle", "19726", "United States", "Delaware", true);

    public static final EditAddressUser VALID_EDITADDRESSUSER_DATA = new EditAddressUser("Nataliia",
            "Kriuchkova", "78 McCullough Dr.", "New Castle", "United States",
            "Delaware", true);

    public static final EditAddressUser INVALID_1_EDITADDRESSUSER_DATA = new EditAddressUser(EMPTY_STRING,
            "K", "MD", "NC", "789456123789","United States",
            EMPTY_STRING, true);

    public static final EditAddressUser INVALID_2_EDITADDRESSUSER_DATA = new EditAddressUser("N",
            EMPTY_STRING, "ABC", "A", "7"," --- Please Select --- ",
            EMPTY_STRING, true);

    public static final EditAddressUser INVALID_3_EDITADDRESSUSER_DATA= new EditAddressUser("Loremipsumdolorsitametconsectetu",
            "ALoremipsumdolorsitametconsectetu", "Lorem ipsum dolor sit amet, consectetuer adipiscing " +
            "elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque pen",
            "ALorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. "+
            "Aenean massa. Cum sociis natoque pen", "1",
            "United States", "Delaware", true);

    public static final EditAddressUser INVALID_4_EDITADDRESSUSER_DATA= new EditAddressUser("ALoremipsumdolorsitametconsectetu",
            "Loremipsumdolorsitametconsectetu", "ALorem ipsum dolor sit amet, " +
            "consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque pen",
            "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. "+
                    "Aenean massa. Cum sociis natoque pen", "148n78", EMPTY_STRING, "Delaware",
            true);

    public static final HashMap<String, String> INVALID_RESULT_1 = new HashMap<String, String>(){{
        put("fName", "First Name must be between 1 and 32 characters!");
        put("address1", "Address must be between 3 and 128 characters!");
        put("region", "Please select a region / state!");

    }};

    public static final HashMap<String, String> INVALID_RESULT_2 = new HashMap<String, String>(){{
        put("lName", "Last Name must be between 1 and 32 characters!");
        put("city", "City must be between 2 and 128 characters!");
        put("country", "Please select a country!");
    }};

    public static final HashMap<String, String> INVALID_RESULT_3 = new HashMap<String, String>(){{
        put("lName", "Last Name must be between 1 and 32 characters!");
        put("city", "City must be between 2 and 128 characters!");
    }};

    public static final HashMap<String, String> INVALID_RESULT_4 = new HashMap<String, String>(){{
        put("fName", "First Name must be between 1 and 32 characters!");
        put("address1", "Address must be between 3 and 128 characters!");
    }};


}
