package LAB_03.Q2;

public class Demo {
    public static void main(String[] args) {
        Cone c1 = new Cone(3,5,8);
        c1.calcArea();
        c1.calcVol();

        Sphere s1 = new Sphere(5);
        s1.calcArea();
        s1.calcVol();

        Cylinder cy1 = new Cylinder(3,5);
        cy1.calcArea();
        cy1.calcVol();

    }
}
