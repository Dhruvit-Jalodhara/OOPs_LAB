package LAB_04;

interface Function{
    int evaluate(int x);
}

class Half implements Function{
    @Override
    public int evaluate(int x) {
        return x/2;
    }
}

public class Client {
    public static int[] processArray(int[] arr) {

        Half halfObj = new Half();   // Create instance of Half

        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = halfObj.evaluate(arr[i]);
        }

        return result;
    }

    public static void main(String[] args) {

        int[] input = {10, 20, 30, 40};

        int[] output = processArray(input);

        System.out.println("Processed Array:");

        for (int value : output) {
            System.out.print(value + " ");
        }
    }
}
