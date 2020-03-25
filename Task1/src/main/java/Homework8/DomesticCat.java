package Homework8;


import java.util.Set;

public class DomesticCat extends Pet {
    public DomesticCat(String nickname, Species species, int age, Set<String> habits) {
        super(nickname, species, age, habits);
    }

    @Override
    public void respond() {
        System.out.println("Myeau please smooth my hair! ");
    }
}
