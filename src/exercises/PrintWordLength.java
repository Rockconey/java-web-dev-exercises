package exercises;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class PrintWordLength {

    public static String lengthIs (List<String> wordList) {
        String word = null;
        Scanner input = new Scanner(System.in);
        System.out.println("What length word would you like to find?");
        Integer wordLength = input.nextInt();
        input.close();

        for (int i = 0; i < wordList.size(); i++) {
            word = (String) wordList.get(i);
            if (word.length() == wordLength){
                System.out.println(word);
            }

        }



        return word;
    }
}
