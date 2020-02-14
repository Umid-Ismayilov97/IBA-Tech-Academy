package Homework4;

import java.util.Arrays;

public class Human {
    public String name;
    public String surname;
    public int birthday;
    public int iqLevel;
    public String pet;
    public String mother;
    public String father;
    public String[] habit;

    public Human(String name, String surname, int birthday, int iqLevel, String pet, String mother, String father, String[] habit) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.iqLevel = iqLevel;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.habit = habit;
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

    public String getPet() {
        return pet;
    }

    public void setPet(String pet) {
        this.pet = pet;
    }

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String[] getHabit() {
        return habit;
    }

    public void setHabit(String[] habit) {
        this.habit = habit;
    }

    public String[] getHabits() {
        return habit;
    }

    public void setHabits(String[] habits) {
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
                ", mother='" + mother + '\'' +
                ", father='" + father + '\'' +
                ", habit=" + Arrays.toString(habit) +
                '}';
    }
}
