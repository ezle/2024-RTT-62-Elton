package PositiveNegativeChallenge;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;    
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));  //  should return false
        System.out.println(isLeapYear(1600));   //  true 1600 is leap year
        System.out.println(isLeapYear(2017));   //  false 2017 is not leap year
        System.out.println(isLeapYear(2000));   //  True because 2000 is a leap year
    }
}
