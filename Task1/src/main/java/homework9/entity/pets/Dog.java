package homework9.entity.pets;

import java.util.Set;

public class Dog extends Pet{
    public Dog(String nickname, Species species, int age, Set<String> habits) {
        super(nickname, species, age, habits);
    }


    @Override
    public void respond() {
        System.out.println("Hav-hav dot't disturb me! I can bite you! ");

    }
}