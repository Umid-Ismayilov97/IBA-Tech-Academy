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
        dog.respond();
        dog.eat();

        System.out.println();
        DomesticCat domesticCat = new DomesticCat("Garfield");
        domesticCat.respond();
        domesticCat.eat();

        System.out.println();
        Fish fish = new Fish("Nemo");
        fish.respond();
        fish.eat();

        System.out.println();
        RoboCat roboCat = new RoboCat("Techno");
        roboCat.respond();
        roboCat.dontEat();

    }
}
