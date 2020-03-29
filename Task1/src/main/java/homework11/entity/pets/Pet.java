package homework11.entity.pets;

import java.util.Objects;
import java.util.Set;

public class Pet {
    private String nickname;
    private Species species;
    private int age;
    private Set<String> habits;

    public Pet() {
    }

    public Pet(String nickname) {

        this.nickname = nickname;

        setSpecies(Species.UNKNOWN);

    }

    public Pet(String nickname, Species species, Set<String> habits) {
        this.nickname = nickname;
        this.species = species;
        this.habits = habits;
    }

    public Pet(String nickname, Species species, int age, Set<String> habits) {
        this.nickname = nickname;
        this.species = species;
        this.age = age;
        this.habits = habits;
    }

    public void eat(){

        System.out.println(getNickname()+" is eating meal! ");

    }

    public void dontEat () {
        System.out.println(getNickname() + " eats nothing! Because it is robot! ");
    }

    public void respond() {

    }

    public void fuel(){

        System.out.println("I need to cover it up");

    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Set<String> getHabits() {
        return habits;
    }

    public void setHabits(Set<String> habits) {
        this.habits = habits;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pet)) return false;
        Pet pet = (Pet) o;
        return getAge() == pet.getAge() &&
                getNickname().equals(pet.getNickname()) &&
                getSpecies() == pet.getSpecies() &&
                getHabits().equals(pet.getHabits());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNickname(), getSpecies(), getAge(), getHabits());
    }

    @Override
    public String toString() {
        return String.format("Pet{nickname='%s', species=%s, age=%d, habits=%s}", nickname, species, age, habits);
    }
}