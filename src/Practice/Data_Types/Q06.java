package Practice.Data_Types;

public class Q06 {
    public static void main(String[] args) {
        char ch = '9';

        if (ch >= 'A' && ch <= 'Z')
            System.out.println("Uppercase Letter");
        else if (ch >= 'a' && ch <= 'z')
            System.out.println("Lowercase Letter");
        else if (ch >= '0' && ch <= '9')
            System.out.println("Digit");
        else
            System.out.println("Special Character");
    }
}
