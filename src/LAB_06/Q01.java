package LAB_06;

class Animal {

    String name = "Animal";

}

class Dog extends Animal {

    String name = "Dog";

    void display() {

        System.out.println("Name in subclass: " + name);
        System.out.println("Name in superclass: " + super.name);

    }
}

public class Q01 {
    public static void main(String args[]) {

        Dog d = new Dog();
        d.display();

        Student s = new Student();

    }
}

class Person {

    Person() {
        System.out.println("Person Constructor Called");
    }

}

class Student extends Person {

    Student() {
        super();   // calling superclass constructor
        System.out.println("Student Constructor Called");
    }

}
