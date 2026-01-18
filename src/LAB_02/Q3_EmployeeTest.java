package LAB_02;

public class Q3_EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("Amit", "Shah", 30000);
        Employee e2 = new Employee("Ravi", "Patel", 40000);

        System.out.println(e1.getYearlySalary());
        System.out.println(e2.getYearlySalary());

        e1.hike();
        e2.hike();

        System.out.println(e1.getYearlySalary());
        System.out.println(e2.getYearlySalary());
    }
}

class Employee {
    private String name;
    private String lastName;
    private double salary;

    public Employee(String n, String l, double s) {
        name = n;
        lastName = l;
        if (s > 0)
            salary = s;
    }

    public double getYearlySalary() {
        return salary * 12;
    }

    public void hike() {
        salary = salary + salary * 0.10;
    }
}

