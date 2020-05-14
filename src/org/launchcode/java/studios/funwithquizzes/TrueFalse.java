package org.launchcode.java.studios.funwithquizzes;

import java.util.ArrayList;

public class TrueFalse extends Question {
    private ArrayList<String> answerChoices = new ArrayList<>();
    private String correctAnswer;

    public TrueFalse(String value, int possibleCredit, String correctAnswer) {
        super(value, possibleCredit, correctAnswer);
    }


    public void addAnswer(String answer) {
        if (answerChoices.contains(answer)) {
            System.out.println("Answer already in list");
        } else {
            answerChoices.add(answer);
        }
    }

    public String toString() {
        StringBuilder options = new StringBuilder();
        for (String choice : answerChoices) {
            options.append(choice).append("\n");
        }
        return this.getValue() + "\n" + options + "\n";
    }

    public <index> String getAnswerChoices(int x) {
        return answerChoices.get(x);
    }


}
