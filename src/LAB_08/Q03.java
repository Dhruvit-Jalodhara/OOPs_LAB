package LAB_08;

import java.util.*;

public class Q03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[10];

        System.out.println("Enter 10 names:");
        for (int i = 0; i < 10; i++) {
            names[i] = sc.nextLine();
        }

        for (int i = 0; i < 10; i++) {
            if (names[i].length() > 3)
                names[i] = names[i].substring(3);
            else
                names[i] = "";
        }

        Arrays.sort(names);

        System.out.println("Sorted names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
