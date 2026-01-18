package Practice.Identifiers_and_Variables;

public class Q10 {
    public static void main(String[] args) {
        double price = 1000;
        double discount = 10; // percentage

        double finalPrice = price - (price * discount / 100);
        System.out.println("Final Price = " + finalPrice);
    }
}
