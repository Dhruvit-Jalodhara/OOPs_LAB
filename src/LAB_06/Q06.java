package LAB_06;

import java.util.Scanner;

class Q06 {
    int x, y, z;

    Q06(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    void display() {
        System.out.println("(" + x + "," + y + "," + z + ")");
    }

    double distance(Q06 p) {
        return Math.sqrt(Math.pow(x - p.x, 2) +
                Math.pow(y - p.y, 2) +
                Math.pow(z - p.z, 2));
    }

    public static void main(String[] args) {
        Q06 p1 = new Q06(1, 2, 3);
        Q06 p2 = new Q06(4, 5, 6);

        p1.display();
        p2.display();

        System.out.println("Distance: " + p1.distance(p2));
    }
}
