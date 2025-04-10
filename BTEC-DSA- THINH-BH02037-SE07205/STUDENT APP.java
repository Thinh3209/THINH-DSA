import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String id;
    String name;
    double point;

    public Student(String id, String name, double point) {
        this.id = id;
        this.name = name;
        this.point = point;
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Point: " + point);
    }
}

public class StudentManager {
    static ArrayList<Student> students = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void addStudent() {
        System.out.print("Enter ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Point: ");
        double point = Double.parseDouble(scanner.nextLine());
        students.add(new Student(id, name, point));
        System.out.println("Student added successfully.\n");
    }

    public static void editStudent() {
        System.out.print("Enter student ID to edit: ");
        String id = scanner.nextLine();
        for (Student s : students) {
            if (s.id.equals(id)) {
                System.out.print("Enter new name: ");
                s.name = scanner.nextLine();
                System.out.print("Enter new point: ");
                s.point = Double.parseDouble(scanner.nextLine());
                System.out.println("Student updated.\n");
                return;
            }
        }
        System.out.println("Student not found.\n");
    }

    public static void deleteStudent() {
        System.out.print("Enter student ID to delete: ");
        String id = scanner.nextLine();
        for (Student s : students) {
            if (s.id.equals(id)) {
                students.remove(s);
                System.out.println("Student deleted.\n");
                return;
            }
        }
        System.out.println("Student not found.\n");
    }

    public static void searchStudent() {
        System.out.print("Enter student ID to search: ");
        String id = scanner.nextLine();
        for (Student s : students) {
            if (s.id.equals(id)) {
                s.display();
                return;
            }
        }
        System.out.println("Student not found.\n");
    }

    public static void sortStudentsByPoint() {
        // Bubble Sort theo điểm
        for (int i = 0; i < students.size() - 1; i++) {
            for (int j = 0; j < students.size() - i - 1; j++) {
                if (students.get(j).point > students.get(j + 1).point) {
                    Student temp = students.get(j);
                    students.set(j, students.get(j + 1));
                    students.set(j + 1, temp);
                }
            }
        }
        System.out.println("Sorted by point successfully.\n");
    }

    public static void displayAll() {
        if (students.isEmpty()) {
            System.out.println("No students to display.\n");
            return;
        }
        System.out.println("=== Student List ===");
        for (Student s : students) {
            s.display();
        }
        System.out.println();
    }

    public static void menu() {
        int choice;
        do {
            System.out.println("===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Edit Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Search Student");
            System.out.println("5. Sort Students by Point");
            System.out.println("6. Display All Students");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> editStudent();
                case 3 -> deleteStudent();
                case 4 -> searchStudent();
                case 5 -> sortStudentsByPoint();
                case 6 -> displayAll();
                case 0 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice.\n");
            }
        } while (choice != 0);
    }

    public static void main(String[] args) {
        menu();
    }
}
