package GLAB_303_2_2;

public class AutoTypeConversion {
    public static void main(String[] args) {
        int x = 20;
        double y = 40.5;
        long p = 30;
        float q = 10.60f;
        //  int z = x + y; (1) - error; cannot convert from double to int.
        double z = x + y;
        System.out.println("Sum of two numbers: " + z);
        //  long r = p - q; // (2) // error; cannot convert from float to long.
        float r = q - p;
        System.out.println("Sum of two numbers: " + r);

    }
}
