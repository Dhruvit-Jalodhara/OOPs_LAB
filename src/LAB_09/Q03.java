package LAB_09;

class SinThread extends Thread {
    double x;
    SinThread(double x) { this.x = x; }

    public void run() {
        System.out.println("sin(" + x + ") = " + Math.sin(x));
    }
}

class CosThread extends Thread {
    double x;
    CosThread(double x) { this.x = x; }

    public void run() {
        System.out.println("cos(" + x + ") = " + Math.cos(x));
    }
}

public class Q03 {
    public static void main(String[] args) {
        double x = Math.PI / 4;
        new SinThread(x).start();
        new CosThread(x).start();
    }
}
