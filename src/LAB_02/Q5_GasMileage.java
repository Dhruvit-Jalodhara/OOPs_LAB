package LAB_02;

import java.util.Scanner;

public class Q5_GasMileage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalMiles = 0;
        int totalGallons = 0;

        while (true) {
            System.out.print("Miles driven (-1 to quit): ");
            int miles = sc.nextInt();
            if (miles == -1) break;

            System.out.print("Gallons used: ");
            int gallons = sc.nextInt();

            System.out.println("MPG = " + (double) miles / gallons);

            totalMiles += miles;
            totalGallons += gallons;
        }

        if (totalGallons != 0)
            System.out.println("Combined MPG = " + (double) totalMiles / totalGallons);
    }
}
