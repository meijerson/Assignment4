import java.util.ArrayList;
/**
 * DesignAndFeatures creates custom websites for customers.
 * 
 * @author Mackenzie Bloswick
 * @version 3/7/2017
 */
public class DesignAndFeatures
{
    private String design;
    private Customer customer;
    private int basePrice, finalPrice, featuresCost, featureMin;
    private int[] featuresPrices = new int[25];
    private int[] featuresSelection = new int[25];

    public DesignAndFeatures(Customer customer, String design, int feature1, int feature2, int feature3, int feature4, int feature5)
    {
        setDesign(design);
        featuresSelection[featureMin] = feature1;
        featuresSelection[featureMin+1] = feature2;
        featuresSelection[featureMin+2] = feature3;
        featuresSelection[featureMin+3] = feature4;
        featuresSelection[featureMin+4] = feature5;
        this.customer = customer;
        customer.getCustomerID();
        populateFeaturesPrice();
    }

    public void setDesign(String design)
    {
        if (design == "Nature") {
            this.design = design;
            basePrice = 300;
            featureMin = 0;
        }else if (design == "Tech") {
            this.design = design;
            basePrice = 350;
            featureMin = 5;
        }else if (design == "Business") {
            this.design = design;
            basePrice = 375;
            featureMin = 10;
        }else if (design == "Music") {
            this.design = design;
            basePrice = 400;
            featureMin = 15;
        }else if (design == "Naughty") {
            this.design = design;
            basePrice = 500;
            featureMin = 20;
        }else {
            System.out.println("Try again. You have 5 website designs to choose from, and each has a different base price." +
        "\n1. Nature - $300\n2. Tech - $350\n3. Business - $375\n4. Music - $400\n5. Naughty - $500\n");
        }
    }
    
    public String getDesign() {
        return design;
    }
    
    public void displayDesignPrices() {
        System.out.println("You have 5 website designs to choose from, and each has a different base price." +
        "\n1. Nature - $300\n2. Tech - $350\n3. Business - $375\n4. Music - $400\n5. Naughty - $500\n");
    }
    
    public void displayFeaturePrices() {
        System.out.println("For the " + design + " website design, the feature prices are as follows.");
        if (design == "Nature") {
            System.out.println("Feature 1: $10\nFeature 2: $15\nFeature 3: $20\nFeature 4: $25\nFeature 5: $30");
        }else if (design == "Tech") {
            System.out.println("Feature 1: $20\nFeature 2: $30\nFeature 3: $40\nFeature 4: $50\nFeature 5: $60");
        }else if (design == "Business") {
            System.out.println("Feature 1: $30\nFeature 2: $40\nFeature 3: $50\nFeature 4: $60\nFeature 5: $70");
        }else if (design == "Music") {
            System.out.println("Feature 1: $85\nFeature 2: $95\nFeature 3: $110\nFeature 4: $130\nFeature 5: $210");
        }else if (design == "Naughty") {
            System.out.println("Feature 1: $100\nFeature 2: $200\nFeature 3: $300\nFeature 4: $400\nFeature 5: $500");
        }else {
            System.out.println("You need to go enter a correct website design name.");
        }
    }

    public void addFeature(int whichFeature) {
        final int YES_FEATURE = 1;
         if (whichFeature == 1) {
             featuresSelection[featureMin] = YES_FEATURE;
             System.out.println("feature set to 1");
        }else if (whichFeature == 2) {
            featuresSelection[featureMin+1] = YES_FEATURE;
        }else if (whichFeature == 3) {
            featuresSelection[featureMin+2] = YES_FEATURE;
        }else if (whichFeature == 4) {
            featuresSelection[featureMin+3] = YES_FEATURE;
        }else if (whichFeature == 5) {
            featuresSelection[featureMin+4] = YES_FEATURE;
        }else {
            System.out.println("Please try again and enter a feature number 1-5.");
        }
    }
    
    public void removeFeature(int whichFeature) {
        final int NO_FEATURE = 0;
        if (whichFeature == 1) {
             featuresSelection[featureMin] = NO_FEATURE;
        }else if (whichFeature == 2) {
            featuresSelection[featureMin+1] = NO_FEATURE;
        }else if (whichFeature == 3) {
            featuresSelection[featureMin+2] = NO_FEATURE;
        }else if (whichFeature == 4) {
            featuresSelection[featureMin+3] = NO_FEATURE;
        }else if (whichFeature == 5) {
            featuresSelection[featureMin+4] = NO_FEATURE;
        }else {
            System.out.println("Please try again and enter a feature number 1-5.");
        }
    }
    
    public int getFeature(int whichFeature) {
        if (whichFeature == 1) {
             return featuresSelection[featureMin];
        }else if (whichFeature == 2) {
            return featuresSelection[featureMin+1];
        }else if (whichFeature == 3) {
            return featuresSelection[featureMin+2];
        }else if (whichFeature == 4) {
            return featuresSelection[featureMin+3];
        }else if (whichFeature == 5) {
            return featuresSelection[featureMin+4];
        }else {
            System.out.println("Please try again and enter a feature number 1-5.");
            return 0;
        }
    }
    
    public int getBasePrice() {
        return basePrice;
    }
    
    public void calculateFinalPrice() {
        featuresCost = 0;
        for (int i = 0; i < featuresSelection.length; i++) {
            if (featuresSelection[i] == 1) {
                featuresCost = featuresCost + featuresPrices[i];
            }
        }
        finalPrice = basePrice + featuresCost;
    }
    
    public int getFinalPrice() {
        return finalPrice;
    }
    
    public void displayFinalPrice() {
        System.out.println("The final price is: $" + finalPrice);
    }
    
    public void populateFeaturesPrice() {
        featuresPrices[0] = 10;
        featuresPrices[1] = 15;
        featuresPrices[2] = 20;
        featuresPrices[3] = 25;
        featuresPrices[4] = 30;
        featuresPrices[5] = 20;
        featuresPrices[6] = 30;
        featuresPrices[7] = 40;
        featuresPrices[8] = 50;
        featuresPrices[9] = 60;
        featuresPrices[10] = 30;
        featuresPrices[11] = 40;
        featuresPrices[12] = 50;
        featuresPrices[13] = 60;
        featuresPrices[14] = 70;
        featuresPrices[15] = 85;
        featuresPrices[16] = 95;
        featuresPrices[17] = 110;
        featuresPrices[18] = 130;
        featuresPrices[19] = 210;
        featuresPrices[20] = 100;
        featuresPrices[21] = 200;
        featuresPrices[22] = 300;
        featuresPrices[23] = 400;
        featuresPrices[24] = 500;
    }
}