package Animal;

public class Dog extends Animal {
    public String name;

    public Dog(String name) {
        this.name = name;
    }
    public void name (){
        System.out.printf("Hello.I'm dog,my name is %s",name);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
