package LAB_06;

import java.util.Scanner;

class Theater {
    int attendees;
    double ticketPrice;

    Theater(int attendees , double ticketPrice){
        this.attendees = attendees;
        this.ticketPrice = ticketPrice;
    }

    public double TotalProfit() {
        ticketPrice = attendees * 5;          // $5 per ticket
        double cost = 20 + (0.5 * attendees);    // $20 + $0.5 per attendee
        double profit = ticketPrice - cost;

        return profit;
    }
}

public class Q02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of attendees: ");
        int n = sc.nextInt();
        System.out.print("Enter the price of Ticket : ");
        int price = sc.nextInt();

        Theater t = new Theater(n,price);   // object creation
        double profit = t.TotalProfit();    // method call

        System.out.println("Total profit : " + profit);

        sc.close();
    }
}
