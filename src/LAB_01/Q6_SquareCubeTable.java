package LAB_01;

public class Q6_SquareCubeTable {
    public static void main(String[] args) {
        System.out.println("Number\tSquare\tCube");

        for (int i = 0; i <= 10; i++) {
            System.out.println(i + "\t" + (i * i) + "\t" + (i * i * i));
        }
    }
}
