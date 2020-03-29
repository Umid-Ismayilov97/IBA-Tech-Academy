package homework11;

import homework11.entity.Human;
import homework9.controller.FamilyController;
import homework9.entity.pets.Dog;
import homework9.util.RandomComponents;


public class Main {

    public static void main(String[] args) {

        Human adoptedChild = new Human("Carl","Grimes",2002,18,90);

        System.out.println(adoptedChild);

        FamilyController controller = new FamilyController();

        //creating  families

        for (int i = 0; i < 3 ; i++) {

            controller.createNewFamily(RandomComponents.getRandomMan(), RandomComponents.getRandomWoman());

        }

        //showing families

        controller.displayAllFamilies();

        //child born

        controller.bornAChild(controller.getFamilyById(0),"Alonzo","Resmiyye");

        System.out.printf("\nBorned child: %s\n\n",controller.getFamilyById(0).getChildren().get(0));

        //adding pet

        Dog dog1 = new Dog("Scooby");

        controller.addPet(0,dog1);

        //adopting child

        homework9.entity.Human child = RandomComponents.getRandomHuman();

        controller.adoptChild(controller.getFamilyById(0),child);

        controller.displayAllFamilies();

        System.out.printf("Number of families with 4 people: %d\n\n",

                controller.countFamiliesWithMemberNumber(4));

        System.out.printf("Number of families more than 2 people: %d\n\n",

                controller.getFamiliesBiggerThan(2).size());

        System.out.printf("Families less than 4 people: %s\n\n",

                controller.getFamiliesLessThan(4));

        System.out.println("After deleting children over 15");

        controller.deleteAllChildrenOlderThan(15);

        controller.displayAllFamilies();

        System.out.printf("Pets of family 0: %s\n",controller.getPets(0));
    }

}