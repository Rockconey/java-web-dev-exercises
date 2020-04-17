package exercises;
import java.util.Scanner;
import java.lang.Object;

public class Alice {
    public static void main(String[] args) {
        String firstLine = "Alice was beginning to get very tired of sitting by her sister on the bank," +
                " and of having nothing to do: once or twice she had peeped into the book her sister was" +
                " reading, but it had no pictures or conversations in it, 'and what is the use of a book,' " +
                "thought Alice 'without pictures or conversation?'";
        firstLine = firstLine.toLowerCase();

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your search term: ");

        String searchTerm = input.nextLine().toLowerCase();

        input.close();

        if (firstLine.contains(searchTerm)) {
            System.out.println("Search term found!" +
                    " Search term found at index: " + firstLine.indexOf(searchTerm) + " and" +
                    " the length of the search term is: " + searchTerm.length());
            String beginningOfLine = firstLine.substring(0, (firstLine.indexOf(searchTerm)));

            String endOfLine = firstLine.substring(firstLine.indexOf(searchTerm) + searchTerm.length(), (firstLine.length() - 1))
;

            String firstLineMod = beginningOfLine + endOfLine;
            System.out.println(firstLineMod);


//            String firstLineMod[] = firstLine.split(" ");
//            String backTogether = firstLineMod[0].concat(" " + firstLineMod[1]).concat(" " + firstLineMod[3]).
//                    concat(" " + firstLineMod[4]).concat(" " + firstLineMod[5]);
//            System.out.println(backTogether);
//            /*So, I could do it the above way, but that seems really clunky and inelegant.*/
//            String smartMod = firstLine.replace(searchTerm,"");
//            //With this way, I'm left with an empty spot which messes with the index.
//
//
//            System.out.println(smartMod);

//            String newArr[] = ArrayUtils.removeElement(firstLineMod, searchTerm);
            //I don't have this library, but it seems very handy.


        } else {
            System.out.println("Search term not found.");
        }



    }
}
