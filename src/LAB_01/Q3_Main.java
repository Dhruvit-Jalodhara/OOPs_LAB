package LAB_01;

import java.util.Scanner;
import LAB_01.Q3.NumberCalc;

public class Q3_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        NumberCalc n = new NumberCalc();
        n.calculate(a, b, c);
        n.display();
    }
}
