package homework10.entity.pets;

public class Fish extends Pet {

    public Fish(String nickname) {
        super(nickname);
    }


    @Override
    public void respond() {
        System.out.println("Blob-blob please feed me! ");
    }
}
