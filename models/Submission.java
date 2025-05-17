package models;

public class Submission {
    private Assignment assignment;
    private String answer;

    public Submission(Assignment assignment, String answer) {
        this.assignment = assignment;
        this.answer = answer;
    }

    public Assignment getAssignment() { return assignment; }
    public String getAnswer() { return answer; }
}
