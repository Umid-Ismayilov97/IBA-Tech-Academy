import java.util.Arrays;
import java.util.Scanner;

public class oddEven {
        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                System.out.print("Enter the size of array:");
                int SIZE = in.nextInt();
                int[] odd = new int[SIZE];
                int[] even = new int[SIZE];
                int[] combined = new int[SIZE * 2];
                //////////////////////////////
                for (int i = 0; i < SIZE; i++) {
                        even[i] = (int) (Math.random() * 100) * 2;
                        odd[i] = (int) (Math.random() * 100) * 2 + 1;
                }
                //////////////////
                for (int i = 0; i < SIZE; i++) {
                        combined[i * 2] = even[i];
                        combined[i * 2 + 1] = odd[i];
                }
                /////////////////
                System.out.printf("Evens: %s\n", Arrays.toString(even));
                System.out.printf("Odds: %s\n", Arrays.toString(odd));
                System.out.printf("Combined: %s\n", Arrays.toString(combined));
        }
}
