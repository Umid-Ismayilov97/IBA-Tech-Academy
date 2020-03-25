package homework7;

public final class Woman extends Human {

    public Woman(String name, String surname) {
        super(name, surname);
    }

        void makeUp () {
            System.out.println( getName()+ " good at make up! ");
        }

    @Override

    public void greetPet() {

        System.out.println(getName()+" greets pet! ");

    }

}
