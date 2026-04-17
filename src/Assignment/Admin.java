package Assignment;

import java.io.Serializable;
import java.util.*;

public class Admin extends User implements Serializable {

    static Scanner sc = new Scanner(System.in);

    public Admin(String emailID, String password, String name) {
        super(emailID, password, name);
    }

    public void addCourse() {
        System.out.print("Enter course Title: ");
        String title = sc.nextLine();

        System.out.print("Enter course Code: ");
        String code = sc.nextLine();

        System.out.print("Enter course Semester: ");
        int semester = Integer.parseInt(sc.nextLine());

        if (DataStore.professors.isEmpty()) {
            System.out.println("No professors available!");
            return;
        }

        System.out.println("Available Professors:");
        for (int i = 0; i < DataStore.professors.size(); i++) {
            System.out.println((i + 1) + ". " + DataStore.professors.get(i).getName());
        }

        System.out.print("Choose professor (index): ");
        int pIndex = Integer.parseInt(sc.nextLine()) - 1;

        if (pIndex < 0 || pIndex >= DataStore.professors.size()) {
            System.out.println("Invalid professor selection");
            return;
        }

        Professor prof = DataStore.professors.get(pIndex);

        System.out.print("Enter credits: ");
        int credit = Integer.parseInt(sc.nextLine());

        System.out.print("Enter timing (e.g., Mon-Wed 10AM): ");
        String timing = sc.nextLine();

        System.out.print("Enter location: ");
        String location = sc.nextLine();

        System.out.print("Enter max capacity: ");
        int maxCapacity = Integer.parseInt(sc.nextLine());

        List<Course> prerequisites = new ArrayList<>();

        System.out.println("Enter prerequisite course codes (comma separated, or 'none'): ");
        String input = sc.nextLine();

        if (!input.equalsIgnoreCase("none")) {
            String[] codes = input.split(",");

            for (String cCode : codes) {
                boolean found = false;

                for (Course c : DataStore.allCourses) {
                    if (c.code.equalsIgnoreCase(cCode.trim())) {
                        prerequisites.add(c);
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Warning: Course code '" + cCode.trim() + "' not found!");
                }
            }
        }

        Course newCourse = new Course(title, code, semester, prof, credit, prerequisites, timing, location, maxCapacity, false);
        DataStore.allCourses.add(newCourse);

        System.out.println("Course '" + title + "' added successfully under Professor " + prof.getName());
    }

    public void deleteCourse() {
        System.out.print("Enter course code to delete: ");
        String code = sc.next();

        for (int i = 0; i < DataStore.allCourses.size(); i++) {
            Course c = DataStore.allCourses.get(i);

            if (c.code.equals(code)) {
                for (Student s : DataStore.students) {
                    if (s.courseGrades.containsKey(c)) {
                        s.courseGrades.remove(c);
                        s.totalCredit -= c.credit;
                    }
                }

                for (Course course : DataStore.allCourses) {
                    course.prerequisites.remove(c);
                }

                for (TeachingAssistant ta : DataStore.teachingAssistants) {
                    ta.assignedCourses.remove(c);
                }

                DataStore.allCourses.remove(i);
                System.out.println("Course deleted successfully!");
                return;
            }
        }
        System.out.println("Course not found!");
    }

    public void viewAllCourses() {

        if (DataStore.allCourses.isEmpty()) {
            System.out.println("No courses available.");
            return;
        }

        for (Course c : DataStore.allCourses) {
            System.out.println(c);
            System.out.println("----------------------");
        }
    }

    public void resolveComplaint(Student s, int index) {

        if (s.complaints == null || s.complaints.isEmpty()) {
            System.out.println("No complaints found.");
            return;
        }

        if (index >= 0 && index < s.complaints.size()) {
            s.complaints.get(index).status = "Resolved";
            System.out.println("Complaint resolved.");
        } else {
            System.out.println("Invalid complaint index.");
        }
    }

    public void viewAllComplaints() {
        boolean found = false;

        for (Student s : DataStore.students) {
            for (Complaint c : s.complaints) {
                System.out.println("Student: " + s.getName());
                System.out.println(c);
                System.out.println("----------------------");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No complaints found.");
        }
    }

    public void filterComplaints(String status) {
        boolean found = false;

        for (Student s : DataStore.students) {
            for (Complaint c : s.complaints) {

                if (c.status.equalsIgnoreCase(status)) {
                    System.out.println("Student: " + s.getName());
                    System.out.println(c);
                    System.out.println("----------------------");
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No complaints with status: " + status);
        }
    }

    @Override
    public String toString() {
        return "Admin{" +
                "emailID='" + emailID + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Admin)) return false;
        Admin a = (Admin) o;
        return emailID.equals(a.emailID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(emailID);
    }
}
