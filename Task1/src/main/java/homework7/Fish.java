package homework7;

public class Fish extends Pet {
    public Fish(String nickname) {
        super(nickname);
        setSpecies(Species.FISH);
    }
    @Override
    public void respond() {
        System.out.println("Blob-blob please feed me! ");
    }
}
