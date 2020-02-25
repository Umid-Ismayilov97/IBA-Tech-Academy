package Animal;

import Homework4.Human;

import java.util.ArrayList;

public class Animal {
    public ArrayList<Animal> animalName;
    public static void main(String[] args) {
        Dog dog= new Dog ("Rick");
        System.out.println();

        dog.name();
        Cat cat = new Cat ("Andy");
        System.out.println();
        cat.name();
        Dragon dragon = new Dragon("Dracaris");
        System.out.println();
        dragon.name();
        Fish fish = new Fish("Booble");
        System.out.println();
        fish.name();
    }
}
