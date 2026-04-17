package LAB_02;

import java.util.Scanner;

class CostCalc{
    public double getDailyCost(double miles , double costPerGallon , double fees , double tolls){

        double gallonsUsed = miles / 25; // assume 25 mpg

        double dailyCost = (gallonsUsed * costPerGallon) + fees + tolls;

        return dailyCost;
    }
}

public class Q1_DrivingCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Miles driven per day: ");
        double miles = sc.nextDouble();

        System.out.print("Cost per gallon: ");
        double costPerGallon = sc.nextDouble();

        System.out.print("Average fees per day: ");
        double fees = sc.nextDouble();

        System.out.print("Tolls per day: ");
        double tolls = sc.nextDouble();

        CostCalc c = new CostCalc();
        double dailyCost = c.getDailyCost(miles , costPerGallon , fees , tolls);
        System.out.println("Daily driving cost = $" + dailyCost);
    }
}
