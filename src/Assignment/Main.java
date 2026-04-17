package Assignment;

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        FileDB.loadData();

        while (true) {
            System.out.println("\n===== University Course Registration System =====");
            System.out.println("1. Enter Application");
            System.out.println("2. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    User user = AuthService.login();

                    if (user != null) {
                        if (user instanceof TeachingAssistant) {
                            taMenu((TeachingAssistant) user);
                        } else if (user instanceof Student) {
                            studentMenu((Student) user);
                        } else if (user instanceof Professor) {
                            professorMenu((Professor) user);
                        } else if (user instanceof Admin) {
                            adminMenu((Admin) user);
                        }
                    }
                    break;

                case 2:
                    FileDB.saveData();
                    System.out.println("Exiting application... ");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    public static void studentMenu(Student s) {
        while (true) {
            System.out.println("\n===== Student Menu =====");
            System.out.println("1. View Available Courses");
            System.out.println("2. Register Course");
            System.out.println("3. Drop Course");
            System.out.println("4. View Schedule");
            System.out.println("5. Academic Progress");
            System.out.println("6. Submit Complaint");
            System.out.println("7. View Complaints");
            System.out.println("8. Give Course Feedback");
            System.out.println("9. Logout");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    s.viewCourses();
                    break;

                case 2:
                    System.out.print("Enter course code: ");
                    String code = sc.next();
                    Course course = findCourse(code);
                    if (course != null) s.registerCourse(course);
                    else System.out.println("Course not found!");
                    break;

                case 3:
                    System.out.print("Enter course code: ");
                    code = sc.next();
                    course = findCourse(code);
                    if (course != null) s.dropCourse(course);
                    else System.out.println("Course not found!");
                    break;

                case 4:
                    s.viewSchedule();
                    break;

                case 5:
                    s.viewAcademicProgress();
                    break;

                case 6:
                    sc.nextLine();
                    System.out.print("Enter complaint: ");
                    String desc = sc.nextLine();
                    s.submitComplaint(desc);
                    break;

                case 7:
                    s.viewComplaints();
                    break;

                case 8:
                    System.out.print("Enter completed course code: ");
                    code = sc.next();
                    course = findCourse(code);

                    if (course != null) {
                        System.out.print("Enter rating (1-5, enter 0 to skip): ");
                        int rating = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter comment (leave blank to skip): ");
                        String comment = sc.nextLine();
                        s.submitCourseFeedback(course, rating == 0 ? null : rating, comment);
                    } else {
                        System.out.println("Course not found!");
                    }
                    break;

                case 9:
                    System.out.println("Logging out...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    public static void professorMenu(Professor p) {
        while (true) {
            System.out.println("\n===== Professor Menu =====");
            System.out.println("1. View My Courses");
            System.out.println("2. Update Course");
            System.out.println("3. View Enrolled Students");
            System.out.println("4. Assign Grade");
            System.out.println("5. View Course Feedback");
            System.out.println("6. Logout");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    p.viewMyCourses();
                    break;

                case 2:
                    System.out.print("Enter course code: ");
                    String code = sc.next();
                    p.updateCourse(code);
                    break;

                case 3:
                    System.out.print("Enter course code: ");
                    code = sc.next();
                    p.viewEnrolledStudents(code);
                    break;

                case 4:
                    System.out.print("Enter course code: ");
                    code = sc.next();
                    Course c = findCourse(code);

                    System.out.print("Enter student roll: ");
                    int roll = sc.nextInt();

                    Student student = findStudent(roll);

                    System.out.print("Enter grade (A/B/C/D/F): ");
                    char grade = sc.next().charAt(0);

                    if (c != null && student != null) {
                        p.assignGrade(student, c, grade);
                    } else {
                        System.out.println("Invalid course or student!");
                    }
                    break;

                case 5:
                    System.out.print("Enter course code: ");
                    code = sc.next();
                    p.viewCourseFeedback(code);
                    break;

                case 6:
                    System.out.println("Logging out...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    public static void adminMenu(Admin a) {
        while (true) {
            System.out.println("\n===== Admin Menu =====");
            System.out.println("1. Add Course");
            System.out.println("2. Delete Course");
            System.out.println("3. View All Courses");
            System.out.println("4. View Complaints");
            System.out.println("5. Filter Complaints");
            System.out.println("6. Resolve Complaint");
            System.out.println("7. Logout");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sc.nextLine();
                    a.addCourse();
                    break;

                case 2:
                    a.deleteCourse();
                    break;

                case 3:
                    a.viewAllCourses();
                    break;

                case 4:
                    a.viewAllComplaints();
                    break;

                case 5:
                    System.out.print("Enter status (Pending/Resolved): ");
                    String status = sc.next();
                    a.filterComplaints(status);
                    break;

                case 6:
                    System.out.print("Enter student roll: ");
                    int roll = sc.nextInt();
                    Student s = findStudent(roll);

                    if (s != null) {
                        System.out.print("Enter complaint index: ");
                        int index = sc.nextInt();
                        a.resolveComplaint(s, index);
                    } else {
                        System.out.println("Student not found!");
                    }
                    break;

                case 7:
                    System.out.println("Logging out... ");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    public static void taMenu(TeachingAssistant ta) {
        while (true) {
            System.out.println("\n===== Teaching Assistant Menu =====");
            System.out.println("1. View Available Courses");
            System.out.println("2. Register Course");
            System.out.println("3. Drop Course");
            System.out.println("4. View Schedule");
            System.out.println("5. Academic Progress");
            System.out.println("6. Submit Complaint");
            System.out.println("7. View Complaints");
            System.out.println("8. Give Course Feedback");
            System.out.println("9. View Assigned Courses");
            System.out.println("10. View Students In Assigned Course");
            System.out.println("11. Assign Grade");
            System.out.println("12. Logout");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    ta.viewCourses();
                    break;
                case 2:
                    System.out.print("Enter course code: ");
                    String code = sc.next();
                    Course course = findCourse(code);
                    if (course != null) ta.registerCourse(course);
                    else System.out.println("Course not found!");
                    break;
                case 3:
                    System.out.print("Enter course code: ");
                    code = sc.next();
                    course = findCourse(code);
                    if (course != null) ta.dropCourse(course);
                    else System.out.println("Course not found!");
                    break;
                case 4:
                    ta.viewSchedule();
                    break;
                case 5:
                    ta.viewAcademicProgress();
                    break;
                case 6:
                    sc.nextLine();
                    System.out.print("Enter complaint: ");
                    String desc = sc.nextLine();
                    ta.submitComplaint(desc);
                    break;
                case 7:
                    ta.viewComplaints();
                    break;
                case 8:
                    System.out.print("Enter completed course code: ");
                    code = sc.next();
                    course = findCourse(code);

                    if (course != null) {
                        System.out.print("Enter rating (1-5, enter 0 to skip): ");
                        int rating = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter comment (leave blank to skip): ");
                        String comment = sc.nextLine();
                        ta.submitCourseFeedback(course, rating == 0 ? null : rating, comment);
                    } else {
                        System.out.println("Course not found!");
                    }
                    break;
                case 9:
                    ta.viewAssignedCourses();
                    break;
                case 10:
                    System.out.print("Enter course code: ");
                    code = sc.next();
                    ta.viewStudentsInAssignedCourse(code);
                    break;
                case 11:
                    System.out.print("Enter course code: ");
                    code = sc.next();
                    Course c = findCourse(code);

                    System.out.print("Enter student roll: ");
                    int roll = sc.nextInt();
                    Student student = findStudent(roll);

                    System.out.print("Enter grade (A/B/C/D/F): ");
                    char grade = sc.next().charAt(0);

                    if (c != null && student != null) {
                        ta.assistGrade(student, c, grade);
                    } else {
                        System.out.println("Invalid course or student!");
                    }
                    break;
                case 12:
                    System.out.println("Logging out...");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    public static Course findCourse(String code) {
        for (Course c : DataStore.allCourses) {
            if (c.code.equalsIgnoreCase(code)) {
                return c;
            }
        }
        return null;
    }

    public static Student findStudent(int roll) {
        for (Student s : DataStore.students) {
            if (s.roll == roll) {
                return s;
            }
        }
        return null;
    }
}
