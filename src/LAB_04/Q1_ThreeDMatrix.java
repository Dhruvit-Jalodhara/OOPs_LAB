package LAB_04;

public class Q1_ThreeDMatrix {
    // Dimensions of 3D matrix
    static int X = 3;
    static int Y = 3;
    static int Z = 3;

    // set function
    public static void set(int value, int indexX, int indexY, int indexZ, int[] oneDArray) {

        int index = (indexX * Y * Z)
                + (indexY * Z)
                + indexZ;

        oneDArray[index] = value;
    }

    // get function (as per given prototype)
    public static void get(int value, int indexX, int indexY, int indexZ, int[] oneDArray) {

        int index = (indexX * Y * Z)
                + (indexY * Z)
                + indexZ;

        value = oneDArray[index];

        System.out.println("Value at position ("
                + indexX + "," + indexY + "," + indexZ + ") = " + value);
    }

    public static void main(String[] args) {

        int[] arr = new int[X * Y * Z];

        set(50, 1, 1, 1, arr);

        get(0, 1, 1, 1, arr);
    }
}
