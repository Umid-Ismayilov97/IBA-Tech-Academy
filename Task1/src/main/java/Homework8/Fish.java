package Homework8;

import java.util.Map;
import java.util.Set;

public class Fish extends Pet {

    public Fish(String nickname, Species species, int age, Set<String> habits) {
        super(nickname, species, age, habits);
    }


    @Override
    public void respond() {
        System.out.println("Blob-blob please feed me! ");
    }
}
