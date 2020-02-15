package Homework4;

public class main {
    public static void main(String[] args) {
    Pet dog = new Pet ("Rick",5,75,new String[]{"eat","drink","sleep"},"dog");
        dog.eat();
        dog.respond();
        dog.foul();
        System.out.println(dog.toString());
        Human mother = new Human("Jane" ,"Karleone");
        Human father = new Human("Vita" ,"Karleone");;
        Pet p = new Pet ("dog", "Rick");

        Human dad=new Human("Michael","Karleone",1977,90,new Pet ("dog", "Rick"),
                new Human("Jane" ,"Karleone"),new Human("Vita" ,"Karleone"),
                new String[]{"eat","drink","sleep"});
        System.out.println(dad.toString());
        Human mommy=new Human("Isabel","Karleone",1980);
        System.out.println(mommy.toString());
        Human child=new Human("Anna","Karleone",2005);
        System.out.println(child.toString());
        Pet Rick=new Pet ("Rick",5,75,new String[]{"eat","drink","sleep"},"dog");
        Rick.greetPet();
        Rick.describePet();
}
}
