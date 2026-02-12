package LAB_03.Q4;

public class Sphere extends Figure{
    public Sphere(int radius) {
        this.radius = radius;
    }

    @Override
    public void calcArea() {
        area = (4 * PI * radius * radius);
    }

    @Override
    public void dispArea() {
        System.out.println("Area of Sphere : " + area);
    }

    @Override
    public void calcVolume() {
        volume = (4 * PI * radius * radius * radius) / 3;
    }

    @Override
    public void dispVolume() {
        System.out.println("Volume of Sphere : " + volume);
    }
}
