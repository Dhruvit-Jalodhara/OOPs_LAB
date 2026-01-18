package Practice.Data_Types;

public class Q05 {
    public static void main(String[] args) {
        float r1 = 5.5f;
        double r2 = 5.5;

        float area1 = (float) (Math.PI * r1 * r1);
        double area2 = Math.PI * r2 * r2;

        System.out.println("Area (float) = " + area1);
        System.out.println("Area (double) = " + area2);
    }
}
