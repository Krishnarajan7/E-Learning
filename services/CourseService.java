package services;

import models.*;

import java.util.*;

public class CourseService {
    private final List<Course> courses = new ArrayList<>();

    public CourseService() {
        // Sample data
        Course c1 = new Course("Java Basics", "Learn the fundamentals of Java");
        c1.addAssignment(new Assignment("Intro Assignment", "Explain OOP in Java"));
        courses.add(c1);

        Course c2 = new Course("Data Structures", "Arrays, LinkedLists, Trees");
        c2.addAssignment(new Assignment("DSA Assignment", "Implement LinkedList"));
        courses.add(c2);
    }

    public void displayCourses() {
        System.out.println("\nAvailable Courses:");
        for (int i = 0; i < courses.size(); i++) {
            System.out.println((i + 1) + ". " + courses.get(i));
        }
    }

    public void enroll(Student student, Scanner scanner) {
        displayCourses();
        System.out.print("Select course number to enroll: ");
        int choice = scanner.nextInt();
        if (choice >= 1 && choice <= courses.size()) {
            Course selected = courses.get(choice - 1);
            student.enroll(selected);
            System.out.println("Enrolled in " + selected.getTitle());
        } else {
            System.out.println("Invalid choice.");
        }
    }

    public List<Course> getCourses() {
        return courses;
    }
}
