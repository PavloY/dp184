package data;

public class AffiliateRegisterUser {

    private String firstName;
    private String lastName;
    private String email;
    private String telephone;
    private String address1;
    private String city;
    private String postCode;
    private String password;
    private String passwordConfirm;

    public AffiliateRegisterUser(String firstName, String lastName, String email, String telephone, String address1, String city, String postCode, String password, String passwordConfirm, boolean emailRand) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = emailRand ? randomEmail(email) : email;
        this.telephone = telephone;
        this.address1 = address1;
        this.city = city;
        this.postCode = postCode;
        this.password = password;
        this.passwordConfirm = passwordConfirm;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getAddress1() {
        return address1;
    }

    public String getCity() {
        return city;
    }

    public String getPostCode() {
        return postCode;
    }

    public String getPassword() {
        return password;
    }

    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    private String randomEmail(String email) {
        if (email.contains("@")) {
            String[] randEmail = email.split("@");
            return randEmail[0] + 1000 * Math.random() + "@" + randEmail[1];
        }
        return email;
    }
}