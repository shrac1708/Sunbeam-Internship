package assign4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManageStudent {

    private static final String FILE_NAME = "students.dat";
    private static List<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        loadStudentsFromFile();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Student Management Menu");
            System.out.println("1. Retrieve student details");
            System.out.println("2. Display all student details");
            System.out.println("3. Admit new student");
            System.out.println("4. Cancel admission");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    retrieveStudentDetails(sc);
                    break;
                case 2:
                    displayAllStudents();
                    break;
                case 3:
                    admitNewStudent(sc);
                    break;
                case 4:
                    cancelAdmission(sc);
                    break;
                case 5:
                    exitProgram();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void retrieveStudentDetails(Scanner scanner) {
        System.out.print("Enter student roll number: ");
        String rollNo = scanner.nextLine();
        boolean studentFound = false;

        for (Student student : students) {
            if (student.getRollNo().equals(rollNo)) {
                System.out.println(student);
                studentFound = true;
                break;
            }
        }
        
        if (!studentFound) {
            System.out.println("Student not found.");
        }
    }

    private static void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    private static void admitNewStudent(Scanner scanner) {
        scanner.nextLine(); 
        System.out.print("Enter roll number: ");
        String rollNo = scanner.nextLine();

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter date of birth (yyyy-MM-dd): ");
        String dobInput = scanner.nextLine();
        
        LocalDate dob = null;
        while (dob == null) {
            if (dobInput.matches("\\d{4}-\\d{2}-\\d{2}")) {
                dob = LocalDate.parse(dobInput);
            } else {
                System.out.println("Invalid date format. Please use yyyy-MM-dd.");
                System.out.print("Enter date of birth (yyyy-MM-dd): ");
                dobInput = scanner.nextLine();
            }
        }

        System.out.print("Enter subject (JAVA, DBT, ANGULAR, REACT, SE): ");
        String subjectString = scanner.nextLine();
        Subject subject = Subject.valueOf(subjectString.toUpperCase());

        System.out.print("Enter GPA: ");
        double gpa = scanner.nextDouble();
        scanner.nextLine(); 

        Student student = new Student(rollNo, name, dob, subject, gpa);
        students.add(student);
        System.out.println("Student admitted successfully.");
    }

    private static void cancelAdmission(Scanner scanner) {
        System.out.print("Enter roll number to cancel admission: ");
        String rollNo = scanner.nextLine();
        
        boolean studentFound = false;
        for (Student student : students) {
            if (student.getRollNo().equals(rollNo)) {
                students.remove(student);
                System.out.println("Admission cancelled.");
                studentFound = true;
                break;
            }
        }
        
        if (!studentFound) {
            System.out.println("Student not found.");
        }
    }

    private static void exitProgram() {
        storeStudentsToFile();
        System.out.println("Exiting... Student data saved.");
    }

    private static void loadStudentsFromFile() {
        List<Student> loadedStudents = SerDeSerUtils.restoreStudents(FILE_NAME);
        if (loadedStudents != null) {
            students = loadedStudents;
        }
    }

    private static void storeStudentsToFile() {
        SerDeSerUtils.storeStudents(students, FILE_NAME);
    }
}

