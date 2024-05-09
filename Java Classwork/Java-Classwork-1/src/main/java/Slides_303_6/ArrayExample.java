package Slides_303_6;

import java.util.ArrayList;
import java.util.List;

public class ArrayExample {

    public static void main(String[] args) {

        //  Can create variable and new array in line too
        double[] dArray = new double[10];

        //  This is also a valid way of creating a new array not that
        //  It is on 2 lines. First creates the variable, 2nd creates the new array in memory
        String[] sArray = new String[10];

        String s = new String( "New String");

        //  This is 99% of what you will use in the future.
        //  List<Double> is the parent type
        int[] iArray;
        iArray = new int[20];

        //  This gets used a bit from time to time
        //  The compiler will see this and create an array of strings with the size of 3 and puts the 3
        //  values in the array
        String[] constants = { "String1", "String2", "String3", "String4", "String5" };
        //  New style for loop can be used with arrays
        for (String constant : constants) {
            System.out.println(constant);
        }


        //  This is the same as doing the above
        String[] c1 = new String[3];
        c1[0] = "String1";
        c1[1] = "String2";
        c1[2] = "String3";


        //  This also works for other date types
        int[] intConstant = { 1, 2, 3, 4, 5 };
        for ( int pos = 0; pos < intConstant.length; pos++ ) {
            System.out.println(intConstant[pos]);
        }


        //  Getting the length of an array is simply using . length
        int x = intConstant.length;

        String g = new String( "New String");
        s.length(); //  Will give us the size of the string

        //  This is 99% of what you will use in the future
        List<Double> dList = new ArrayList<Double>();
    }
}
