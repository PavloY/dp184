package data;

public class User {
   private String firstName;
   private String lastName;
   private String email;
   private String Telephone;
   private String fax;
   private String company;
   private String address1;
   private String address2;
   private String city;
   private String postCode;
   private String country;
   private String region;
   private String password;
   private String confirmPassword;
   private boolean subscribe;
   private boolean policy;

   
    public User(String firstName, String lastName, String email, String telephone, String fax,
                String company, String address1, String address2, String city, String postCode,
                String country, String region, String password, String confirmPassword, boolean subscribe,
                boolean policy) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = randomEmail(email);
        Telephone = telephone;
        this.fax = fax;
        this.company = company;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.postCode = postCode;
        this.country = country;
        this.region = region;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.subscribe = subscribe;
        this.policy = policy;
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
        return Telephone;
    }

    public String getFax() {
        return fax;
    }

    public String getCompany() {
        return company;
    }

    public String getAddress1() {
        return address1;
    }

    public String getAddress2() {
        return address2;
    }

    public String getCity() {
        return city;
    }

    public String getPostCode() {
        return postCode;
    }

    public String getCountry() {
        return country;
    }

    public String getRegion() {
        return region;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public boolean isSubscribe() {
        return subscribe;
    }

    public boolean isPolicy() {
        return policy;
    }

    private String randomEmail(String email){
        if(email.contains("@")){String[] randEmail  = email.split("@");
            return  randEmail[0] + 1000*Math.random() +"@" + randEmail[1];}
        return email;
    }


}
