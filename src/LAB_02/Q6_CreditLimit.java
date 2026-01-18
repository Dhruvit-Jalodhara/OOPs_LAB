package LAB_02;

import java.util.Scanner;

public class Q6_CreditLimit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Account number: ");
        int acc = sc.nextInt();

        System.out.print("Beginning balance: ");
        double balance = sc.nextDouble();

        System.out.print("Charges: ");
        double charges = sc.nextDouble();

        System.out.print("Credits: ");
        double credits = sc.nextDouble();

        double newBalance = balance + charges - credits;

        if (newBalance > 5000)
            System.out.println("Credit limit exceeded");
        else
            System.out.println("New balance = " + newBalance);
    }
}
