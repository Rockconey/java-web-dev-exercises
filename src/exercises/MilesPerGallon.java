package exercises;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Miles driven: ");
        double miles = input.nextDouble();
        System.out.println("Amount of gas used: ");
        double gasUsed = input.nextDouble();
        input.close();
        double milesPerGallon = miles/gasUsed;
        System.out.println("You got " + milesPerGallon + " miles per gallon.");
    }
}
