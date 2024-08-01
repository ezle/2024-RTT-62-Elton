package PositiveNegativeChallenge;

public class SpeedConverter {
    public static void main(String[] args) {
    printConversion(-5.6);
    }

    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour < 0) {
            return -1;
        } else {
            kilometersPerHour = kilometersPerHour / 1.609;
        }
        return Math.round(kilometersPerHour);
    }
    public static void printConversion(double kilometersPerHour) {
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        if (kilometersPerHour < 0) {
            System.out.println("Invalid value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mp/h");
        }
    }
}
