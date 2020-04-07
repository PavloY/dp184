package data;

public class ReturnsUser {

    private String firstName;
    private String lastName;
    private String email;
    private String telephone;
    private String orderId;
    private String orderDate;
    private String productName;
    private String productCode;
    private String quantity;
    private String faultyOrOtherDetails;

    public ReturnsUser(String firstName, String lastName, String email, String telephone, String orderId, String orderDate, String productName, String productCode, String quantity, String faultyOrOtherDetails) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.telephone = telephone;
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.productName = productName;
        this.productCode = productCode;
        this.quantity = quantity;
        this.faultyOrOtherDetails = faultyOrOtherDetails;
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

    public String getOrderId() {
        return orderId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductCode() {
        return productCode;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getFaultyOrOtherDetails() {
        return faultyOrOtherDetails;
    }
}
