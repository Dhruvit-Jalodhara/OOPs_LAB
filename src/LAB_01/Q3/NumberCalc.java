package LAB_01.Q3;

public class NumberCalc extends AbstractCalc implements Operations {
    int sum, product, largest, smallest;
    double average;

    public void calculate(int a, int b, int c) {
        sum = a + b + c;
        product = a * b * c;
        average = sum / 3.0;

        largest = Math.max(a, Math.max(b, c));
        smallest = Math.min(a, Math.min(b, c));
    }

    public void display() {
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
        System.out.println("Product = " + product);
        System.out.println("Largest = " + largest);
        System.out.println("Smallest = " + smallest);
    }
}

