package LAB_03;


public class C2_Demo {
    static abstract class Figure{
        double pi = 3.1420;
        double area;
        double volume;

        public abstract void calcArea();
        public abstract void calcVol();
        public abstract void DispArea();
        public abstract void Dispvol();
    }

    static class Cone extends Figure{
        double radius;
        double height;
        double slantHeight;

        Cone(double radius , double height , double slantHeight){
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

    static class Sphere extends Figure{
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

    static class Cylinder extends Figure{
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
