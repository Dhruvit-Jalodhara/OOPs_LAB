package Practice.Selection_Statements;

public class Q10 {
    public static void main(String[] args) {
        int age = 65;

        if (age < 13)
            System.out.println("Child");
        else if (age < 20)
            System.out.println("Teenager");
        else if (age < 60)
            System.out.println("Adult");
        else
            System.out.println("Senior");
    }
}
