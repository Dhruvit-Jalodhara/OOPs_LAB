package LAB_09;

class MyRunnable implements Runnable {
    Thread t;

    MyRunnable() {
        t = new Thread(this);
        t.start();
    }

    public void run() {
        System.out.println("Thread running using Runnable");
    }
}

public class Q02 {
    public static void main(String[] args) {
        new MyRunnable();
    }
}
