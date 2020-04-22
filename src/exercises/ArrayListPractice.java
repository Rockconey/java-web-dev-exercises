package exercises;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPractice {
    public static void main (String[] args) {
        ArrayList<Integer> intNums = new ArrayList<>();
        intNums.add(5);
        intNums.add(4);
        intNums.add(6);
        intNums.add(8);
        intNums.add(1);
        intNums.add(3);
        intNums.add(2);
        intNums.add(9);
        intNums.add(7);
        intNums.add(10);

       Integer sum = SumEven.addItUp(intNums);
       System.out.println(sum);

       ArrayList<String> wordList = new ArrayList<>();
       wordList.add("smoke");
       wordList.add("detroit");
       wordList.add("lovers");
       wordList.add("only");
       wordList.add("jarmusch");
       wordList.add("write");
       wordList.add("milky");
       wordList.add("zoroastrianism");


//       PrintWordLength.lengthIs(wordList);

        String str = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String strNoComm = str.replaceAll(",", "");
        strNoComm = strNoComm.replaceAll("\\.", "");
        String[] strArr = strNoComm.split(" ");
        List<String> seussList = Arrays.asList(strArr);

        PrintWordLength.lengthIs(seussList);

        }



}
