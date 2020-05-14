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
        for (Object question : questions) {
            System.out.println(question.toString());
            Scanner input = new Scanner(System.in);
            studentAnswer = input.nextLine();
            studentAnswers.add(studentAnswer.toLowerCase());

        }
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

    public static void main(String[] args) {
        Quiz trial = new Quiz();
        MultipleChoice dogLegs = new MultipleChoice("How many legs do most dogs have?", 1, "3");
        TrueFalse dogsAreCute = new TrueFalse("Dogs are cute.", 6, "true");
        CheckBox dogBreeds = new CheckBox("Which of the following are dog breeds?", 2, "2, 4, 5");
        trial.addQuestion(dogLegs);
        dogLegs.addAnswer("1. Three");
        dogLegs.addAnswer("2. Five");
        dogLegs.addAnswer("3. Four");
        dogLegs.addAnswer("4. One");

        trial.addQuestion(dogsAreCute);
        dogsAreCute.addAnswer("true");
        dogsAreCute.addAnswer("false");

        trial.addQuestion(dogBreeds);
        dogBreeds.addAnswer("1. Cheeseburger");
        dogBreeds.addAnswer("2. Pekingese");
        dogBreeds.addAnswer("3. Demigorgon");
        dogBreeds.addAnswer("4. boxer");
        dogBreeds.addAnswer("5. pitbull");

        System.out.println(trial.runQuiz());
        System.out.println(trial.scoreQuiz());

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
