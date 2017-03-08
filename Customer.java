import java.util.Random;
/**
 * Write a description of class Customer here.
 * 
 * @author Mackenzie Bloswick 
 * @version 3/6/2017
 */
public class Customer
{   
    private int customerID;
    
    private String lastName;
    private String firstName;
    private String companyName;
    private String address;
    private String city;
    private String state;
    private String phone;
    private int zip;
    
    public Customer(String lastName, String firstName, String companyName, String address, String city, String state, int zip, String phone)
    {
        Random rand = new Random();
        customerID = rand.nextInt(99999) + 10000;
        this.lastName = lastName;
        this.firstName = firstName;
        this.companyName = companyName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
    }
    
    public void setCustomerID(int newCustomerID) {
        if (newCustomerID > 10000 && newCustomerID <= 99999) {
            customerID = newCustomerID;
        }
        else {
            System.out.println("Please enter a valid 5 digit customer ID.");
        }
    }

    public int getCustomerID() {
        return customerID;
    }
    
    public void setLastName(String newLastName) {
        lastName = newLastName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setFirstName(String newFirstName) {
        firstName = newFirstName;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setCompanyName(String newCompanyName) {
    companyName = newCompanyName;
    }
    
    public String getCompanyName() {
        return companyName;
    }
    
    public void setAddress(String newAddress) {
    address = newAddress;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setCity(String newCity) {
    city = newCity;
    }
    
    public String getCity() {
        return city;
    }
    
    public void setState(String newState) {
    state = newState;
    }
    
    public String getState() {
        return state;
    }
    
    public void setZip(int newZip) {
    zip = newZip;
    }
    
    public int getZip() {
        return zip;
    }
    
    public void setPhone(String newPhone) {
    phone = newPhone;
    }
    
    public String getPhone() {
        return phone;
    }
}