package homework11.entity.pets;

public class RoboCat extends Pet {
    public RoboCat(String nickname) {
        super(nickname);
    }

    @Override
    public void respond() {
        System.out.println("I am not just a robot and a cat.I am a robocat! ");
    }
}
