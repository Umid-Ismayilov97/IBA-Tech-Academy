package Homework5;

public class Main {
    public static void main(String[] args) {

        Human mother = new Human("Anna","Stolone",1968,(2020-1968),90);
        System.out.printf("Mom: %s\n",mother.toString());

        Human father = new Human("Silvester","Stolone",1970,(2020-1970),88);
        System.out.printf("Dad: %s\n",father.toString());

        Human child = new Human("Judy","Stolone",2013,(2020-2013),80);
        System.out.printf("Girl: %s\n",child.toString())
        ;
        Human child1 = new Human("Jamy","Stolone",2010,(2020-2010),85);
        System.out.printf("Boy: %s\n",child1.toString());

        Human child2 = new Human("Judy","Stolone",2013,(2020-2013),80);

        Pet pet = new Pet("Dog","Rick",3);

        Family family = new Family(mother, father, pet, 2);

        family.addChild(child);
        family.addChild(child1);

        System.out.println(family.toString());

        //////Equals checking//////

        System.out.println("Is child equals child1? " + child.equals(child1));
        System.out.println("Is child equals child2? " + child.equals(child2));

    }
}
