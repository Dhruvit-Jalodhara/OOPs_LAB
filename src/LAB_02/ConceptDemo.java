package LAB_02;

class ConceptDemo {

    // Static variable: shared among all objects of the class
    static int count;

    // Static Initialization Block (SIB)
    // Executes ONLY ONCE when the class is loaded into memory
    static {
        count = 10; // initializing static variable
        System.out.println("Static block executed");
    }

    // Instance Initialization Block (IIB)
    // Executes EVERY TIME an object is created
    // Runs BEFORE the constructor
    {
        System.out.println("Instance block executed");
    }

    // Constructor
    // Executes after the instance initialization block
    ConceptDemo() {
        System.out.println("Constructor executed");
    }

    // Static method
    // Can access only static members
    static void showCount() {
        System.out.println("Count = " + count);
    }

    public static void main(String[] args) {

        // Wrapper class example
        // Integer is a wrapper class for primitive int
        // valueOf() returns an Integer object
        Integer x = Integer.valueOf(5);

        // Creating object of ConceptDemo class
        // This triggers:
        // 1. Instance Initialization Block
        // 2. Constructor
        ConceptDemo obj = new ConceptDemo();

        // Calling static method
        showCount();

        // Printing wrapper object value
        System.out.println("Wrapper value = " + x);
    }
}


