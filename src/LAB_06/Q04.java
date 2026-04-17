package LAB_06;

abstract class Car {
    int speed = 120;   // instance variable

    // concrete method
    void display() {
        System.out.println("Car speed: " + speed);
    }

    // abstract methods
    abstract void avg();
    abstract void model();
}

class Maruti extends Car {

    void avg() {
        System.out.println("Maruti Average: 20 km/l");
    }

    void model() {
        System.out.println("Maruti Model: Swift");
    }
}

class Santro extends Car {

    void avg() {
        System.out.println("Santro Average: 18 km/l");
    }

    void model() {
        System.out.println("Santro Model: Hyundai Santro");
    }
}

public class Q04 {
    public static void main(String[] args) {

        Car c;

        c = new Maruti();
        c.display();
        c.avg();
        c.model();

        System.out.println();

        c = new Santro();
        c.display();
        c.avg();
        c.model();
    }
}

