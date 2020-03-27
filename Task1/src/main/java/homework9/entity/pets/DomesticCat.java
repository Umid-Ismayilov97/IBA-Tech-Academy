package homework9.entity.pets;

import java.util.Set;

public class DomesticCat extends Pet {
    public DomesticCat(String nickname) {
        super(nickname);
    }

    @Override
    public void respond() {
        System.out.println("Myeau please smooth my hair! ");
    }
}
