package Homework2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        String arr[][] = new String[6][6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if (i == 0) {
                    arr[i][j] = (j + " | ");
                } else if (j == 0) {
                    arr[i][j] = (i + " | ");
                } else {
                    arr[i][j] = ("- | ");
                }
            }

        }
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                System.out.print(arr[i][j]);
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
                arr[x][y] = "X | ";
                for (int i = 0; i < arr.length; i++) {
                    for (int j = 0; j < arr.length; j++) {
                        System.out.print(arr[i][j] );
                    }

                    System.out.println();
                }
                System.exit(0);
            } else {
                arr[x][y] = "* | ";
                for (int i = 0; i < arr.length; i++) {
                    for (int j = 0; j < arr.length; j++) {
                        System.out.print(arr[i][j] );
                    }

                    System.out.println();
                }
            }
        }
    }
}