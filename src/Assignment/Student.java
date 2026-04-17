package Assignment;

import java.io.Serializable;
import java.util.*;

public class Student extends User implements Serializable {

    int roll, semester, totalCredit;
    double cgpa;

    Map<Course, Character> courseGrades = new HashMap<>();
    List<Complaint> complaints = new ArrayList<>();

    public Student(String emailID, String password, String name, int roll, int semester, int totalCredit, char grade, double cgpa) {

        super(emailID, password, name);

        this.roll = roll;
        this.semester = semester;
        this.totalCredit = totalCredit;
        this.cgpa = cgpa;
    }

    public void viewCourses() {
        System.out.println("Available courses for semester " + this.semester);
        boolean found = false;

        for (Course c : DataStore.allCourses) {
            if (c.semester == this.semester && !courseGrades.containsKey(c)) {
                System.out.println(c);
                System.out.println("----------------------");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No courses available for registration.");
        }
    }

    public void viewCompletedCourses() {
        boolean found = false;

        for (Map.Entry<Course, Character> entry : courseGrades.entrySet()) {
            if (entry.getValue() != 'N') {
                Course c = entry.getKey();
                System.out.println("Title: " + c.title + " | Code: " + c.code + " | Grade: " + entry.getValue());
                found = true;
            }
        }

        if (!found) {
            System.out.println("No completed courses yet");
        }
    }

    public void registerCourse(Course course){
        try {
            if(course.semester != this.semester){
                System.out.println("This course is not available for your semester");
                return;
            }

            for (Course prerequisite : course.prerequisites) {
                Character grade = courseGrades.get(prerequisite);
                if (grade == null || grade == 'N' || grade == 'F') {
                    System.out.println("Prerequisite not satisfied: " + prerequisite.code);
                    return;
                }
            }

            if(this.totalCredit + course.credit > 20){
                System.out.println("Credit limit exceeded");
                return;
            }

            if (courseGrades.containsKey(course)) {
                System.out.println("Already registered");
                return;
            }

            if (course.isFull()) {
                throw new CourseFullException("Course is already full");
            }

            courseGrades.put(course, 'N');
            course.enrolledStudents.add(this);

            this.totalCredit += course.credit;

            System.out.println("Course registered successfully: " + course.title);
        } catch (CourseFullException e) {
            System.out.println(e.getMessage());
        }
    }

    public void dropCourse(Course course){
        try {
            if (!courseGrades.containsKey(course)) {
                System.out.println("You are not registered in this course");
                return;
            }

            if (course.dropDeadlinePassed) {
                throw new DropDeadlinePassedException("Drop deadline has already passed for this course");
            }

            courseGrades.remove(course);
            course.enrolledStudents.remove(this);

            this.totalCredit -= course.credit;

            System.out.println("Course dropped: " + course.title);
        } catch (DropDeadlinePassedException e) {
            System.out.println(e.getMessage());
        }
    }

    public void viewSchedule(){
        for(Course c : courseGrades.keySet()){
            System.out.print(
                    "Title: " + c.title +
                            "\nCode: " + c.code +
                            "\nProfessor: " + c.prof +
                            "\nTiming: " + c.timing +
                            "\nLocation: " + c.location
            );
            System.out.println("\n----------------------");
        }
    }

    public void viewAcademicProgress() {
        System.out.println("----- Academic Progress -----");

        for (Map.Entry<Course, Character> entry : courseGrades.entrySet()) {
            Course c = entry.getKey();
            char grade = entry.getValue();

            System.out.println("Course: " + c.title +
                    " | Grade: " + grade +
                    " | Credits: " + c.credit);
        }

        System.out.println("----------------------------");
        System.out.println("CGPA: " + calculateCGPA());
    }

    private double getGradePoint(char grade) {
        switch (grade) {
            case 'A': return 10;
            case 'B': return 8;
            case 'C': return 6;
            case 'D': return 4;
            case 'F': return 0;
            default: return 0;
        }
    }

    public double calculateCGPA() {

        double totalPoints = 0;
        int totalCredits = 0;

        for (Map.Entry<Course, Character> entry : courseGrades.entrySet()) {

            Course c = entry.getKey();
            char grade = entry.getValue();

            if (grade != 'N') {
                double gp = getGradePoint(grade);
                totalPoints += gp * c.credit;
                totalCredits += c.credit;
            }
        }

        if (totalCredits == 0) return 0;

        return totalPoints / totalCredits;
    }

    public void submitComplaint(String description) {
        Complaint c = new Complaint(description);
        complaints.add(c);
        System.out.println("Complaint submitted successfully!");
    }

    public void viewComplaints() {
        if (complaints.isEmpty()) {
            System.out.println("No complaints submitted.");
            return;
        }

        for (Complaint c : complaints) {
            System.out.println(c);
            System.out.println("----------------------");
        }
    }

    public void submitCourseFeedback(Course course, Integer rating, String comment) {
        if (!courseGrades.containsKey(course) || courseGrades.get(course) == 'N') {
            System.out.println("You can give feedback only for completed courses.");
            return;
        }

        if (rating != null && (rating < 1 || rating > 5)) {
            System.out.println("Rating should be between 1 and 5.");
            return;
        }

        if (rating == null && (comment == null || comment.trim().isEmpty())) {
            System.out.println("Please provide at least a rating or a comment.");
            return;
        }

        if (rating != null) {
            course.addNumericFeedback(this, rating);
        }

        if (comment != null && !comment.trim().isEmpty()) {
            course.addTextFeedback(this, comment);
        }

        System.out.println("Feedback submitted successfully!");
    }

    @Override
    public String toString() {
        return "Name: " + name +
                "\nRoll: " + roll +
                "\nSemester: " + semester +
                "\nCGPA: " + calculateCGPA();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student s = (Student) o;
        return roll == s.roll;
    }

    @Override
    public int hashCode() {
        return Objects.hash(roll);
    }
}
