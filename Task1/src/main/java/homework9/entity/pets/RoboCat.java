package homework9.entity.pets;

import java.util.Set;

public class RoboCat extends Pet {
    public RoboCat(String nickname) {
        super(nickname);
    }

    @Override
    public void respond() {
        System.out.println("I am not just a robot and a cat.I am a robocat! ");
    }
}
