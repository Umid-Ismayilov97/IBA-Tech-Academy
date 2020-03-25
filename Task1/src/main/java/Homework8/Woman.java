package Homework8;

import java.util.Map;

public final class Woman extends Human {

    public Woman() {
    }

    public Woman(String name, String surname, Map<String, String> schedule) {
        super(name, surname, schedule);
    }

    public Woman(String name, String surname, int age, Map<String, String> schedule) {
        super(name, surname, age, schedule);
    }

    void makeUp () {
        System.out.println( getName()+ " good at make up! ");
    }

    @Override

    public void greetPet() {

        System.out.println(getName()+" greets pet! ");

    }
}
