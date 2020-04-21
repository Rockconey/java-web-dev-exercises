package org.launchcode.java.studios.areaofacircle;

public class ValidityCheck {
    public static boolean validInput (Double dblRadius) {
        if (dblRadius < 0) {
            return false;
        } else {
            return true;
        }
    }
}
