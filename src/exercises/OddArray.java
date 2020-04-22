package exercises;

public class OddArray {
    public static void main(String[] args) {

        int[] numArr = new int[]{1, 1, 2, 3, 5, 8};

        for (int num : numArr) {
            System.out.println(num);

        }
        System.out.println("Now odd numbers only:");
        for (int i = 0; i <= numArr.length; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
