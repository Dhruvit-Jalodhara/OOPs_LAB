package LAB_08;

import java.util.*;

public class Q01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a line:");
        String str = sc.nextLine().toLowerCase();

        int first = str.indexOf("the");
        int last = str.lastIndexOf("the");

        if (first == -1 || last == -1 || first == last) {
            System.out.println("Not enough occurrences of 'the'");
        } else {
            String result = str.substring(first + 3, last);
            System.out.println("First position: " + first);
            System.out.println("Last position: " + last);
            System.out.println("Between string: " + result);
        }
    }
}