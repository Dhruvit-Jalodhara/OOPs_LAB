package Assignment;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TeachingAssistant extends Student implements Serializable {

    Professor supervisor;
    List<Course> assignedCourses = new ArrayList<>();

    public TeachingAssistant(String emailID, String password, String name, int roll, int semester, int totalCredit, char grade, double cgpa, Professor supervisor) {
        super(emailID, password, name, roll, semester, totalCredit, grade, cgpa);
        this.supervisor = supervisor;
    }

    public void assignCourse(Course course) {
        if (!assignedCourses.contains(course)) {
            assignedCourses.add(course);
        }
    }

    public void viewAssignedCourses() {
        if (assignedCourses.isEmpty()) {
            System.out.println("No courses assigned for TA duty.");
            return;
        }

        for (Course course : assignedCourses) {
            System.out.println(course);
            System.out.println("----------------------");
        }
    }

    public void viewStudentsInAssignedCourse(String code) {
        for (Course course : assignedCourses) {
            if (course.code.equalsIgnoreCase(code)) {
                if (course.enrolledStudents.isEmpty()) {
                    System.out.println("No students enrolled.");
                    return;
                }

                for (Student student : course.enrolledStudents) {
                    System.out.println(student);
                    System.out.println("----------------------");
                }
                return;
            }
        }

        System.out.println("Course not assigned to you for TA duty.");
    }

    public void assistGrade(Student student, Course course, char grade) {
        if (!assignedCourses.contains(course)) {
            System.out.println("Course not assigned to you for TA duty.");
            return;
        }

        if (!course.enrolledStudents.contains(student)) {
            System.out.println("Student not enrolled in this course");
            return;
        }

        student.courseGrades.put(course, grade);
        System.out.println("Grade updated successfully by TA.");
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nRole: Teaching Assistant" +
                "\nSupervisor: " + (supervisor != null ? supervisor.getName() : "Not assigned");
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof TeachingAssistant)) return false;
        if (!super.equals(o)) return false;
        TeachingAssistant that = (TeachingAssistant) o;
        return Objects.equals(supervisor, that.supervisor) && Objects.equals(assignedCourses, that.assignedCourses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), supervisor, assignedCourses);
    }
}
