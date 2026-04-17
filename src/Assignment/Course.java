package Assignment;

import java.io.Serializable;
import java.util.*;

public class Course implements Serializable {
    String title;
    String code;
    int semester;
    Professor prof;
    int credit;
    List<Course> prerequisites = new ArrayList<>();
    String timing;
    String location;
    int maxCapacity;
    boolean dropDeadlinePassed;

    List<Student> enrolledStudents = new ArrayList<>();
    List<Feedback<Integer>> numericFeedback = new ArrayList<>();
    List<Feedback<String>> textualFeedback = new ArrayList<>();

    public Course(String title, String code, int semester, Professor prof, int credit, List<Course> prerequisites, String timing, String location) {
        this(title, code, semester, prof, credit, prerequisites, timing, location, 50, false);
    }

    public Course(String title, String code, int semester, Professor prof, int credit, List<Course> prerequisites, String timing, String location, int maxCapacity, boolean dropDeadlinePassed) {

        this.title = title;
        this.code = code;
        this.semester = semester;
        this.prof = prof;
        this.credit = credit;

        if (prerequisites != null)
            this.prerequisites = prerequisites;

        this.timing = timing;
        this.location = location;
        this.maxCapacity = maxCapacity;
        this.dropDeadlinePassed = dropDeadlinePassed;
    }

    public boolean isFull() {
        return enrolledStudents.size() >= maxCapacity;
    }

    public void addNumericFeedback(Student student, int rating) {
        numericFeedback.add(new Feedback<>(student, rating));
    }

    public void addTextFeedback(Student student, String comment) {
        textualFeedback.add(new Feedback<>(student, comment));
    }

    @Override
    public String toString() {
        List<String> prerequisiteCodes = new ArrayList<>();
        for (Course prerequisite : prerequisites) {
            prerequisiteCodes.add(prerequisite.code);
        }

        return "Title: " + title +
                "\nCode: " + code +
                "\nProfessor: " + (prof != null ? prof.getName() : "Unassigned") +
                "\nCredits: " + credit +
                "\nTiming: " + timing +
                "\nLocation: " + location +
                "\nEnrolled Students: " + enrolledStudents.size() +
                "\nMax Capacity: " + maxCapacity +
                "\nPrerequisites: " + (prerequisiteCodes.isEmpty() ? "None" : prerequisiteCodes);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course)) return false;
        Course c = (Course) o;
        return code.equals(c.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }
}
