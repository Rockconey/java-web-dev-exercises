package exercises;

import java.util.ArrayList;

public class SumEven {
    public static Integer addItUp(ArrayList intNums) {
        int count = 0;
        for (int i = 0; i < intNums.size(); i++) {
            int num = (int) intNums.get(i);
            if (num % 2 == 0) {
                count += num;
            }
        }
        return count;
    }
}
