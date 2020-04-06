package data;

import lombok.Getter;

@Getter
public class EditAddressUser {

    private String firstName;
    private String lastName;
    private String company;
    private String address1;
    private String address2;
    private String city;
    private String postCode;
    private String country;
    private String region;
    private  boolean defaultAddress;

    public EditAddressUser(String firstName, String lastName, String company, String address1, String address2,
                           String city, String postCode, String country, String region, boolean defaultAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.postCode = postCode;
        this.country = country;
        this.region = region;
        this.defaultAddress = defaultAddress;
    }

    public EditAddressUser(String firstName, String lastName, String company, String country, String region,
                           boolean defaultAddress){}

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getCompany(){
        return company;
    }

    public String getAddress1(){
        return address1;
    }

    public String getAddress2(){
        return address2;
    }

    public String getCity(){
        return city;
    }

    public String getPostCode(){
        return postCode;
    }

    public String getCountry(){
        return country;
    }

    public String getRegion(){
        return region;
    }

    public boolean isDefaultAddress(){
        return defaultAddress;
    } 
}
