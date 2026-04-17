package LAB_05;

class Product {

    int productID;
    String name;
    int categoryID;
    double unitPrice;

    Product(int productID, String name, int categoryID, double unitPrice) {
        this.productID = productID;
        this.name = name;
        this.categoryID = categoryID;
        this.unitPrice = unitPrice;
    }

    void displayProduct() {
        System.out.println("Product ID: " + productID);
        System.out.println("Name: " + name);
        System.out.println("Category ID: " + categoryID);
        System.out.println("Unit Price: " + unitPrice);
    }
}

class ElectricalProduct extends Product {

    String voltageRange;
    int wattage;

    ElectricalProduct(int productID, String name, int categoryID, double unitPrice,
                      String voltageRange, int wattage) {

        super(productID, name, categoryID, unitPrice);
        this.voltageRange = voltageRange;
        this.wattage = wattage;
    }

    // method to change wattage and price
    void updateProduct(int newWattage, double newPrice) {
        wattage = newWattage;
        unitPrice = newPrice;
    }

    void displayElectricalProduct() {

        displayProduct();
        System.out.println("Voltage Range: " + voltageRange);
        System.out.println("Wattage: " + wattage);
    }
}


public class Q03 {
    public static void main(String[] args) {

        ElectricalProduct ep =
                new ElectricalProduct(101, "Heater", 5, 2500, "220-240V", 1500);

        System.out.println("Original Product Details:");
        ep.displayElectricalProduct();

        // change wattage and price
        ep.updateProduct(2000, 3000);

        System.out.println("\nUpdated Product Details:");
        ep.displayElectricalProduct();
    }
}
