package homework10.entity.pets;

public class DomesticCat extends Pet {
    public DomesticCat(String nickname) {
        super(nickname);
    }

    @Override
    public void respond() {
        System.out.println("Myeau please smooth my hair! ");
    }
}
