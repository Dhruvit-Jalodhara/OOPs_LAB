package LAB_01;

import java.util.Scanner;

class CompareNumber{
    int a;
    int b;

    CompareNumber(int a , int b){
        this.a = a;
        this.b = b;
    }

    public void check(){
        if (a > b) {
            System.out.println(a + " is larger");
        } else if (b > a) {
            System.out.println(b + " is larger");
        } else {
            System.out.println("The numbers are equal");
        }
    }
}

public class Q2_CompareNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        CompareNumber cp1 = new CompareNumber(a,b);

        cp1.check();

        sc.close();
    }
}
