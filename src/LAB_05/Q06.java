package LAB_05;

import java.util.Scanner;

class Student {

    // method to input name
    String inputName(String name) {
        return name;
    }

    // method to check average
    String average(int m1, int m2, int m3) {

        double avg = (m1 + m2 + m3) / 3.0;

        if(avg >= 50)
            return "Pass";
        else
            return "Fail";
    }
}

public class Q06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks of 3 exams: ");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();

        String studentName = s.inputName(name);
        String result = s.average(m1, m2, m3);

        System.out.println("Student Name: " + studentName);
        System.out.println("Result: " + result);
    }
}
