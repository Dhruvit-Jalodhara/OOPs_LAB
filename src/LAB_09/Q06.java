package LAB_09;

class Fibonacci extends Thread {
    public void run() {
        int a = 1, b = 1;
        for (int i = 1; i <= 50; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;

            if (i == 50) {
                try { Thread.sleep(2000); } catch (Exception e) {}
            }
        }
    }
}

class Prime extends Thread {
    public void run() {
        int count = 0, num = 2;
        while (count < 25) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) { isPrime = false; break; }
            }
            if (isPrime) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }
}

public class Q06 {
    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        Prime p = new Prime();

        f.setPriority(8);
        p.setPriority(5);

        f.start();
        p.start();
    }
}
