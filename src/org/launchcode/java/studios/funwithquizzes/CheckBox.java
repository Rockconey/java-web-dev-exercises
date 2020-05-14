package org.launchcode.java.studios.funwithquizzes;

import java.util.ArrayList;

public class CheckBox extends Question {
    private ArrayList<String> answerChoices = new ArrayList<>();
    private ArrayList<String> correctAnswers = new ArrayList<>();
    private int possibleCredit;



    public CheckBox(String value, int possibleCredit, String correctAnswers) {
        super(value, possibleCredit, correctAnswers);
    }

    public String toString() {
        StringBuilder options = new StringBuilder();
        for (String choice : answerChoices) {
            options.append(choice).append("\n");
        }
        return this.getValue() + "\n" + options + "\n";
    }

    public void addAnswer(String answer) {
            if (answerChoices.contains(answer)) {
                System.out.println("Answer already in list");
            } else {
                answerChoices.add(answer);
            }

    }

    public ArrayList<String> getAnswerChoices() {
        return answerChoices;
    }

    public void setAnswerChoices(ArrayList<String> answerChoices) {
        this.answerChoices = answerChoices;
    }

    public ArrayList<String> getCorrectAnswers() {
        return correctAnswers;
    }

    public void setCorrectAnswers(ArrayList<String> correctAnswers) {
        this.correctAnswers = correctAnswers;
    }

    @Override
    public int getPossibleCredit() {
        return possibleCredit;
    }

    @Override
    public void setPossibleCredit(int possibleCredit) {
        this.possibleCredit = possibleCredit;
    }
}
