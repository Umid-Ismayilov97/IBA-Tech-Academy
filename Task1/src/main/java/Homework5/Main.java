package Homework5;

public class Main {
    public static void main(String[] args) {

        Human mother = new Human("Anna","Stolone",1968,(2020-1968),90,

                new String[][]{{"Sunday","go to museum"},

                        {"Monday","go to theatre"},

                        {"Tuesday","read a book"},

                        {"Wednesday","meet friends"},

                        {"Thursday","go to shopping center"},

                        {"Friday","prepare for the festival"},

                        {"Saturday","do whatever should be done"}});

        Human father = new Human("Silvester","Stolone",1970,(2020-1970),88,

                new String[][]{{"Sunday","go to gym"},

                        {"Monday","play football"},

                        {"Tuesday","go to work"},

                        {"Wednesday","go to football match"},

                        {"Thursday","rest"},

                        {"Friday","make a birthday party"},

                        {"Saturday","go to grandparent's home"}});

        Human child = new Human("Judy","Stolone",2013,(2020-2013),80,

                new String[][]{{"Sunday","make a new caps"},

                        {"Monday","play with friends"},

                        {"Tuesday","go to park"},

                        {"Wednesday","looking cartoon"},

                        {"Thursday","help mother"},

                        {"Friday","go to museum"},

                        {"Saturday","do something"}});


        System.out.printf("Mom: %s\n",mother.toString());

        System.out.printf("Dad: %s\n",father.toString());

        System.out.printf("Let's see are mom and dad in the same family: %s\n",

                String.valueOf(father.getFamily().equals(mother.getFamily())));


        System.out.printf("%s %s 's family %s\n",child.getName(),child.getSurname(),child.getFamily().toString());





    }
}
