package Homework3;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String day;
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
        while(true) {
            System.out.println("Please, input the day of the week: ");
            day = sc.nextLine();
            if (day.equalsIgnoreCase("Sunday")) {
                System.out.println("Your task is:" + schedule[0][1]);
            } else if (day.equalsIgnoreCase("Monday")) {
                System.out.println("Your task is:" + schedule[1][1]);
            } else if (day.equalsIgnoreCase("Tuesday")) {
                System.out.println("Your task is:" + schedule[2][1]);
            } else if (day.equalsIgnoreCase("Wednesday")) {
                System.out.println("Your task is:" + schedule[3][1]);
            } else if (day.equalsIgnoreCase("Thursday")) {
                System.out.println("Your task is:" + schedule[4][1]);
            } else if (day.equalsIgnoreCase("Friday")) {
                System.out.println("Your task is:" + schedule[5][1]);
            } else if (day.equalsIgnoreCase("Saturday")) {
                System.out.println("Your task is:" + schedule[6][1]);
            } else if (day.equalsIgnoreCase("Exit"))
                break;
                else {
                System.out.println("Sorry, I don't understand you, please try again.");

            }
        }
        }



    }
