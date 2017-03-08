import java.util.ArrayList;
/**
 * Assignment 4
 * 
 * @author Mackenzie Bloswick 
 * @version 2.21.2017
 */
public class WebsiteDesign
{   
    private ArrayList<Customer> customers;
    private ArrayList<DesignAndFeatures> customWebsites;
    
    public WebsiteDesign()
    {
        this.customers = new ArrayList<Customer>();
        this.customWebsites = new ArrayList<DesignAndFeatures>();
    }
    
    public void getCustomers() {
        for (int i = 0; i < customers.size(); i++) {
            System.out.println(i + ". " + customers.get(i).getFirstName() + " " + customers.get(i).getLastName());
        }
    }
    
    public WebsiteDesign(Customer customer, DesignAndFeatures customWebsite)
    {
        this.customers = new ArrayList<Customer>();
        this.customWebsites = new ArrayList<DesignAndFeatures>();
        this.customers.add(customer);
        this.customWebsites.add(customWebsite);
    }
    
    public void addCustomer(Customer customer, DesignAndFeatures customWebsite)
    {
        this.customers.add(customer);
        this.customWebsites.add(customWebsite);
    }
    
    public void displayFinalPrice(Customer customer, DesignAndFeatures customWebsite) {
        if (customWebsite.getFinalPrice() != 0)
        {
        System.out.println("The final price for " + customer.getFirstName() + " " + customer.getLastName() + " is " + customWebsite.getFinalPrice() + ".");
        }
        else {
            System.out.println("The final price has not yet been calculated for that customer.");
        }
    }
}