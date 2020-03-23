package homework7;

public class DomesticCat extends Pet {
    public DomesticCat(String nickname) {
        super(nickname);
        setSpecies(Species.DOMESTICCAT);
    }
    @Override
    public void respond() {
        System.out.println("Myeau please smooth my hair! ");
    }
}
