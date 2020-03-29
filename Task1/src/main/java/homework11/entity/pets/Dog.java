package homework11.entity.pets;


public class Dog extends Pet {
    public Dog(String nickname) {
        super(nickname);
    }

    @Override
    public void respond() {
        System.out.println("Hav-hav dot't disturb me! I can bite you! ");

    }
}