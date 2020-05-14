package org.launchcode.java.studios.funwithquizzes.Test;



import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.studios.funwithquizzes.MultipleChoice;
import org.launchcode.java.studios.funwithquizzes.Quiz;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class QuizTest {
    @Before
            public void createMultipleChoiceObject() {
        MultipleChoice dogLegs = new MultipleChoice("How many legs do most dogs have?", 1, "2");
        ArrayList<String> answerChoices = new ArrayList<>();
        dogLegs.addAnswer("1. 2");
        dogLegs.addAnswer("2. 4");
        dogLegs.addAnswer("3. 1");
        dogLegs.addAnswer("2");
        dogLegs.addAnswer("4. 3");
    }
    MultipleChoice dogLegs = new MultipleChoice("How many legs do most dogs have?", 1,"2");

    @Test
    public void constructorCorrectlySetsAllFields() {
        assertEquals("How many legs do most dogs have?", dogLegs.getValue());
        assertEquals(1, dogLegs.getPossibleCredit(), .001);
    }

    @Test
    public void addAnswerCorrectlyAddsAnswerToAnswerArray() {
        MultipleChoice dogLegs = new MultipleChoice("How many legs do most dogs have?", 1, "2");
        ArrayList<String> answerChoices = new ArrayList<>();
        dogLegs.addAnswer("2");
        dogLegs.addAnswer("4");
        dogLegs.addAnswer("1");
        dogLegs.addAnswer("2");
        dogLegs.addAnswer("3");
        assertEquals("2", dogLegs.getAnswerChoices(0));
        assertEquals("4", dogLegs.getAnswerChoices(1));
        assertEquals("1", dogLegs.getAnswerChoices(2));
        assertFalse(dogLegs.getAnswerChoices(3).equals("2"));

    }

    @Test
    public void correctAnswerIsCorrect() {
        Quiz trial = new Quiz();
        MultipleChoice dogLegs = new MultipleChoice("How many legs do dogs usually have?", 1, "4");
        trial.addQuestion(dogLegs);
        dogLegs.addAnswer("2");
        dogLegs.addAnswer("4");
        dogLegs.addAnswer("1");
        dogLegs.addAnswer("2");
        dogLegs.addAnswer("3");
        trial.setStudentAnswers("4");
        assertFalse(trial.getAnswerKey().equals(trial.getStudentAnswers()));
//        assertEquals(1.0,trial.getScore(), .001);

    }

}
