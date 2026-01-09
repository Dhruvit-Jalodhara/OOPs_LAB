package LAB_01;

import LAB_01.Q01.Calculator;

import java.util.Scanner;

public class C01_Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the value of a : ");
        int a = sc.nextInt();

        System.out.print("enter the value of b : ");
        int b = sc.nextInt();

        Calculator cal = new Calculator();

        System.out.println("sum : " + cal.sum(a,b));
        System.out.println("difference : " + cal.diff(a,b));
        System.out.println("multiplication : " + cal.mul(a,b));
        System.out.println("division : " + cal.div(a,b));
        System.out.println("remainder : " + cal.rem(a,b));
    }
}
