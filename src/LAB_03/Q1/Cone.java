package LAB_03.Q1;

public class Cone extends Figure {
    double height;
    double slantHeight;

    public Cone(double radius, double height, double slantHeight){
        this.radius = radius;
        this.height = height;
        this.slantHeight = slantHeight;
    }

    public void calArea(){
        area = (Math.PI * radius * slantHeight) + (Math.PI * radius * radius);
        dispArea();
    }

    public void calVolume(){
        volume = (Math.PI * radius * radius * height) / 3;
        dispVolume();
    }
}
