package LAB_04;

import java.util.Scanner;

public class Q3 {
    public static void printCharacters(String str, int n) {

        int[] freq = new int[26];

        // Count frequency
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                freq[ch - 'a']++;
            }
        }

        // Print characters whose frequency > n
        System.out.println("Characters with frequency > " + n + ":");

        for (int i = 0; i < 26; i++) {
            if (freq[i] > n) {
                System.out.println((char)(i + 'a'));
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        printCharacters(str, n);
    }
}
