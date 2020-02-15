package Homework4;

import java.util.Arrays;

public class Human {
    public String name;
    public String surname;
    public int birthday;
    public int iqLevel;
    public Pet pet;
    public Human mother;
    public Human father;
    public String[] habit;

    public Human(String name, String surname, int birthday, int iqLevel, Pet pet, Human mother, Human father, String[] habit) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.iqLevel = iqLevel;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.habit = habit;
    }

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Human(String name, String surname, int birthday) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
    }

    public Human() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public int getIqLevel() {
        return iqLevel;
    }

    public void setIqLevel(int iqLevel) {
        this.iqLevel = iqLevel;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public String[] getHabit() {
        return habit;
    }

    public void setHabit(String[] habit) {
        this.habit = habit;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthday=" + birthday +
                ", iqLevel=" + iqLevel +
                ", pet=" + pet +
                ", mother=" + mother +
                ", father=" + father +
                ", habit=" + Arrays.toString(habit) +
                '}';
    }
}
