package PA303_5_1Loops;

public class TuitionPrediction {
    public static void main(String[] args) {
        double initialTuition = 10000;
        double targetTuition = initialTuition * 2;
        double tuition = initialTuition;
        int years = 0;

        while (tuition < targetTuition) {
            tuition *= 1.07; // Increase tuition by 7% each year
            years++;
        }

        System.out.println("It will take " + years + " years for the tuition to double.");
    }
}
