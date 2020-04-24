package org.launchcode.java.studios.countingcharacters;
import java.util.*;
import java.io.File;
import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {

        String sentence = "If the product of two terms is zero then common sense says " +
                "at least one of the two terms has to be zero to start with. So if " +
                "you move all the terms over to one side, you can put the quadratics " +
                "into a form that can be factored allowing that side of the equation " +
                "to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

//        File file =
//                new File("C:\\Users\\rockc\\Desktop\\Studio3 Text.txt");
//        Scanner input = new Scanner(file);
//        sentence = input.hasNextLine();




    Scanner input = new Scanner(System.in);
        System.out.println("What is your sentence? ");
        sentence = input.nextLine();
        input.close();

        char[] letters = sentence.toUpperCase().toCharArray();

        HashMap<Character, Integer> letterCount = new HashMap<>();

        for (Character letter : letters) {
            if (letterCount.containsKey(letter) && Character.isLetterOrDigit(letter)) {
                letterCount.put(letter, letterCount.get(letter) + 1);
            } else if (Character.isLetterOrDigit((letter))){
                letterCount.put(letter, 1);
            }
        }
//        Iterator<Character> iterator = letterCount.keySet().iterator();
//        while (iterator.hasNext()){
//            Character letter = iterator.next();
//            if (letter.toString().equals(" ") || letter.toString().equals(".") || letter.toString().equals(",") || letter.toString().equals("'")|| letter.toString().equals("?") || letter.toString().equals("!") || letter.toString().equals("1") || letter.toString().equals("2") || letter.toString().equals("3")|| letter.toString().equals("4")|| letter.toString().equals("5") || letter.toString().equals("0") || letter.toString().equals("6") || letter.toString().equals("7") || letter.toString().equals("8") || letter.toString().equals("9") || letter.toString().equals("-")){
//                iterator.remove(); } }
        //Used the iterator method above first, but it is problematic in that you have to hard code everything to exclude.




        for (Map.Entry<Character, Integer> letter : letterCount.entrySet()) {

            System.out.println(letter.getKey() + ": " + letter.getValue());

        }


    }
}

