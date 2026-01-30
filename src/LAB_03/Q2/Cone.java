package LAB_03.Q2;

public class Cone extends Figure {
    double radius;
    double height;
    double slantHeight;

    Cone(double radius, double height, double slantHeight) {
        this.radius = radius;
        this.height = height;
        this.slantHeight = slantHeight;
    }

    @Override
    public void DispArea() {
        System.out.println("Area : " + area);
    }

    @Override
    public void calcArea() {
        area = (pi * radius * slantHeight) + (pi * radius * radius);
        DispArea();
    }

    @Override
    public void Dispvol() {
        System.out.println("Volume : " + volume);
    }

    @Override
    public void calcVol() {
        volume = (pi * radius * radius * height) / 3;
        Dispvol();
    }

}
