package LAB_03;

import java.util.*;

class figure {
    double radius;
    double area;
    double volume;

    public void dispArea(){
        System.out.println("Area : " + area);
    }
    public void dispVolume(){
        System.out.println("Volume : " + volume);
    }
}

class cone extends figure {
    double height;
    double slantHeight;

    cone(double radius , double height , double slantHeight){
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

public class C1_InheritanceDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of cone : ");
        double radius = sc.nextDouble();
        System.out.print("Enter the height of cone : ");
        double height = sc.nextDouble();
        System.out.print("Enter the slant height of cone : ");
        double slantHeight = sc.nextDouble();

        cone c1 = new cone(radius,height,slantHeight);
        c1.calArea();
        c1.calVolume();
    }
}
