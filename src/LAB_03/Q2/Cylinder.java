package LAB_03.Q2;

public class Cylinder extends Figure{
    double radius;
    double height;

    Cylinder(double radius , double height){
        this.radius = radius;
        this.height = height;
    }

    @Override
    public void DispArea() {
        System.out.println("Area : " + area);
    }

    @Override
    public void calcArea() {
        area = (2 * pi * radius * height) + (2 * pi * radius * radius);
        DispArea();
    }

    @Override
    public void Dispvol() {
        System.out.println("Volume : " + volume);
    }

    @Override
    public void calcVol() {
        volume = (pi * radius * radius * height);
        Dispvol();
    }
}
