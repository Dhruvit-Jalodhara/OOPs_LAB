package Practice.Data_Types;

public class Q02 {
    public static void main(String[] args) {
        int i = 10;
        double d = i;        // implicit casting

        double x = 12.75;
        int y = (int) x;     // explicit casting

        System.out.println("Implicit: " + d);
        System.out.println("Explicit: " + y);
    }
}
