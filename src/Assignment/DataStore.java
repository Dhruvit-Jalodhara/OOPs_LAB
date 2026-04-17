package Assignment;

import java.util.*;

public class DataStore {
    public static List<Student> students = new ArrayList<>();
    public static List<TeachingAssistant> teachingAssistants = new ArrayList<>();
    public static List<Professor> professors = new ArrayList<>();
    public static List<Admin> admins = new ArrayList<>();
    public static List<Course> allCourses = new ArrayList<>();

    public static void initializeSampleData() {
        students = new ArrayList<>();
        teachingAssistants = new ArrayList<>();
        professors = new ArrayList<>();
        admins = new ArrayList<>();
        allCourses = new ArrayList<>();

        Professor p1 = new Professor("anita.sharma@svnit.ac.in", "prof123", "Dr. Anita Sharma");
        Professor p2 = new Professor("rahul.mehta@svnit.ac.in", "prof123", "Dr. Rahul Mehta");
        Professor p3 = new Professor("kavita.iyer@svnit.ac.in", "prof123", "Dr. Kavita Iyer");
        Professor p4 = new Professor("arjun.verma@svnit.ac.in", "prof123", "Dr. Arjun Verma");
        Professor p5 = new Professor("neha.kapoor@svnit.ac.in", "prof123", "Dr. Neha Kapoor");

        professors.add(p1);
        professors.add(p2);
        professors.add(p3);
        professors.add(p4);
        professors.add(p5);

        Admin a1 = new Admin("admin1@svnit.ac.in", "admin123", "System Admin");
        Admin a2 = new Admin("admin2@svnit.ac.in", "admin123", "Academic Admin");

        admins.add(a1);
        admins.add(a2);

        Course c1 = new Course("Programming Fundamentals", "CSE101", 1, p1, 4, new ArrayList<>(), "Mon-Wed 09:00", "Room A-101", 5, false);
        Course c2 = new Course("Discrete Mathematics", "MAT101", 1, p2, 4, new ArrayList<>(), "Tue-Thu 10:00", "Room B-201", 2, false);
        Course c3 = new Course("Data Structures", "CSE201", 2, p3, 4, new ArrayList<>(Collections.singletonList(c1)), "Mon-Wed 11:00", "Lab C-301", 5, false);
        Course c4 = new Course("Database Systems", "CSE202", 2, p4, 4, new ArrayList<>(Collections.singletonList(c1)), "Tue-Thu 12:00", "Room D-110", 5, false);
        Course c5 = new Course("Computer Networks", "CSE301", 3, p5, 3, new ArrayList<>(Collections.singletonList(c3)), "Fri 14:00", "Room E-210", 5, true);

        allCourses.add(c1);
        allCourses.add(c2);
        allCourses.add(c3);
        allCourses.add(c4);
        allCourses.add(c5);

        Student s1 = new Student("aman.singh@svnit.ac.in", "stud123", "Aman Singh", 101, 1, 0, 'A', 0.0);
        TeachingAssistant s2 = new TeachingAssistant("priya.nair@svnit.ac.in", "stud123", "Priya Nair", 102, 1, 0, 'A', 0.0, p1);
        Student s3 = new Student("rohan.gupta@svnit.ac.in", "stud123", "Rohan Gupta", 201, 2, 0, 'A', 0.0);
        Student s4 = new Student("isha.patel@svnit.ac.in", "stud123", "Isha Patel", 202, 2, 0, 'A', 0.0);
        Student s5 = new Student("vikram.joshi@svnit.ac.in", "stud123", "Vikram Joshi", 301, 3, 0, 'A', 0.0);

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        teachingAssistants.add(s2);

        enrollStudent(s1, c1, 'N');
        enrollStudent(s1, c2, 'N');

        enrollStudent(s2, c1, 'N');
        enrollStudent(s2, c2, 'N');

        enrollStudent(s3, c1, 'A');
        enrollStudent(s3, c3, 'N');

        enrollStudent(s4, c1, 'B');
        enrollStudent(s4, c4, 'N');

        enrollStudent(s5, c1, 'A');
        enrollStudent(s5, c3, 'B');
        enrollStudent(s5, c5, 'N');

        s2.assignCourse(c1);
        s2.assignCourse(c2);

        s1.complaints.add(new Complaint("Need clarification about course registration."));
        s3.complaints.add(new Complaint("Lab system is not working properly."));
    }

    private static void enrollStudent(Student student, Course course, char grade) {
        student.courseGrades.put(course, grade);
        course.enrolledStudents.add(student);
        student.totalCredit += course.credit;
    }
}
