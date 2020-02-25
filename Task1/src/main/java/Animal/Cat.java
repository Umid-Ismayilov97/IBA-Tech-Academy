package Animal;

public class Cat extends Animal {
    public String name;

    public Cat(String name) {
        this.name = name;
    }
    public void name (){
        System.out.printf("Hello.I'm cat,my name is %s",name);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
