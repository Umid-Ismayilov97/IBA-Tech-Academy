
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please, input the day of the week: ");
        String day = sc.nextLine();
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
            if ("Sunday".equals(day) || "sunday".equals(day) || "SUNDAY".equals(day)) {
                System.out.println("Your task is:" + schedule[0][1]);
                break;
            } else if ("Monday".equals(day) || "monday".equals(day) || "MONDAY".equals(day)) {
                System.out.println("Your task is:" + schedule[1][1]);
                break;
            } else if ("Tuesday".equals(day) || "tuesday".equals(day) || "TUESDAY".equals(day)) {
                System.out.println("Your task is:" + schedule[2][1]);
                break;
            } else if ("Wednesday".equals(day) || "wednesday".equals(day) || "WEDNESDAY".equals(day)) {
                System.out.println("Your task is:" + schedule[3][1]);
                break;
            } else if ("Thursday".equals(day) || "thursday".equals(day) || "THURSDAY".equals(day)) {
                System.out.println("Your task is:" + schedule[4][1]);
                break;
            } else if ("Friday".equals(day) || "friday".equals(day) || "FRIDAY".equals(day)) {
                System.out.println("Your task is:" + schedule[5][1]);
                break;
            } else if ("Saturday".equals(day) || "saturday".equals(day) || "SATURDAY".equals(day)) {
                System.out.println("Your task is:" + schedule[6][1]);
                break;
            } else if ("Exit".equals(day) || "exit".equals(day) || "EXIT".equals(day))
                break;
                else {
                System.out.println("Sorry, I don't understand you, please try again.");
            }
        }
        }



    }
