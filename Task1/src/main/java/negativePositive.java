import java.util.Arrays;
import java.util.Scanner;

public class negativePositive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int SIZE = in.nextInt();
        int[] number = new int[SIZE];
        int[] positive = new int[SIZE];
        int[] combined = new int[SIZE * 2];
        for (int i = 0; i < SIZE; i++) {
            number [i] = (int) (Math.random() * (-100)*2+100);

        }
        System.out.printf("Numbers: %s\n", Arrays.toString(number));

    }
}
