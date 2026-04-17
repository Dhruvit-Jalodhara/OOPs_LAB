package LAB_09;

class Account {
    int balance = 600;

    synchronized void deposit(int amt) {
        balance += amt;
        System.out.println("Father deposits: " + amt + " Balance: " + balance);
        notifyAll();
    }

    synchronized void withdraw(int amt) {
        while (balance <= 2000) {
            try { wait(); } catch (Exception e) {}
        }
        balance -= amt;
        System.out.println("Son withdraws: " + amt + " Balance: " + balance);
        notifyAll();
    }
}

class Father extends Thread {
    Account acc;
    java.util.Random r = new java.util.Random();

    Father(Account acc) { this.acc = acc; }

    public void run() {
        while (true) {
            if (acc.balance < 2000) {
                acc.deposit(r.nextInt(200) + 1);
            }
        }
    }
}

class Son extends Thread {
    Account acc;
    java.util.Random r = new java.util.Random();

    Son(Account acc) { this.acc = acc; }

    public void run() {
        while (true) {
            if (acc.balance > 2000) {
                acc.withdraw(r.nextInt(150) + 1);
            }
        }
    }
}

public class Q07 {
    public static void main(String[] args) {
        Account acc = new Account();

        new Father(acc).start();
        new Son(acc).start();
    }
}
