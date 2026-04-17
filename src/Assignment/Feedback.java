package Assignment;

import java.io.Serializable;

public class Feedback<T> implements Serializable {

    Student student;
    T value;

    public Feedback(Student student, T value) {
        this.student = student;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Student: " + student.getName() + " | Feedback: " + value;
    }
}
