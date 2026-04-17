package LAB_06;

class Bank {

    double deposit(double amount, double balance) {
        return balance + amount;
    }

    double withdraw(double amount, double balance) {
        if (balance >= amount)
            return balance - amount;
        else
            return 0;
    }
}

public class Q05 {
    public static void main(String[] args) {
        Bank b = new Bank();

        double bal = 1000;
        bal = b.deposit(500, bal);
        System.out.println("Balance: " + bal);

        bal = b.withdraw(300, bal);
        System.out.println("Balance: " + bal);
    }
}