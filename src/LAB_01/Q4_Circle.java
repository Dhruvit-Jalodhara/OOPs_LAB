package LAB_01;

import java.util.Scanner;

public class Q4_Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        int r = sc.nextInt();

        double diameter = 2 * r;
        double circumference = 2 * Math.PI * r;
        double area = Math.PI * r * r;

        System.out.println("Diameter = " + diameter);
        System.out.println("Circumference = " + circumference);
        System.out.println("Area = " + area);
    }
}
