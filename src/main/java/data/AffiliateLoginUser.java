package data;

public class AffiliateLoginUser {

    private String email;

    private String password;

    public AffiliateLoginUser(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
