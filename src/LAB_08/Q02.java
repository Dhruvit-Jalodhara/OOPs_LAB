package LAB_08;

import java.util.*;

public class Q02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a line:");
        String str = sc.nextLine().toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ("aeiou".indexOf(ch) != -1) {
                System.out.println(ch + " at position " + i);
            }
        }
    }
}
