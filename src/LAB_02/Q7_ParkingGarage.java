package LAB_02;

public class Q7_ParkingGarage {
    static double calculateCharges(double hours) {
        double charge = 2.0;

        if (hours > 3)
            charge += Math.ceil(hours - 3) * 0.5;

        if (charge > 10)
            charge = 10;

        return charge;
    }

    public static void main(String[] args) {
        double total = 0;
        double[] hours = {1.5, 4.0, 6.5, 24};

        for (double h : hours) {
            double fee = calculateCharges(h);
            total += fee;
            System.out.println("Hours: " + h + " Charge: $" + fee);
        }

        System.out.println("Total receipts = $" + total);
    }
}
