package LAB_02;

public class Q3_EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("Amit", "Shah", 30000);
        Employee e2 = new Employee("Ravi", "Patel", 40000);

        System.out.println(e1.getYearlySalary());
        System.out.println(e2.getYearlySalary());

        e1.giveHike();
        e2.giveHike();

        System.out.println(e1.getYearlySalary());
        System.out.println(e2.getYearlySalary());
    }
}

class Employee {

    private String name;
    private String lastName;
    private double monthlySalary;

    // Constructor
    public Employee(String name, String lastName, double monthlySalary) {

        this.name = name;
        this.lastName = lastName;

        if(monthlySalary > 0)
            this.monthlySalary = monthlySalary;
    }

    // Set methods
    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMonthlySalary(double monthlySalary) {
        if(monthlySalary > 0)
            this.monthlySalary = monthlySalary;
    }

    // Get methods
    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    public void giveHike() {
        monthlySalary = monthlySalary + (monthlySalary * 0.10);
    }
}

