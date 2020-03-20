package homework6;

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
        Pet pet1 = new Pet("Dog","Rick",3);

        Family family = new Family(mother, father,2);
        Family family1 = new Family(mother, father,2);

        //////Add children///////

        family.addChild(child);
        family.addChild(child1);
        System.out.println(family.toString());

        //////Garbage Collection///////
        child2=null;
        family1=null;
        pet=pet1;
        System.gc();

        ///////////DayOfWeek all values///////////

        for (DayOfWeek day : DayOfWeek.values())
            System.out.println(day);

        ///////////Enum DayOfWeek and Species///////////

        DayOfWeek day = DayOfWeek.MONDAY;
        switch(day) {
            case MONDAY:
                System.out.println("Today is Monday");
                break;
            case TUESDAY:
                System.out.println("Today is Tuesday");
                break;
            case WEDNESDAY:
                System.out.println("Today is Wednesday");
                break;
            case THURSDAY:
                System.out.println("Today is Thursday");
                break;
            case FRIDAY:
                System.out.println("Today is Friday");
                break;
            case SATURDAY:
                System.out.println("Today is Saturday");
                break;
            case SUNDAY:
                System.out.println("Today is Sunday");
                break;
        }

         Species species = Species.DOG;
        System.out.println("Our pet is " + species);

        //////Before delete children//////

        System.out.println("Count of family before delete:  "+family.countFamily());
        System.out.println("Count of children before delete:  "+family.countChildren());

        //////After delete children//////

        family.deleteChild(0);

        //If i input big index for Child array system give notfication.
        //Give 2 or more for indexOfChildrenArray and show this.

        System.out.println("Count of family after delete:  "+family.countFamily());
        System.out.println("Count of children after delete:  "+family.countChildren());

    }
}
