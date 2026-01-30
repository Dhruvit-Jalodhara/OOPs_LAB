package LAB_03.Q2;

public class Sphere extends Figure{
    double radius;

    Sphere(double radius){
        this.radius = radius;
    }

    @Override
    public void calcArea() {
        area = (4 * pi * radius * radius);
        DispArea();
    }

    @Override
    public void DispArea() {
        System.out.println("Area : " + area);
    }

    @Override
    public void calcVol() {
        volume = (4 * pi * radius * radius * radius) / 3;
        Dispvol();
    }

    @Override
    public void Dispvol() {
        System.out.println("Volume : " + volume);
    }
}
