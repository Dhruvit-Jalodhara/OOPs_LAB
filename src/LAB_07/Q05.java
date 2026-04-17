package LAB_07;


abstract class BaseClass {

    protected String className;
    public BaseClass(String className) {
        this.className = className;
    }

    public void debug(String message) {
        try {
            if (message == null) {
                throw new Exception("Message cannot be null");
            }
            System.out.println("[" + className + " DEBUG]: " + message);
        } catch (Exception e) {
            System.out.println("Debug Error: " + e.getMessage());
        }
    }

    abstract void execute();
}

class Student2 extends BaseClass {

    public Student2() {
        super("Student");
    }


    void execute() {
        debug("Execution started");
        System.out.println("Student is performing task");
    }
}

class Teacher2 extends BaseClass {

    public Teacher2() {
        super("Teacher");
    }

    @Override
    void execute() {
        debug("Execution started");
        System.out.println("Teacher is performing task");
    }
}

// Main Class
public class Q05 {
    public static void main(String[] args) {

        Student2 s = new Student2();
        Teacher2 t = new Teacher2();

        s.execute();
        t.execute();

        s.debug(null);
    }
}
