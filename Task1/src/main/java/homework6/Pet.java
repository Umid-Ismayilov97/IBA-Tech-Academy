package homework6;

import java.util.Arrays;
import java.util.Objects;

public class Pet {
    private Species species;

    private String nickname;

    private int age;

    private int trickLevel;

    private String[] habits;

    @Override

    protected void finalize() throws Throwable {

        System.out.println("/////////////////////////\nPet object is removed!");

        super.finalize();

    }

    public Pet(Species species, String nickname, int age) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
    }

    public Pet(Species species, String nickname, int age, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.habits = habits;
    }

    public void eat() {

        System.out.println("I am eating!");

    }

    public void respond() {

        System.out.printf("Hello, owner. I am - %s. I miss you!\n", nickname);

    }

    public void fuel() {

        System.out.println("I need to cover it up");

    }

    public boolean isSly() {

        return trickLevel > 50;

    }

    public Pet(Species species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    @Override

    public boolean equals(Object o) {

        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Pet pet = (Pet) o;

        return nickname.equals(pet.nickname);

    }
    @Override

    public int hashCode() {

        return Objects.hash(nickname);

    }


    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public String getNickname() {

        return nickname;

    }

    public void setNickname(String nickname) {

        this.nickname = nickname;

    }

    public int getAge() {

        return age;

    }

    public void setAge(int age) {

        this.age = age;

    }

    public int getTrickLevel() {

        return trickLevel;

    }

    public void setTrickLevel(int trickLevel) {

        this.trickLevel = trickLevel;

    }

    public String[] getHabits() {

        return habits;

    }

    public void setHabits(String[] habits) {

        this.habits = habits;

    }
    @Override
    public String toString() {
        return String.format("%s{nickname='%s', age=%d, habits=%s}", species, nickname, age, Arrays.toString(habits));
    }
}
