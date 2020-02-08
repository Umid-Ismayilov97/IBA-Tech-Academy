import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        if (a%2==0 && a%3==0) {
            System.out.println("Fizz and buzz");
    }
        if (a%2==0 && a%3!=0) {
            System.out.println("Fizz");}
           if(a%2!=0 && a%3==0)
            {System.out.println("Buzz"); }
        }}
