package Homework8;

import java.util.Set;

public class RoboCat extends Pet {
    public RoboCat(String nickname, Species species, int age, Set<String> habits) {
        super(nickname, species, age, habits);
    }
    @Override
    public void respond() {
        System.out.println("I am not just a robot and a cat.I am a robocat! ");
    }
}
