package PA303_5_1Loops;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + "%4d");
            }
            System.out.println();
        }
    }
}
