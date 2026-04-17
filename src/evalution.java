import java.util.Scanner;

public class evalution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string : ");
        String s = sc.nextLine();

        s.toLowerCase();

        int consonents = 0 , vowels = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if("aeiou".indexOf(ch) != -1)
                vowels++;

            if("bcdfghjklmnpqrstvwxyz".indexOf(ch) != -1)
                consonents++;

        }

        System.out.println("Number of vowels in string : " + vowels);
        System.out.println("Number of consonents in string : " + consonents);
    }
}
