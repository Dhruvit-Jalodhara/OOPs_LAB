package LAB_03.Q4;

public class Demo {
    public static void main(String[] args) {
        Cone cone = new Cone(3,4);
        cone.calcArea();
        cone.dispArea();
        cone.calcVolume();
        cone.dispVolume();

        Sphere sphere = new Sphere(5);
        sphere.calcArea();
        sphere.dispArea();
        sphere.calcVolume();
        sphere.dispVolume();

        Cylinder cylinder = new Cylinder(3,5);
        cylinder.calcArea();
        cylinder.dispArea();
        cylinder.calcVolume();
        cylinder.dispVolume();
    }
}
