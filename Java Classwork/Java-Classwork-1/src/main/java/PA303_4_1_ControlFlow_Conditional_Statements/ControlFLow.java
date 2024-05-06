package PA303_4_1_ControlFlow_Conditional_Statements;

import java.util.Scanner;


        //  1
public class ControlFLow {
    public static void main(String[] args) {
        int x = 7;
        if (x < 10) {
            System.out.println("Less than 10");
        }
        x = 15;

        // 2

        int y = 7;
        if (y < 10) {
            System.out.println("Less than 10");
        } else {
            System.out.println("Greater than or equal to 10");
        }
        y = 15;

        //  3

        int z = 15;
        if (z < 10) {
            System.out.println("Less than 10");
        } else if (z >= 10 && z < 20) {
            System.out.println("Between 10 and 20");
        } else {
            System.out.println("Greater than or equal to 20");
        }
        z = 50;

        //  4

        int a = 15;
        if (a < 10 || a > 20) {
            System.out.println("Out of range");
        } else {
            System.out.println("In range");
        }
        a = 5;

        //  5

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter score: ");
        int score = scanner.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("Score out of range");
        } else if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        //  6

        scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 7: ");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Out of range");
        }
    }
}
