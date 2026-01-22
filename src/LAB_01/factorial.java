package LAB_01;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number n : ");
        int n = sc.nextInt();

        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans *= i;
        }

        System.out.println("factorial of " + n + " is : " + ans);
    }
}
