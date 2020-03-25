package Homework8;

import java.util.Map;

public final class Man extends Human{

    public Man() {
    }

    public Man(String name, String surname, Map<String, String> schedule) {
        super(name, surname, schedule);
    }

    public Man(String name, String surname, int age, Map<String, String> schedule) {
        super(name, surname, age, schedule);
    }

    public void repairCar(){

        System.out.println(getName()+ " can fix this car!");

    }

    @Override
    public void greetPet() {

        System.out.println(getName()+" greets pet! ");

    }
}
