package LAB_07;


class Vehicle{
    int horsePower;
    double weight;
    Vehicle(int horsePower,double weight){
        this.horsePower=horsePower;
        this.weight=weight;
    }
}

class Car extends Vehicle{
    Car(int horsePower,double weight){
        super(horsePower, weight);

    }
    void maxSpeed(){
        System.out.println("The maximum speed of car is"+(horsePower*100)/weight);
    }
}

class Bicycle extends Vehicle{
    Bicycle(int horsePower,double weight){
        super(horsePower, weight);
    }
    void maxSpeed(){
        System.out.println("The maximum speed of bicycle is"+(horsePower*100)/weight);
    }
}

class Scooter extends Vehicle{
    Scooter(int horsePower,double weight){
        super(horsePower, weight);
    }
    void maxSpeed(){
        System.out.println("The maximum speed of scooter is"+(horsePower*100)/weight);
    }
}

public class Q02 {
    public static void main(String[] args) {
        Car c1=new Car(850, 1000);
        c1.maxSpeed();
        Bicycle b1=new Bicycle(5, 100);
        b1.maxSpeed();
        Scooter s1=new Scooter(300, 700);
        s1.maxSpeed();
    }
}
