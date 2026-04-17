package LAB_04;

public class Q1_ThreeDMatrix {
    static int X = 3;
    static int Y = 3;
    static int Z = 3;

    // set value in 3D position
    static void set(int value, int indexX, int indexY, int indexZ, int[] arr) {
        int index = indexX * (Y * Z) + indexY * Z + indexZ;
        arr[index] = value;
    }

    // get value from 3D position
    static int get(int indexX, int indexY, int indexZ, int[] arr) {
        int index = indexX * (Y * Z) + indexY * Z + indexZ;
        return arr[index];
    }

    public static void main(String[] args) {

        int[] array1D = new int[X * Y * Z];

        set(10, 0, 0, 0, array1D);
        set(25, 1, 1, 1, array1D);
        set(50, 2, 2, 2, array1D);

        System.out.println(get(0,0,0,array1D));
        System.out.println(get(1,1,1,array1D));
        System.out.println(get(2,2,2,array1D));
    }
}
