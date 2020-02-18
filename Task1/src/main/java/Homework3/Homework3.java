package Homework3;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String[][] schedule = new String[7][2];
        schedule[0][0] = "Sunday";
        schedule[0][1] = "Do home work";
        schedule[1][0] = "Monday";
        schedule[1][1] = "Go to courses; watch a film";
        schedule[2][0] = "Tuesday";
        schedule[2][1] = "Go to the meeting";
        schedule[3][0] = "Wednesday";
        schedule[3][1] = "Go to the museum";
        schedule[4][0] = "Thursday";
        schedule[4][1] = "Go to the football match";
        schedule[5][0] = "Friday";
        schedule[5][1] = "Go to the doctor";
        schedule[6][0] = "Saturday";
        schedule[6][1] = "Go to the grandparents' home";
        String day;
        boolean days = true;
        while(days) {
            System.out.println("Please, input the day of the week: ");
            day = sc.nextLine();
            switch (day.toLowerCase()) {
                case "sunday":
                    System.out.println("Your task is:" + schedule[0][1]);
                    break;
                case "monday":
                    System.out.println("Your task is:" + schedule[1][1]);
                    break;
                case "tuesday":
                    System.out.println("Your task is:" + schedule[2][1]);
                    break;
                case "wednesday":
                    System.out.println("Your task is:" + schedule[3][1]);
                    break;
                case"Thursday":
                    System.out.println("Your task is:" + schedule[4][1]);
                    break;
                case "friday":
                    System.out.println("Your task is:" + schedule[5][1]);
                    break;
                case "saturday":
                    System.out.println("Your task is:" + schedule[6][1]);
                    break;
                case "exit":
                    days=false;
                    break;
                default:
                    System.out.println("Sorry, I don't understand you, please try again.");

            }
        }
    }
    }
