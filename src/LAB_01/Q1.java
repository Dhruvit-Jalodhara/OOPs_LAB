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

        Calculator c = new Calculator(a,b);

        System.out.println("Sum = " + c.sum());
        System.out.println("Product = " + c.product());
        System.out.println("Difference = " + c.difference());
        System.out.println("Quotient = " + c.quotient());
    }
}
