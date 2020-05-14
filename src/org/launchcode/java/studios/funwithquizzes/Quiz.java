package org.launchcode.java.studios.funwithquizzes;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz  {

    private ArrayList<Question> questions = new ArrayList<Question>();
    private Double score = 0.00;
    private String studentAnswer;
    private Question question;
    private ArrayList<String> answerKey = new ArrayList<>();
    private ArrayList<String>  studentAnswers = new ArrayList<>();




    public void addQuestion(Question question) {

        if (questions.contains(question)) {
            System.out.println("Question already exists on this quiz.");
        } else {
            questions.add(question);
            answerKey.add(question.getCorrectAnswer().toLowerCase());

            if (question instanceof MultipleChoice || question instanceof CheckBox) {
                System.out.println("Please add possible answers to question.");
            }
        }

    }

    public ArrayList<String> runQuiz() {
        Scanner input = new Scanner(System.in);
        for (Object question : questions) {
            System.out.println(question.toString());
            studentAnswer = input.nextLine();
            studentAnswers.add(studentAnswer.toLowerCase());

        }
        input.close();
        return studentAnswers;
    }

    public Double scoreQuiz() {
        score = 0.0;
        for (int i = 0; i < studentAnswers.size(); i++) {
            for (String answer : answerKey) {
                if (this.studentAnswers.get(i).equals(answer)) {
                    score += 1.0;
                }
            }
        }

        return score;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public ArrayList<String> getAnswerKey() {
        return answerKey;
    }

    public void setAnswerKey(ArrayList<String> answerKey) {
        this.answerKey = answerKey;
    }
    public void setStudentAnswers(String answers){ this.studentAnswers = studentAnswers; }

    public ArrayList<String> getStudentAnswers() {
        return studentAnswers;
    }
    public Double getScore(){
        return score;
    }
}
