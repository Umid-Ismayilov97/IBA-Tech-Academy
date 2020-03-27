package homework9.entity.pets;

import java.util.Map;
import java.util.Set;

public class Fish extends Pet {

    public Fish(String nickname) {
        super(nickname);
    }


    @Override
    public void respond() {
        System.out.println("Blob-blob please feed me! ");
    }
}
