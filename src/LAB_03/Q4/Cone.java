package LAB_03.Q4;

public class Cone extends Figure{
    double slantHeight;
    double height;

    public Cone(double radius, double slantHeight) {
        this.radius = radius;
        this.slantHeight = slantHeight;
        this.height = Math.sqrt(slantHeight * slantHeight - radius * radius);
    }

    @Override
    public void calcArea() {
        area = (PI * radius * radius) + (PI * radius * slantHeight);
    }

    @Override
    public void dispArea() {
        System.out.println("Area of Cone : " + area);
    }

    @Override
    public void calcVolume() {
        volume = (PI * radius * radius * height) / 3;
    }

    @Override
    public void dispVolume() {
        System.out.println("Volume of Cone : " + volume);
    }
}
