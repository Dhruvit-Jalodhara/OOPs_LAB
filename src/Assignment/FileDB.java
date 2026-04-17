package Assignment;

import java.io.*;
import java.util.List;

public class FileDB {

    private static final String FILE = "data.ser";

    public static void saveData() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE))) {

            oos.writeObject(DataStore.students);
            oos.writeObject(DataStore.teachingAssistants);
            oos.writeObject(DataStore.professors);
            oos.writeObject(DataStore.admins);
            oos.writeObject(DataStore.allCourses);

            System.out.println("Data Saved!");

        } catch (Exception e) {
            System.out.println("Error saving data");
        }
    }

    public static void loadData() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE))) {

            DataStore.students = (List<Student>) ois.readObject();
            DataStore.teachingAssistants = (List<TeachingAssistant>) ois.readObject();
            DataStore.professors = (List<Professor>) ois.readObject();
            DataStore.admins = (List<Admin>) ois.readObject();
            DataStore.allCourses = (List<Course>) ois.readObject();

            if (isDataMissing()) {
                System.out.println("Saved data is empty or incomplete. Reinitializing sample data.");
                DataStore.initializeSampleData();
                saveData();
            } else {
                System.out.println("Data Loaded!");
            }

        } catch (Exception e) {
            System.out.println("No previous data found.");
            DataStore.initializeSampleData();
            saveData();
            System.out.println("Sample data initialized.");
        }

        printDataSummary();
    }

    private static boolean isDataMissing() {
        return DataStore.students == null || DataStore.students.isEmpty() || DataStore.teachingAssistants == null || DataStore.teachingAssistants.isEmpty() || DataStore.professors == null || DataStore.professors.isEmpty() || DataStore.admins == null || DataStore.admins.isEmpty() || DataStore.allCourses == null || DataStore.allCourses.isEmpty();
    }

    private static void printDataSummary() {
        System.out.println("Loaded Users -> Students: " + DataStore.students.size() + ", TAs: " + DataStore.teachingAssistants.size() + ", Professors: " + DataStore.professors.size() + ", Admins: " + DataStore.admins.size() + ", Courses: " + DataStore.allCourses.size() );
    }
}
