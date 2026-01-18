package LAB_01;


import LAB_01.Q1_calculator.Calculator;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int a = sc.nextInt();

        System.out.print("Enter second integer: ");
        int b = sc.nextInt();

        Calculator c = new Calculator();

        System.out.println("Sum = " + c.sum(a, b));
        System.out.println("Product = " + c.product(a, b));
        System.out.println("Difference = " + c.difference(a, b));
        System.out.println("Quotient = " + c.quotient(a, b));
    }
}
