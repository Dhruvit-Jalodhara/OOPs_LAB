package LAB_03.Q4;

public class Cylinder extends Figure{
    double height;

    Cylinder(double radius , double height){
        this.radius = radius;
        this.height = height;
    }

    @Override
    public void calcArea() {
        area = (2 * PI * radius * height) + (2 * PI * radius * radius);
    }

    @Override
    public void dispArea() {
        System.out.println("Area of Cylinder : " + area);
    }

    @Override
    public void calcVolume() {
        volume = (PI * radius * radius * height);
    }

    @Override
    public void dispVolume() {
        System.out.println("Volume of Cylinder : " + volume);
    }
}
