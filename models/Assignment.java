package models;

public class Assignment {
    private String title;
    private String question;

    public Assignment(String title, String question) {
        this.title = title;
        this.question = question;
    }

    public String getTitle() { return title; }
    public String getQuestion() { return question; }

    @Override
    public String toString() {
        return title + " - " + question;
    }
}
