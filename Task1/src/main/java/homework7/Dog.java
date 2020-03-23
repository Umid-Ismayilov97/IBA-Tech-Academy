package homework7;

public class Dog extends Pet{
    public Dog(String nickname) {
        super(nickname);
        setSpecies(Species.DOG);
    }

    @Override
    public void respond() {
        System.out.println("Hav-hav dot't disturb me! I can bite you! ");

    }
}
