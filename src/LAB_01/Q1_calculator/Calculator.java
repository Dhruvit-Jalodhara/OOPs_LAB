package LAB_01.Q1_calculator;

public class Calculator {
    int a;
    int b;

    public Calculator(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int sum() {
        return a + b;
    }

    public int product() {
        return a * b;
    }

    public int difference() {
        return a - b;
    }

    public int quotient() {
        return a / b;
    }
}
