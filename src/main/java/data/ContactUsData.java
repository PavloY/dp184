package data;

public final class ContactUsData {

    public static final String VALID_NAME = "Alexander";
    public static final String VALID_E_MAIL = "alexvonbor@gmail.com";
    public static final String VALID_ENQUIRY = "Hello World from automation testers ";
    public static final String REG_E_MAIL = "opencard@mailforspam.com";
    public static final String REG_PASSWORD = "Qwerty";
    public static final String LINK_IPHONE = "http://184-dp.tk/index.php?route=product/product&product_id=40";

    public static final ContactUsUser contactUsUserWithValidData = new ContactUsUser("Alex","alex@mail.com","Hello World !!!!!!!!!!!!!");
    public static final ContactUsUser contactUsUserWithInValidData = new ContactUsUser("","","");

}
