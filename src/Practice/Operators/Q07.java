package Practice.Operators;

public class Q07 {
    public static void main(String[] args) {
        double principal = 5000;
        double rate = 5;
        int time = 2;

        double amount = principal * Math.pow((1 + rate / 100), time);
        double ci = amount - principal;

        System.out.println("Compound Interest = " + ci);
    }
}
