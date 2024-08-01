package PositiveNegativeChallenge;

import java.text.DecimalFormat;

public class DecimalComparator {
    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(3.175, 3.176 );
    }
    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
        int dec = (int) (a * 1000);
        int dec2 = (int) (b * 1000);

        if (dec == dec2) {
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
            return false;
        }
    }
}
