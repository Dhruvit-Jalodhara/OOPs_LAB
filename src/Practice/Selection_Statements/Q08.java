package Practice.Selection_Statements;

public class Q08 {
    public static void main(String[] args) {
        int a = 3, b = 4, c = 5;

        if (a + b > c && a + c > b && b + c > a)
            System.out.println("Valid Triangle");
        else
            System.out.println("Invalid Triangle");
    }
}
