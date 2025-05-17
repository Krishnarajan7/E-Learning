package models;

import java.util.*;

public class Course {
    private String title;
    private String description;
    private List<Assignment> assignments = new ArrayList<>();

    public Course(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public List<Assignment> getAssignments() { return assignments; }

    public void addAssignment(Assignment assignment) {
        assignments.add(assignment);
    }

    @Override
    public String toString() {
        return title + ": " + description;
    }
}
