package Animal;

public class Fish extends Animal {
    public String name;

    public Fish(String name) {
        this.name = name;
    }
    public void name (){
        System.out.printf("Hello.I'm fish,my name is %s",name);
    }

    @Override
    public String toString() {
        return "Fish{" +
                "name='" + name + '\'' +
                '}';
    }
}
