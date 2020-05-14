package org.launchcode.java.studios.funwithquizzes;

import java.util.ArrayList;

public abstract class Question {
    private ArrayList<String> correctAnswers;
    private String correctAnswer;
    private String value;
    private int possibleCredit;



    public Question(String value, int possibleCredit, String correctAnswer) {
        this.value = value;
        this.possibleCredit = possibleCredit;
        this.correctAnswer = correctAnswer;
    }

    public Question(String value, int possibleCredit, ArrayList<String> correctAnswers) {
        this.value = value;
        this.possibleCredit = possibleCredit;
        this.correctAnswers = correctAnswers;
    }

    public abstract String toString();


    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getPossibleCredit() {
        return possibleCredit;
    }

    public String getCorrectAnswer() { return correctAnswer; }

    public void setCorrectAnswer(String correctAnswer) { this.correctAnswer = correctAnswer; }

    public void setPossibleCredit(int possibleCredit) {
        this.possibleCredit = possibleCredit;
    }
}
