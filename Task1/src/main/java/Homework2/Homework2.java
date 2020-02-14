package Homework2;

import java.util.Scanner;

public class Homework2 {
    final static char targetSymbol = '#';
    final static char defaultCharacter = '-';
    final static char shootedSymbol = '*';
    final static char hittedSymbol = 'x';

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        char [][] table = new char[6][6];
        int xRaw = (int) (Math.random() * 5);
        int yColumn = (int) (Math.random() * 5);
        while(true){
            for (int i=0; i<6; i++){
                for (int j=0; j<6; j++){
                    int raw=(int)(Math.random()*5);
                    int col=(int)(Math.random()*5);
                    char template=table[i][j];
                    table[i][j]=table[raw][col];
                }
            }
            for (int i=0; i<6; i++){
                for (int j=0; j<6; j++){
                    System.out.print(table[i][j]);
                }System.out.println();
            }
            System.out.println("Enter raw cordinate between 1 and 5:");
            int x = sc.nextInt();
            System.out.println("Enter column cordinate between 1 and 5:");
            int y = sc.nextInt();

            if (x!=xRaw && y==yColumn){
                System.out.println(shootedSymbol);}
            else if (x==xRaw && y!=yColumn){
                System.out.println(shootedSymbol);}
            else if (x!=xRaw && y!=yColumn){
                System.out.println(shootedSymbol);}
               else {System.out.println(hittedSymbol);
               break;}


        }

    }

}

