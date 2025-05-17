package services;

import models.Student;

import java.util.*;

public class StudentService {
    private final List<Student> students = new ArrayList<>();

    public Student register(Scanner scanner) {
        System.out.print("Name: ");
        String name = scanner.next();
        System.out.print("Email: ");
        String email = scanner.next();
        System.out.print("Password: ");
        String password = scanner.next();

        Student student = new Student(name, email, password);
        students.add(student);
        System.out.println("Registered successfully!");
        return student;
    }

    public Student login(Scanner scanner) {
        System.out.print("Email: ");
        String email = scanner.next();
        System.out.print("Password: ");
        String password = scanner.next();

        for (Student student : students) {
            if (student.getEmail().equals(email) && student.checkPassword(password)) {
                System.out.println("Login successful!");
                return student;
            }
        }

        System.out.println("Invalid credentials.");
        return null;
    }
}
