package homework7;

public class Main {
    public static void main(String[] args) {
        Man man = new Man("Rick", "Grimes");
        man.repairCar();
        man.greetPet();

        System.out.println();
        Woman woman = new Woman("Anna", "Grimes");
        woman.makeUp();
        woman.greetPet();

        System.out.println();
        Dog dog = new Dog("Scooby");
        System.out.println("My name is "+dog.getNickname()+".");
        dog.respond();
        dog.eat();

        System.out.println();
        DomesticCat domesticCat = new DomesticCat("Garfield");
        System.out.println("My name is "+domesticCat.getNickname()+".");
        domesticCat.respond();
        domesticCat.eat();

        System.out.println();
        Fish fish = new Fish("Nemo");
        System.out.println("My name is "+fish.getNickname()+".");
        fish.respond();
        fish.eat();

        System.out.println();
        RoboCat roboCat = new RoboCat("Techno");
        System.out.println("My name is "+roboCat.getNickname()+".");
        roboCat.respond();
        roboCat.dontEat();

    }
}
