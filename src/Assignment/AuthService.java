package Assignment;

import java.util.*;

public class AuthService {
    static Scanner sc = new Scanner(System.in);

    public static User login() {
        System.out.println("Login as:\n1. Student\n2. Professor\n3. Admin\n4. Teaching Assistant");

        int choice = sc.nextInt();

        System.out.print("Enter email: ");
        String email = sc.next();

        System.out.print("Enter password: ");
        String password = sc.next();

        try {
            switch (choice) {
                case 1:
                    return handleLogin(DataStore.students, email, password, "Student");
                case 2:
                    return handleLogin(DataStore.professors, email, password, "Professor");
                case 3:
                    return handleLogin(DataStore.admins, email, password, "Admin");
                case 4:
                    return handleLogin(DataStore.teachingAssistants, email, password, "Teaching Assistant");
                default:
                    System.out.println("Invalid choice");
                    return null;
            }
        } catch (InvalidLoginException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    private static <T extends User> T handleLogin(List<T> users, String email, String password, String role) throws InvalidLoginException {

        for (T user : users) {
            if (user.getEmailID().equals(email)) {

                if (user.getPassword().equals(password)) {
                    System.out.println("Welcome " + role + " " + user.getName());
                    return user;
                } else {
                    throw new InvalidLoginException("Incorrect password!");
                }
            }
        }

        try {
            throw new InvalidLoginException(role + " not found!");
        } catch (InvalidLoginException e) {
            System.out.println(e.getMessage());
            if (askForSignup()) {
                signUp(role);
            }
        }

        return null;
    }

    private static boolean askForSignup() {
        System.out.print("Create account? (yes/no): ");
        return sc.next().equalsIgnoreCase("yes");
    }

    private static void signUp(String role) {
        switch (role) {
            case "Student":
                studentSignUp();
                break;
            case "Professor":
                professorSignUp();
                break;
            case "Admin":
                adminSignUp();
                break;
            case "Teaching Assistant":
                taSignUp();
                break;
        }
    }

    private static void studentSignUp() {
        System.out.print("Email: ");
        String email = sc.next();

        if (emailExists(email)) {
            System.out.println("An account with this email already exists.");
            return;
        }

        System.out.print("Password: ");
        String password = sc.next();

        sc.nextLine();
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Roll: ");
        int roll = sc.nextInt();

        if (rollExists(roll)) {
            System.out.println("A student with this roll number already exists.");
            return;
        }

        DataStore.students.add(
                new Student(email, password, name, roll, 1, 0, 'A', 0.0)
        );

        System.out.println("Student registered!");
    }

    private static void professorSignUp() {
        System.out.print("Email: ");
        String email = sc.next();

        if (emailExists(email)) {
            System.out.println("An account with this email already exists.");
            return;
        }

        System.out.print("Password: ");
        String password = sc.next();

        sc.nextLine();
        System.out.print("Name: ");
        String name = sc.nextLine();

        DataStore.professors.add(new Professor(email, password, name));

        System.out.println("Professor registered!");
    }

    private static void adminSignUp() {
        System.out.print("Email: ");
        String email = sc.next();

        if (emailExists(email)) {
            System.out.println("An account with this email already exists.");
            return;
        }

        System.out.print("Password: ");
        String password = sc.next();

        sc.nextLine();
        System.out.print("Name: ");
        String name = sc.nextLine();

        DataStore.admins.add(new Admin(email, password, name));

        System.out.println("Admin registered!");
    }

    private static void taSignUp() {
        System.out.print("Email: ");
        String email = sc.next();

        if (emailExists(email)) {
            System.out.println("An account with this email already exists.");
            return;
        }

        System.out.print("Password: ");
        String password = sc.next();

        sc.nextLine();
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Roll: ");
        int roll = sc.nextInt();

        if (rollExists(roll)) {
            System.out.println("A student with this roll number already exists.");
            return;
        }

        if (DataStore.professors.isEmpty()) {
            System.out.println("No professors available for TA supervision.");
            return;
        }

        System.out.println("Choose supervisor professor:");
        for (int i = 0; i < DataStore.professors.size(); i++) {
            System.out.println((i + 1) + ". " + DataStore.professors.get(i).getName());
        }

        int index = sc.nextInt() - 1;

        if (index < 0 || index >= DataStore.professors.size()) {
            System.out.println("Invalid professor selection.");
            return;
        }

        TeachingAssistant ta = new TeachingAssistant(email, password, name, roll, 1, 0, 'A', 0.0, DataStore.professors.get(index));
        DataStore.teachingAssistants.add(ta);
        DataStore.students.add(ta);

        System.out.println("Teaching Assistant registered!");
    }

    private static boolean emailExists(String email) {
        for (Student student : DataStore.students) {
            if (student.getEmailID().equalsIgnoreCase(email)) {
                return true;
            }
        }

        for (Professor professor : DataStore.professors) {
            if (professor.getEmailID().equalsIgnoreCase(email)) {
                return true;
            }
        }

        for (Admin admin : DataStore.admins) {
            if (admin.getEmailID().equalsIgnoreCase(email)) {
                return true;
            }
        }

        return false;
    }

    private static boolean rollExists(int roll) {
        for (Student student : DataStore.students) {
            if (student.roll == roll) {
                return true;
            }
        }

        return false;
    }
}
