package Homework5;

import java.util.Objects;

public class Human {
    private String name;

    private String surname;

    private int year;

    private int age;

    private int iq;

    private Family family;

    private String[][] schedule;
    public Human(String name, String surname, int year, int age, int iq, String[][] schedule) {

        this.name = name;

        this.surname = surname;

        this.year = year;

        this.age = age;

        this.iq = iq;

        this.schedule = schedule;

    }

    public Human(String name, String surname, int year, int age, int iq) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.age = age;
        this.iq = iq;
    }
    public Human(String name, String surname) {

        this.name = name;

        this.surname = surname;

    }

    public Human(){}


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


    public int getYear() {

        return year;

    }


    public void setYear(int year) {

        this.year = year;

    }


    public int getAge() {

        return age;

    }


    public void setAge(int age) {

        this.age = age;

    }


    public int getIq() {

        return iq;

    }

    public void setIq(int iq) {

        this.iq = iq;

    }

    public Family getFamily() {

        return family;

    }

    public void setFamily(Family family) {

        this.family = family;

    }

    public String getScheduleAsAString(){

        StringBuilder sb = new StringBuilder();

        for (String[] x: schedule) {

            for (String s: x) {

                sb.append(s).append(" ");

            }

            sb.append(",");
        }

        return sb.toString();

    }

    public String[][] getSchedule() {

        String[][] temp = new String[schedule.length][schedule[0].length];

        for (int i = 0; i < schedule.length ; i++) {

            for (int j = 0; j < schedule[i].length; j++) {

                temp[i][j] = schedule[i][j];

            }

        }

        return temp;

    }


    public void setSchedule(String[][] schedule) {

        String temp[][] = new String[schedule.length][schedule[0].length];

        for (int i = 0; i < schedule.length ; i++) {

            for (int j = 0; j < schedule[i].length; j++) {

                temp[i][j] = schedule[i][j];

            }

        }
        this.schedule = temp;

    }
    @Override

    public int hashCode() {

        return Objects.hash(year);

    }
    @Override

    public boolean equals(Object o) {

        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Human human = (Human) o;

        return year == human.year;

    }
    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", age=" + age +
                ", iq=" + iq +
                '}';
    }
}
