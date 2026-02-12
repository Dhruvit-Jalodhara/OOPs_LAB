package LAB_04;

import java.util.Scanner;

public class Q4 {
    public static boolean isPerfect(String str){
        if(str.length() != 26)
            return false;

        str = str.toLowerCase();

        int[] freq = new int[26];
        for(char ch : str.toCharArray()){

            int idx = ch - 'a';

            freq[idx]++;
            if(freq[idx] > 1)
                return false;   // duplicate elements
        }

        return true;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        if (isPerfect(str)) {
            System.out.println("Perfect String");
        } else {
            System.out.println("Not a Perfect String");
        }
    }
}
