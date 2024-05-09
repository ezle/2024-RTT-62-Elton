package Homework;

public class PA_303_2_3 {
    public static void main(String[] args) {
        int x = 2;  //  Assigning 2 to x
        System.out.println("Before shift: " + x + " in binary is " + Integer.toBinaryString(x));
        x = x << 1; //  Shifting x by 1 bit to the left
        System.out.println("After shift: " + x + " in binary is " + Integer.toBinaryString(x));
    }
}
