package homework10.util;

import homework10.entity.Family;
import homework10.entity.Human;
import homework10.entity.Man;
import homework10.entity.Woman;
import homework10.entity.pets.*;

import java.util.*;

public class RandomComponents {

    public static List<String> manNames = Arrays.asList("Umid","Ismayil","Amin","Camal","Nasim","Perviz","Tofiq");

    public static List<String> surnames = Arrays.asList("Ismayilov","Mirzeliyev","Bagiropv","Abbasov","Agayev","Babayev","Mehdizade");

    public static List<String> womanNames = Arrays.asList("Aytac","Vefa","LeyLa","Fidan","Nermin","Ayten","Nazile");

    public static List<String> nicknames = Arrays.asList("Ayka","Puffy","I need Love","Pump","Chucky","Duck","Nazi");



    public static String getRandomManName(){

        return manNames.get((int)(Math.random() * manNames.size()));

    }

    public static String getRandomSurname(){

        return surnames.get((int)(Math.random() * surnames.size()));

    }

    public static String getRandomWomanName(){

        return womanNames.get((int)(Math.random() * womanNames.size()));

    }

    public static Man getRandomMan(){

        String name = getRandomManName();

        String surname = getRandomSurname();

        int year = 1950 + (int)(Math.random() * 51);

        int age = 2020 - year;

        int iq = 10 + (int)(Math.random() * 91);

        Map<String,String> schedule = Collections.emptyMap();

        return new Man(name,surname,year,age,iq,schedule);

    }

    public static Woman getRandomWoman(){

        String name = getRandomWomanName();

        String surname = getRandomSurname();

        int year = 1950 + (int)(Math.random() * 51);

        int age = 2020 - year;

        int iq = 10 + (int)(Math.random() * 91);

        Map<String,String> schedule = Collections.emptyMap();

        return new Woman(name,surname,year,age,iq,schedule);

    }

    public static Human getRandomHuman(){

        return ((int)(Math.random() * 2)) == 0 ? getRandomMan() : getRandomWoman();

    }

    public static Pet getRandomPet(){

        String nickname = nicknames.get((int)(Math.random() * nicknames.size()));

        int age = (int)(Math.random() * 8);

        int trickLevel = (int)(Math.random() * 100);

        Set<String> habits = Collections.EMPTY_SET;

        Pet pet;

        Species species = Species.values()[(int)(Math.random() * Species.values().length)];

        switch (species){

            case DOG: pet = new Dog(nickname);break;

            case FISH: pet = new Fish(nickname);break;

            case ROBOCAT: pet = new RoboCat(nickname);break;

            default: pet = new DomesticCat(nickname);break;

        }

        pet.setAge(age);

        pet.setHabits(habits);

        return pet;

    }

    public static Family getRandomFamily(){

        return new Family(getRandomWoman(),getRandomMan());

    }
}
