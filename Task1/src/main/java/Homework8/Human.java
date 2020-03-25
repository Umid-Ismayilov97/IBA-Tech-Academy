package Homework8;

import java.util.Map;
import java.util.Objects;

public class Human {
    private String name;
    private String surname;
    private Family family;
    private int age;
    private Map<String,String> schedule;

    public Human() {
    }

    public Human(String name, String surname, Map<String, String> schedule) {
        this.name = name;
        this.surname = surname;
        this.schedule = schedule;
    }

    public Human(String name, String surname, int age, Map<String, String> schedule) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.schedule = schedule;
    }

    public void greetPet () {
        System.out.println("Sorry!But i have not got any pet! ");
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Map<String, String> getSchedule() {
        return schedule;
    }

    public void setSchedule(Map<String, String> schedule) {
        this.schedule = schedule;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        Human human = (Human) o;
        return getAge() == human.getAge() &&
                getName().equals(human.getName()) &&
                getSurname().equals(human.getSurname()) &&
                getFamily().equals(human.getFamily()) &&
                getSchedule().equals(human.getSchedule());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), getFamily(), getAge(), getSchedule());
    }

    @Override
    public String toString() {
        return String.format("Human{name='%s', surname='%s', age=%d, schedule=%s}", name, surname, age, schedule);
    }
}
