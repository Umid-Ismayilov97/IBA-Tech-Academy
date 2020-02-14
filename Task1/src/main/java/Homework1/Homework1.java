package Homework1;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        int number;
        number = (int) (Math.random() * 100+1);
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        while(true) {
            System.out.println("Enter the number:");
            int a = sc.nextInt();
            if(a<number){
                System.out.println("Your number is too small. Please, try again.");
            }
            else if(a>number) {
                System.out.println("Your number is too big. Please, try again.");
            }
            else {
                System.out.println("Congratulations: "+name);
                break;
            }

        }
    }
}

