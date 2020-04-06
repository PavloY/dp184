package data;

import lombok.Getter;

@Getter
public class User {
   private String firstName;
   private String lastName;
   private String email;
   private String telephone;
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
                boolean policy, boolean emailRand) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = emailRand ? randomEmail(email): email;
        this.telephone = telephone;
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

    public User(String firstName, String lastName, String email, String telephone, String address1, String city,
                String country, String region, String password, String confirmPassword, boolean policy, boolean emailRand){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = emailRand ? randomEmail(email): email;
        this.telephone = telephone;
        this.address1 = address1;
        this.city = city;
        this.country = country;
        this.region = region;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.policy = policy;
    }

    public User(String firstName, String lastName, String email, String telephone, String address1, String city,
                String postCode, String country, String region, String password, String confirmPassword, boolean policy,
                boolean emailRand){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = emailRand ? randomEmail(email): email;
        this.telephone = telephone;
        this.address1 = address1;
        this.city = city;
        this.postCode = postCode;
        this.country = country;
        this.region = region;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.policy = policy;
    }


    private String randomEmail(String email){
        if(email.contains("@")){String[] randEmail  = email.split("@");
            return  randEmail[0] + 1000*Math.random() +"@" + randEmail[1];}
        return email;
    }


}
