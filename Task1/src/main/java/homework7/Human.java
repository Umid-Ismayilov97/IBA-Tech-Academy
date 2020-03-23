package homework7;

import java.util.Objects;

public class Human {
    private String name;
    private String surname;
    private int age;
    private int year;

    public Human() {
    }

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Human (String name, String surname, int age, int year) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.year = year;
    }

    public void greetPet () {
        System.out.println("Sorry!But i have not got any pet! ");
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        Human human = (Human) o;
        return getAge() == human.getAge() &&
                getYear() == human.getYear() &&
                getName().equals(human.getName()) &&
                getSurname().equals(human.getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), getAge(), getYear());
    }

    @Override
    public String toString() {
        return String.format("Human{name='%s', surname='%s', age=%d, year=%d}", name, surname, age, year);
    }
}
