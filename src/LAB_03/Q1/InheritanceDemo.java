package LAB_03.Q1;

import java.util.Scanner;

public class InheritanceDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of cone : ");
        double radius = sc.nextDouble();
        System.out.print("Enter the height of cone : ");
        double height = sc.nextDouble();
        System.out.print("Enter the slant height of cone : ");
        double slantHeight = sc.nextDouble();

        Cone c1 = new Cone(radius,height,slantHeight);
        c1.calArea();
        c1.calVolume();
    }
}
