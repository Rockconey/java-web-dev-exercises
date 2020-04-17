package exercises;
import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the rectangle's width: ");
        int width = input.nextInt();
        System.out.println("What is the rectangle's length: ");
        int length = input.nextInt();
        input.close();

        int area = width*length;
        System.out.println("The rectangle has an area of: " + area);
    }
}
