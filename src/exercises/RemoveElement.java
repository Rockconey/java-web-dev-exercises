package exercises;
import java.util.Arrays;

public class RemoveElement {
    public static String[] removeIt (String[] arr, String key){
        int index = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] != key) {
                arr[index++] = arr[i];
            }
        }

        return Arrays.copyOf(arr, index);
    }
}
