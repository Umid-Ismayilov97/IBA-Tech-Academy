package Homework5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Human mother = new Human("Anna","Stolone",1968,(2020-1968),90);
        System.out.printf("Mom: %s\n",mother.toString());
        Human father = new Human("Silvester","Stolone",1970,(2020-1970),88);
        System.out.printf("Dad: %s\n",father.toString());
        Human child = new Human("Judy","Stolone",2013,(2020-2013),80);
        System.out.printf("Child: %s\n",child.toString());
        Human child1 = new Human("Judy","Stolone",2013,(2020-2013),80);

        /////Hash code checking/////

        List<Human> HumanList = new ArrayList<Human>();
        HumanList.add(mother);
        HumanList.add(father);
        HumanList.add(child);
        HumanList.add(child1);
        Set<Human> HumanSet = new HashSet<Human>();
        HumanSet.addAll(HumanList);
        System.out.println("List size: "+HumanList.size());
        System.out.println("Hash set size: "+HumanSet.size());

        //////Equals checking//////

        System.out.println("Is child equals child1? " + child.equals(child1));
        System.out.println("Is mother equals father? " + mother.equals(father));

    }
}
