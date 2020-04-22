package exercises;
import java.util.Arrays;

public class StringArray {
    public static void main (String[] args) {
        String str = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] strArr = str.split(" ");

        for (int i = 0; i < strArr.length; i++){
            System.out.println(strArr[i]);
        }

        System.out.println(Arrays.toString(strArr));

        String[] sentenceStr = str.split("\\.");

        System.out.println(Arrays.toString(sentenceStr));
    }
}
