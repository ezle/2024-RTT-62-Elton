package org.example.GLAB303_2_1;

import java.text.DecimalFormat;

public class Homework303_2_1 {
    static final double SALES_TAX = 0.045;
    public static void main(String[] args) {


        //Write a program that declares two integer variables, assigns an integer to each, and adds them together.
        // Assign the sum to a variable. Print out the result.
        int num1 =10;
        int num2 =20;

        int sum = num1 + num2;

        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);

        // Write a program that declares two double variables, assings a number to each, and adds them together.
        // Assign the sum to a variable. print out the result.
        double d1 = 10.5d;
        double d2 = 20.5d;

        double dSum = d1 + d2;
        System.out.println(dSum);

        // Write a program that declares an integer variable and a double variable, assigns numbers to each, and adds
        // Assign the sum to a variable. Print out the result. What variable type must the sum be?
        int x = 30;
        double y = 50.55;

        double sum3 = x + y;
        System.out.println(sum3);

        //Write a program that declares two integer variables
        //Assign the result
        //What happens? What corrections are needed?
        int v1 = 4;
        int v2 = 2;

        double div = (double)v1 / (double)v2;
        System.out.println(div);

        //Write a program that declares two integer variables, x and y, and assigns the number 5 to x and the number 6 to y
        //Declare a variable q and assign y/x to it and print q. Now, cast y to a double and assign it to q. Print q again.



        //Write a program that declares a named constant and uses it in a calculation.
        Integer abc = null;
        abc = 150;

        double abcd = abc.doubleValue();


        //Write a program where you create three variables that represent products at a cafe.
        //The products could be beverages like coffee, cappuccino, espresso, green tea, etc.
        // Assign prices to each product. Create two more variables called subtotal and totalSale and
        // complete an “order” for three items of the first product, four items of the second product, and two items
        // of the third product. Add them all together to calculate the subtotal.
        // Create a constant called SALES_TAX and add sales tax to the subtotal to obtain the totalSale amount.
        // Be sure to format the results to two decimal places.


        double coffee = 2.50;
        double cappuccino = 3.50;
        double espresso = 4.50;

        double subtotal = (coffee * 3) + (cappuccino * 4) + (espresso * 2);
        double SALES = 0.09;

        double salesTaxAmount = subtotal * SALES_TAX;
        double totalAmount = subtotal + salesTaxAmount;

        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Subtotal : " + df.format(subtotal));
        System.out.println("Sales Tax : " + df.format(salesTaxAmount));
        System.out.println("Total Sale : " + df.format(totalAmount));



    }
}
