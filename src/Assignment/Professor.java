package Assignment;

import java.io.Serializable;
import java.util.*;

public class Professor extends User implements Serializable {

    static Scanner sc = new Scanner(System.in);

    public Professor(String emailID, String password, String name) {
        super(emailID, password, name);
    }

    public void viewMyCourses() {
        boolean found = false;

        for (Course c : DataStore.allCourses) {
            if (c.prof == this) {
                System.out.println(c);
                System.out.println("----------------------");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No courses assigned.");
        }
    }

    public void updateCourse(String code) {

        for (Course c : DataStore.allCourses) {

            if (c.code.equals(code) && c.prof == this) {

                System.out.println("Updating course: " + c.title);

                System.out.println("1. Update Timing");
                System.out.println("2. Update Credits");
                System.out.println("3. Update Location");
                System.out.println("4. Update Prerequisites");

                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter new timing: ");
                        sc.nextLine();
                        c.timing = sc.nextLine();
                        break;

                    case 2:
                        System.out.print("Enter new credits: ");
                        c.credit = sc.nextInt();
                        break;

                    case 3:
                        sc.nextLine();
                        System.out.print("Enter new location: ");
                        c.location = sc.nextLine();
                        break;

                    case 4:
                        System.out.println("Enter prerequisite course codes (comma separated): ");
                        sc.nextLine();
                        String input = sc.nextLine();

                        List<Course> newPrereq = new ArrayList<>();

                        for (String s : input.split(",")) {
                            for (Course course : DataStore.allCourses) {
                                if (course.code.equals(s.trim())) {
                                    newPrereq.add(course);
                                }
                            }
                        }

                        c.prerequisites = newPrereq;
                        break;

                    default:
                        System.out.println("Invalid choice");
                }

                System.out.println("Course updated successfully!");
                return;
            }
        }

        System.out.println("Course not found or not assigned to you.");
    }

    public void viewEnrolledStudents(String courseCode) {

        for (Course c : DataStore.allCourses) {

            if (c.code.equals(courseCode) && c.prof == this) {

                if (c.enrolledStudents.isEmpty()) {
                    System.out.println("No students enrolled.");
                    return;
                }

                for (Student s : c.enrolledStudents) {
                    System.out.println(s);
                    System.out.println("----------------------");
                }
                return;
            }
        }

        System.out.println("Course not found or not assigned to you.");
    }

    public void assignGrade(Student s, Course course, char grade) {

        if (course.prof != this) {
            System.out.println("You are not assigned to this course");
            return;
        }

        if (!course.enrolledStudents.contains(s)) {
            System.out.println("Student not enrolled in this course");
            return;
        }

        if (!s.courseGrades.containsKey(course)) {
            System.out.println("Invalid course");
            return;
        }

        s.courseGrades.put(course, grade);

        System.out.println("Grade assigned successfully");
    }

    public void viewCourseFeedback(String courseCode) {
        for (Course course : DataStore.allCourses) {
            if (course.code.equalsIgnoreCase(courseCode) && course.prof == this) {
                System.out.println("----- Numeric Feedback -----");
                if (course.numericFeedback.isEmpty()) {
                    System.out.println("No numeric feedback available.");
                } else {
                    for (Feedback<Integer> feedback : course.numericFeedback) {
                        System.out.println(feedback);
                    }
                }

                System.out.println("----- Text Feedback -----");
                if (course.textualFeedback.isEmpty()) {
                    System.out.println("No textual feedback available.");
                } else {
                    for (Feedback<String> feedback : course.textualFeedback) {
                        System.out.println(feedback);
                    }
                }
                return;
            }
        }

        System.out.println("Course not found or not assigned to you.");
    }

    @Override
    public String toString() {

        String result = "Professor Name: " + name +
                "\nEmail: " + emailID +
                "\nCourses Teaching:\n";

        boolean found = false;

        for (Course c : DataStore.allCourses) {
            if (c.prof == this) {
                result += " - " + c.title + " (" + c.code + ")\n";
                found = true;
            }
        }

        if (!found) {
            result += " No courses assigned\n";
        }

        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Professor)) return false;
        Professor p = (Professor) o;
        return emailID.equals(p.emailID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(emailID);
    }
}
