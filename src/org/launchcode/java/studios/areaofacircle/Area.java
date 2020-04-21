package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the radius of your circle?");
        String strRadius = input.nextLine();
        input.close();
        if (strRadius.equals("") || strRadius.equals(" ")) {
            System.out.println("Error: Invalid input. Cannot compute area.");
        }
        boolean isNumber = NumberCheck.isNumber(strRadius);
        if (!isNumber) {
            System.out.println("Error: Invalid input. Cannot compute area.");
        }
        Double dblRadius = Double.valueOf(strRadius);
        boolean isValid = ValidityCheck.validInput(dblRadius);

//        while (!isValid){
//            System.out.println("Error: Please enter a positive number: ");
//            input = new Scanner(System.in);
//            dblRadius = input.nextDouble();
//            input.close();
//            break;
//        } I can't get this to work because I'm getting exceptions and haven't figured out how to catch them yet.

        if(!isValid){
            System.out.println("Error: Invalid input. Cannot compute area.");
        } else {
            double area = Circle.getArea(dblRadius);


            System.out.println("The area of your circle is " + area + ".");
        }
    }
}
