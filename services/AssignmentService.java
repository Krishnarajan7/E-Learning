package services;

import models.*;

import java.util.*;

public class AssignmentService {
    public void submit(Student student, Scanner scanner) {
        List<Course> enrolled = student.getEnrolledCourses();
        if (enrolled.isEmpty()) {
            System.out.println("You are not enrolled in any course.");
            return;
        }

        for (int i = 0; i < enrolled.size(); i++) {
            System.out.println((i + 1) + ". " + enrolled.get(i).getTitle());
        }

        System.out.print("Choose course: ");
        int courseIndex = scanner.nextInt() - 1;
        Course selectedCourse = enrolled.get(courseIndex);

        List<Assignment> assignments = selectedCourse.getAssignments();
        for (int i = 0; i < assignments.size(); i++) {
            System.out.println((i + 1) + ". " + assignments.get(i));
        }

        System.out.print("Choose assignment: ");
        int assignIndex = scanner.nextInt() - 1;
        scanner.nextLine();
        Assignment selectedAssignment = assignments.get(assignIndex);

        System.out.print("Enter your answer: ");
        String answer = scanner.nextLine();

        student.addSubmission(new Submission(selectedAssignment, answer));
        System.out.println("Submitted successfully!");
    }

    public void trackProgress(Student student) {
        List<Submission> submissions = student.getSubmissions();
        if (submissions.isEmpty()) {
            System.out.println("No submissions yet.");
        } else {
            for (Submission s : submissions) {
                System.out.println("Assignment: " + s.getAssignment().getTitle());
                System.out.println("Answer: " + s.getAnswer());
                System.out.println("------");
            }
        }
    }
}
