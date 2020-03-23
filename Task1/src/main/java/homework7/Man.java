package homework7;

public class Man extends Human{

    public Man(String name, String surname) {
        super(name, surname);
    }


    public void repairCar(){

        System.out.println(getName()+ " can fix this car!");

    }

    @Override

    public void greetPet() {

        System.out.println(getName()+" greets pet! ");

    }
}
