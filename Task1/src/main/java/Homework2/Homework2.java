package Homework2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] array = {{"0", "1", "2", "3", "4", "5"}, {"1", "-", "-", "-", "-", "-"},
                {"2", "-", "-", "-", "-", "-"}, {"3", "-", "-", "-", "-", "-"},
                {"4", "-", "-", "-", "-", "-"}, {"5", "-", "-", "-", "-", "-"}
        };

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " | ");
            }

            System.out.println();
        }
        Random TargetGenerator = new Random();
        int TargetColumn = TargetGenerator.nextInt(5) + 1;
        int TargetRaw = TargetGenerator.nextInt(5) + 1;
        System.out.println("All set. Get ready to rumble!");
        while (true) {
            System.out.println("Enter raw cordinate between 1 and 5:");
            int x = sc.nextInt();
            System.out.println("Enter column cordinate between 1 and 5:");
            int y = sc.nextInt();
            if (x < 1 || x > 5 || y < 1 || y > 5) {
                System.out.println("Please enter the number again.");
            } else if (x == TargetRaw && y == TargetColumn) {
                System.out.println("You have won!");
                array[x][y] = "x";
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array.length; j++) {
                        System.out.print(array[i][j] + " | ");
                    }

                    System.out.println();
                }
                System.exit(0);
            } else {
                array[x][y] = "*";
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array.length; j++) {
                        System.out.print(array[i][j] + " | ");
                    }

                    System.out.println();
                }
            }
        }
    }
}