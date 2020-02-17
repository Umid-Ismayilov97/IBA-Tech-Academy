package Homework5;

public class Main {
    public static void main(String[] args) {

        Human mother = new Human("Anna","Stolone",1968,(2020-1968),90);

        System.out.printf("Mom: %s\n",mother.toString());
        Human father = new Human("Silvester","Stolone",1970,(2020-1970),88);
        System.out.printf("Dad: %s\n",father.toString());
        Human child = new Human("Judy","Stolone",2013,(2020-2013),80);
        System.out.printf("Child: %s\n",child.toString());







    }
}
