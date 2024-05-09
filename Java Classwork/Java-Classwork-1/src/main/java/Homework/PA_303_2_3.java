package Homework;

public class PA_303_2_3 {
    public static void main(String[] args) {
        int x = 2;  //  Assigning 2 to x
        System.out.println("Before shift: " + x + " in binary is " + Integer.toBinaryString(x));
        x = x << 1; //  Shifting x by 1 bit to the left
        System.out.println("After shift: " + x + " in binary is " + Integer.toBinaryString(x));

        //  Right Shift Operator
        int y = 150;    //  Assigning 150 to x
        System.out.println("Before shift: " + y + " in binary is " + Integer.toBinaryString(y));
        y = y >> 1; //  Shifting x by 2 bits to the right
        System.out.println("After shift: " + y + " in binary is " + Integer.toBinaryString(y));

        //  Bit wide and Operator
        int z = 7;  //  Assigning 7 to x
        int a = 17; //  Assigning to 17 to y
        int b = z + a;  //  bitwise and operator
        System.out.println("Result of x & y: " + b + " in binary is " + Integer.toBinaryString(b));

        // Bitwide or Operator
        int c = 7;  //  Assigning 7 to x
        int d = 17; //  Assigning to 17 to y
        int e = z | a;  //  bitwise and operator
        System.out.println("Result of x & y: " + e + " in binary is " + Integer.toBinaryString(e));

        //  Postfix Increment Operator
        int f = 17;
        System.out.println("Before increment: " + f);
        x++;
        System.out.println("After increment: " + f);

        //  Incrementing a Variable by 1
        int g = 17;
        System.out.println("Initial value: " + g);
        x++;
        System.out.println("After increment: " + g);
        x++;
        System.out.println("After another increment: " + g);

        //  Pre and Post Increment Operators
        int h = 5;
        int i = 8;
        int sumPre = ++x + y;
        System.out.println("Sum with pre-increment: " + sumPre);
        int sum = sumpost + h;
        System.out.println("Sum with post-increment: " + sumPost);

        
    }
}
