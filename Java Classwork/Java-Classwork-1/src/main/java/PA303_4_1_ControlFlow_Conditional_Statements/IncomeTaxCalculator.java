package PA303_4_1_ControlFlow_Conditional_Statements;

import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        // Define tax rates for different filing statuses
        final double[] SINGLE_RATES = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
        final double[] MARRIED_JOINTLY_RATES = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
        final double[] MARRIED_SEPARATELY_RATES = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
        final double[] HEAD_OF_HOUSEHOLD_RATES = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};

        // Define income brackets for tax rates
        final int[] INCOME_BRACKETS = {9700, 39475, 84200, 160725, 204100, 510300};

        // Prompt user to input filing status and income
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your filing status: ");
        System.out.println("1. Single");
        System.out.println("2. Married Filing Jointly");
        System.out.println("3. Married Filing Separately");
        System.out.println("4. Head of Household");
        int filingStatus = scanner.nextInt();

        System.out.println("Enter your taxable income: ");
        double income = scanner.nextDouble();

        // Calculate tax based on filing status and income
        double tax = 0.0;
        switch (filingStatus) {
            case 1:
                tax = calculateTax(income, SINGLE_RATES, INCOME_BRACKETS);
                break;
            case 2:
                tax = calculateTax(income, MARRIED_JOINTLY_RATES, INCOME_BRACKETS);
                break;
            case 3:
                tax = calculateTax(income, MARRIED_SEPARATELY_RATES, INCOME_BRACKETS);
                break;
            case 4:
                tax = calculateTax(income, HEAD_OF_HOUSEHOLD_RATES, INCOME_BRACKETS);
                break;
            default:
                System.out.println("Invalid filing status.");
                return;
        }

        // Display the calculated tax
        System.out.println("Your tax is: $" + tax);
    }

    // Function to calculate tax based on income and tax rates
    private static double calculateTax(double income, double[] rates, int[] brackets) {
        double tax = 0.0;
        int i = 0;
        while (income > 0) {
            double rate = rates[i];
            int bracket = brackets[i];
            if (income > bracket) {
                tax += bracket * rate;
                income -= bracket;
            } else {
                tax += income * rate;
                break;
            }
            i++;
        }
        return tax;
    }
}
