package org.launchcode.java.studios.areaofacircle;

public class NumberCheck {
    public static boolean notNumber(String strRadius, Double dblRadius) {

        if (strRadius != null) {
            try {
                double d = Double.parseDouble(dblRadius);
            } catch (NumberFormatException nfe) {
                return false;
            }
            return true;
        } else {
            return true;
        }
    }
}




//        if (strRadius.length() == 0) {
//
//            System.out.println("Error: Invalid input. Cannot compute radius.");
//        }
//        try {
//            Double radCheck = Double.parseDouble(strRadius);
//            System.out.println(radCheck);
//        } catch (InputMismatchException ims) {
//            return false;
//        }
//        return true;

