package LAB_05;

class Fruit {

    String name;
    String type;   // single fruit or bunch fruit
    double price;

    // Constructor
    Fruit(String name, String type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    // Method to display fruit details
    void displayFruit() {
        System.out.println("Fruit Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);
        System.out.println();
    }
}


public class Q04 {
    public static void main(String[] args) {

        // Creating objects
        Fruit f1 = new Fruit("Apple", "Single", 120);
        Fruit f2 = new Fruit("Banana", "Bunch", 60);

        // Display attributes
        f1.displayFruit();
        f2.displayFruit();
    }
}
