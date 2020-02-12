import java.util.Scanner;

public class IfTask {
    public static void main(String[] args) {
        System.out.println("How old are you?");
       Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        if (age<18){
            System.out.println("You can go to the cinema ");}
            else System.out.println("You can go to the night club");
    }

    }

