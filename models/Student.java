package models;

import java.util.*;

public class Student {
    private String name;
    private String email;
    private String password;
    private List<Course> enrolledCourses = new ArrayList<>();
    private List<Submission> submissions = new ArrayList<>();

    public Student(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getName() { return name; }
    public String getEmail() { return email; }
    public boolean checkPassword(String pwd) { return this.password.equals(pwd); }

    public List<Course> getEnrolledCourses() { return enrolledCourses; }
    public List<Submission> getSubmissions() { return submissions; }

    public void enroll(Course course) { enrolledCourses.add(course); }
    public void addSubmission(Submission s) { submissions.add(s); }
}
