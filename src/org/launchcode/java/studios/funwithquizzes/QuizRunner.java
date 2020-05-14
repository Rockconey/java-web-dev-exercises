package org.launchcode.java.studios.funwithquizzes;

public class QuizRunner {

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
}
