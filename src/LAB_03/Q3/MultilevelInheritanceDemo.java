package LAB_03.Q3;

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        Z z = new Z(5,2);
        System.out.println("Sum : " + z.sum());
        System.out.println("Difference : " + z.difference());
        System.out.println("Product : " + z.product());
    }
}
