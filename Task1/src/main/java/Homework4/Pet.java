package Homework4;

import java.util.Arrays;

public class Pet {
    public String species;
    public String nickname;
    public int age;
    public int tricklevel;
    public String[] habits;

    public void eat() {
        System.out.println("I am eating!");
    }

    public void respond() {
        System.out.printf("Hello, owner. I am - %s. I miss you!\n", nickname);
    }

    public void foul() {
        System.out.println("I need to cover it up");
    }
    public void greetPet(){

        System.out.printf("Hello, %s\n",nickname);

    }
    public void describePet() {
        if (tricklevel > 50) {
            System.out.println("I have a "+species+",he is age "+age+" years old."+"He is very sly.");
        } else {
            System.out.println("I have a "+species+",he is age "+age+" years old."+"He is almost not sly.");
        }
    }
    public Pet(String species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    public Pet(String nickname, int age, int tricklevel, String habits[], String species) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.tricklevel = tricklevel;
        this.habits = habits;
    }
    public Pet() {
    }

    public String getSpecies() {
        return species;
    }

    public String getNickname() {
        return nickname;
    }

    public int getAge() {
        return age;
    }

    public int getTricklevel() {
        return tricklevel;
    }

    public String[] getHabits() {
        return habits;
    }

    @Override
    public String toString() {
        return "Rick{" +
                "species='" + species + '\'' +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", tricklevel=" + tricklevel +
                ", habits=" + Arrays.toString(habits) +
                '}';
    }
}