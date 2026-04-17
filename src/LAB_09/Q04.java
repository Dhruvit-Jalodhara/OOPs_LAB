package LAB_09;

import java.util.Random;

class Player extends Thread {
    int score;
    Random r = new Random();

    public void run() {
        score = r.nextInt(100);
        System.out.println(Thread.currentThread().getName() + " score: " + score);
    }
}

public class Q04 {
    public static void main(String[] args) throws Exception {
        Player p1 = new Player();
        Player p2 = new Player();

        p1.setName("Player1");
        p2.setName("Player2");

        p1.start(); p2.start();
        p1.join(); p2.join();

        if (p1.score > p2.score) {
            System.out.println("Player1 wins by " + (p1.score - p2.score));
        } else if (p2.score > p1.score) {
            System.out.println("Player2 wins by " + (p2.score - p1.score));
        } else {
            System.out.println("Draw");
        }
    }
}
