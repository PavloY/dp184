package data;

public class ContactUsUser {

    private String name;
    private String email;
    private String enquiry;

    public ContactUsUser(String name, String email, String enquiry){
        this.name = name;
        this.email = email;
        this.enquiry = enquiry;
    }

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getEnquiry() {
        return enquiry;
    }
}
