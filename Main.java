import models.*;
import services.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        CourseService courseService = new CourseService();
        AssignmentService assignmentService = new AssignmentService();

        Scanner scanner = new Scanner(System.in);
        Student currentStudent = null;

        while (true) {
            System.out.println("\n--- E-Learning Platform ---");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Select option: ");
            int option = scanner.nextInt();

            if (option == 1) {
                currentStudent = studentService.register(scanner);
            } else if (option == 2) {
                currentStudent = studentService.login(scanner);
            } else {
                break;
            }

            if (currentStudent != null) {
                while (true) {
                    System.out.println("\nWelcome, " + currentStudent.getName());
                    System.out.println("1. View Courses");
                    System.out.println("2. Enroll in Course");
                    System.out.println("3. Submit Assignment");
                    System.out.println("4. Track Progress");
                    System.out.println("5. Logout");
                    System.out.print("Choose: ");
                    int choice = scanner.nextInt();
                    scanner.nextLine();

                    switch (choice) {
                        case 1 -> courseService.displayCourses();
                        case 2 -> courseService.enroll(currentStudent, scanner);
                        case 3 -> assignmentService.submit(currentStudent, scanner);
                        case 4 -> assignmentService.trackProgress(currentStudent);
                        case 5 -> {
                            currentStudent = null;
                            break;
                        }
                    }

                    if (currentStudent == null) break;
                }
            }
        }

        System.out.println("Goodbye!");
        scanner.close();
    }
}
