package LAB_04;

import java.util.Scanner;

public class Q5 {
    public static int countPattern(int a, int b, String pattern){
        int count = 0;
        for (int i = a; i <= b; i++) {
            String num = String.valueOf(i);
            if(num.contains(pattern))
                count++;
        }
        return count;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter range (a b): ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print("Enter pattern: ");
        String pattern = sc.next();

        int result = countPattern(a, b, pattern);

        System.out.println("The number of times " + pattern +
                " occurred between " + a + " and " + b + " : " + result);
    }
}
