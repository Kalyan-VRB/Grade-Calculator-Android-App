package com.example.creditdetails;

public class SubjectCredits {
    String subjectName;
    double subjectCredits;

    public SubjectCredits() {
    }

    public SubjectCredits(String subjectName, double subjectCredits) {
        this.subjectName = subjectName;
        this.subjectCredits = subjectCredits;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public double getSubjectCredits() {
        return subjectCredits;
    }

    public void setSubjectCredits(double subjectCredits) {
        this.subjectCredits = subjectCredits;
    }
}
