package Homework2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] array = new String[5][5];
        for (String[] arr : array) {
            Arrays.fill(arr, "-");
        }
        Random TargetGenerator = new Random();
        int TargetColumn = TargetGenerator.nextInt(5);
        int TargetRow = TargetGenerator.nextInt(5);
        System.out.println("All set. Get ready to rumble!");

        while (true) {
            System.out.println("Enter raw cordinate between 1 and 5:");
            int x = sc.nextInt() - 1;
            System.out.println("Enter column cordinate between 1 and 5:");
            int y = sc.nextInt() - 1;
            if (y == TargetRow && x == TargetColumn) {
                System.out.println("You have won!");
                array[x][y] = "x";
                System.out.print("0 | 1 | 2 | 3 | 4 | 5 |\n" +
                        "1 | " + array[0][0] + " | " + array[0][1] + " | " + array[0][2] + " | " + array[0][3] + " | " + array[0][4] + " |\n" +
                        "2 | " + array[1][0] + " | " + array[1][1] + " | " + array[1][2] + " | " + array[1][3] + " | " + array[1][4] + " |\n" +
                        "3 | " + array[2][0] + " | " + array[2][1] + " | " + array[2][2] + " | " + array[2][3] + " | " + array[2][4] + " |\n" +
                        "4 | " + array[3][0] + " | " + array[3][1] + " | " + array[3][2] + " | " + array[3][3] + " | " + array[3][4] + " |\n" +
                        "5 | " + array[4][0] + " | " + array[4][1] + " | " + array[4][2] + " | " + array[4][3] + " | " + array[4][4] + " |\n");
                System.exit(0);
            } else {
                array[x][y] = "*";
                System.out.print("0 | 1 | 2 | 3 | 4 | 5 |\n" +
                        "1 | " + array[0][0] + " | " + array[0][1] + " | " + array[0][2] + " | " + array[0][3] + " | " + array[0][4] + " |\n" +
                        "2 | " + array[1][0] + " | " + array[1][1] + " | " + array[1][2] + " | " + array[1][3] + " | " + array[1][4] + " |\n" +
                        "3 | " + array[2][0] + " | " + array[2][1] + " | " + array[2][2] + " | " + array[2][3] + " | " + array[2][4] + " |\n" +
                        "4 | " + array[3][0] + " | " + array[3][1] + " | " + array[3][2] + " | " + array[3][3] + " | " + array[3][4] + " |\n" +
                        "5 | " + array[4][0] + " | " + array[4][1] + " | " + array[4][2] + " | " + array[4][3] + " | " + array[4][4] + " |\n");

            }
        }
    }
}