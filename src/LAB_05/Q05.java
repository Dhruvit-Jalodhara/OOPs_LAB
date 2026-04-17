package LAB_05;


import java.util.Scanner;

public class Q05 {

    // function to calculate tax (15%)
    static double calculateTax(double grossPay) {
        return grossPay * 0.15;
    }

    // function to calculate net pay
    static double calculateNetPay(int hoursWorked) {

        double hourlyRate = 12;
        double grossPay = hoursWorked * hourlyRate;

        double tax = calculateTax(grossPay);

        double netPay = grossPay - tax;

        return netPay;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hours worked: ");
        int hours = sc.nextInt();

        double netPay = calculateNetPay(hours);

        System.out.println("Net Pay = $" + netPay);
    }
}
