package Homework8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Map<String, String> schedule = new HashMap<>();

        schedule.put(DayOfWeek.SUNDAY.name()," Just rest");

        schedule.put(DayOfWeek.MONDAY.name()," Go to work");

        schedule.put(DayOfWeek.TUESDAY.name()," Go to work");

        schedule.put(DayOfWeek.WEDNESDAY.name()," Go to work");

        schedule.put(DayOfWeek.THURSDAY.name()," Go to work ");

        schedule.put(DayOfWeek.FRIDAY.name()," Go to work");

        schedule.put(DayOfWeek.SATURDAY.name()," Go to cinema and museum");

        Set<String> habits = new HashSet<>();
        habits.add("play with balls");
        habits.add("play with toys");

        Man man = new Man ("Rick","Grimes",44,schedule);
        System.out.println(man.toString());
        man.greetPet();
        man.repairCar();

        System.out.println();
        Woman woman = new Woman("Andy","Grimes",40,schedule);
        System.out.println(woman.toString());
        woman.greetPet();
        woman.makeUp();

        System.out.println();
        DomesticCat domesticCat = new DomesticCat("Garfield",Species.DOMESTICCAT,2,habits);
        System.out.println(domesticCat.toString());
        domesticCat.respond();
        domesticCat.eat();

        System.out.println();
        Dog dog = new Dog("Scobby",Species.DOG,3,habits);
        System.out.println(dog.toString());
        dog.respond();
        dog.eat();

        System.out.println();
        Fish fish = new Fish("Nemo",Species.FISH,1,habits);
        System.out.println(fish.toString());
        fish.respond();
        fish.eat();

        System.out.println();
        RoboCat roboCat = new RoboCat("Techno",Species.ROBOCAT,5,habits);
        System.out.println(roboCat.toString());
        roboCat.respond();
        roboCat.dontEat();

    }
}
