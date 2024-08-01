package PositiveNegativeChallenge;

public class EqualSumChecker {
    public static void main(String[] args) {
        hasEqualSum(1, -1, 0);
    }
    public static boolean hasEqualSum(int a, int b, int c) {
        if ((a + b) == c) {
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
            return false;
        }
    }
}
